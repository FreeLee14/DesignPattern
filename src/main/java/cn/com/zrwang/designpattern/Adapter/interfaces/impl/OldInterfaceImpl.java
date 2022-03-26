package cn.com.zrwang.designpattern.Adapter.interfaces.impl;

import cn.com.zrwang.designpattern.Adapter.interfaces.OldInterface;

/**
 * @author wzr
 * 老接口实现类
 */
public class OldInterfaceImpl implements OldInterface
{
    @Override
    public void step1()
    {
        System.out.println("执行第一步");
    }
    
    @Override
    public void step2()
    {
        System.out.println("执行第二步");
        step3();
    }
    
    @Override
    public void step3()
    {
        System.out.println("执行第三步");
    }
}
