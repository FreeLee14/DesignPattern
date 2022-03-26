package cn.com.zrwang.designpattern.AbstractFactory.entity.oracle;

import cn.com.zrwang.designpattern.AbstractFactory.entity.Connection;

public class OracleConnection extends Connection
{
    @Override
    public void connect()
    {
        System.out.println("oracle 连接对象创建成功！！");
    }
}
