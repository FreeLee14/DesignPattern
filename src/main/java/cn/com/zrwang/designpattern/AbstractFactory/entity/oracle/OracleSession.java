package cn.com.zrwang.designpattern.AbstractFactory.entity.oracle;

import cn.com.zrwang.designpattern.AbstractFactory.entity.Session;

/**
 * @author wzr
 */
public class OracleSession extends Session
{
    @Override
    public void session()
    {
        System.out.println("Oracle 会话对象已创建成功！！");
    }
}
