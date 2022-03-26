package cn.com.zrwang.designpattern.AbstractFactory.entity.oracle;

import cn.com.zrwang.designpattern.AbstractFactory.entity.Reader;

public class OracleReader extends Reader
{
    @Override
    public void read()
    {
        System.out.println("Oracle 执行sql语句对象已创建成功");
    }
}
