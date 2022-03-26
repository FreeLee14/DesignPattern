package cn.com.zrwang.designpattern.AbstractFactory.factory;

import cn.com.zrwang.designpattern.AbstractFactory.entity.Connection;
import cn.com.zrwang.designpattern.AbstractFactory.entity.Reader;
import cn.com.zrwang.designpattern.AbstractFactory.entity.Session;
import cn.com.zrwang.designpattern.AbstractFactory.entity.mysql.MySqlConnection;
import cn.com.zrwang.designpattern.AbstractFactory.entity.mysql.MySqlReader;
import cn.com.zrwang.designpattern.AbstractFactory.entity.mysql.MySqlSession;

/**
 * @author wzr
 */
public class MySqlFactory implements FactoryInterface
{
    @Override
    public Connection createConnection()
    {
        return new MySqlConnection();
    }
    
    @Override
    public Session createSession()
    {
        return new MySqlSession();
    }
    
    @Override
    public Reader createReader()
    {
        return new MySqlReader();
    }
}
