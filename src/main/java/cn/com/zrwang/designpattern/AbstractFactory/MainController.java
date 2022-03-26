package cn.com.zrwang.designpattern.AbstractFactory;

import cn.com.zrwang.designpattern.AbstractFactory.entity.Connection;
import cn.com.zrwang.designpattern.AbstractFactory.entity.Reader;
import cn.com.zrwang.designpattern.AbstractFactory.entity.Session;
import cn.com.zrwang.designpattern.AbstractFactory.factory.FactoryInterface;
import cn.com.zrwang.designpattern.AbstractFactory.factory.MySqlFactory;

/**
 * @author wzr
 */
public class MainController
{
    private FactoryInterface factoryInterface;
    public MainController()
    {}
    
    public MainController(FactoryInterface factoryInterface)
    {
        this.factoryInterface = factoryInterface;
    }
    
    public static void main(String[] args)
    {
        MainController mainController = new MainController(new MySqlFactory());
        Connection connection = mainController.factoryInterface.createConnection();
        connection.connect();
        Session session = mainController.factoryInterface.createSession();
        session.session();
        Reader reader = mainController.factoryInterface.createReader();
        reader.read();
        
    }
    
    
}
