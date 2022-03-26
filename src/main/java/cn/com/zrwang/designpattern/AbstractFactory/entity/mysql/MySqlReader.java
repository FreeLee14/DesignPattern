package cn.com.zrwang.designpattern.AbstractFactory.entity.mysql;

import cn.com.zrwang.designpattern.AbstractFactory.entity.Reader;

/**
 * @author wzr
 */
public class MySqlReader extends Reader
{
    @Override
    public void read()
    {
        System.out.println("mysql 执行sql语句对象已创建成功");
    }
}
