package cn.com.zrwang.designpattern.AbstractFactory.factory;

import cn.com.zrwang.designpattern.AbstractFactory.entity.Connection;
import cn.com.zrwang.designpattern.AbstractFactory.entity.Reader;
import cn.com.zrwang.designpattern.AbstractFactory.entity.Session;

/**
 * @author wzr
 *  工厂具备方法的接口
 */
public interface FactoryInterface
{
    public Connection createConnection();
    
    public Session createSession();
    
    public Reader createReader();
}
