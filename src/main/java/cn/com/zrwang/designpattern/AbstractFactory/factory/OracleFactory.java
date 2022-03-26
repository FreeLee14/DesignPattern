package cn.com.zrwang.designpattern.AbstractFactory.factory;

import cn.com.zrwang.designpattern.AbstractFactory.entity.Connection;
import cn.com.zrwang.designpattern.AbstractFactory.entity.Reader;
import cn.com.zrwang.designpattern.AbstractFactory.entity.Session;
import cn.com.zrwang.designpattern.AbstractFactory.entity.oracle.OracleConnection;
import cn.com.zrwang.designpattern.AbstractFactory.entity.oracle.OracleReader;
import cn.com.zrwang.designpattern.AbstractFactory.entity.oracle.OracleSession;

/**
 * @author wzr
 */
public class OracleFactory implements FactoryInterface
{
    @Override
    public Connection createConnection()
    {
        return new OracleConnection();
    }
    
    @Override
    public Session createSession()
    {
        return new OracleSession();
    }
    
    @Override
    public Reader createReader()
    {
        return new OracleReader();
    }
}
