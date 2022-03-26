package cn.com.zrwang.designpattern.AbstractFactory.entity.mysql;

import cn.com.zrwang.designpattern.AbstractFactory.entity.Connection;

/**
 * @author wzr
 */
public class MySqlConnection extends Connection
{
    @Override
    public void connect()
    {
        System.out.println("mysql 连接对象创建成功！！");
    }
}
