package cn.com.zrwang.designpattern.AbstractFactory.entity.mysql;

import cn.com.zrwang.designpattern.AbstractFactory.entity.Session;

/**
 * @author wzr
 */
public class MySqlSession extends Session
{
    @Override
    public void session()
    {
        System.out.println("mysql 会话对象已创建成功！！");
    }
}
