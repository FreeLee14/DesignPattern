package cn.com.zrwang.designpattern.Bridge.platform;

import cn.com.zrwang.designpattern.Bridge.abstracts.PlatformImpl;

/**
 * @author wzr
 * 手机平台
 */
public class MobilePlatformImpl extends PlatformImpl
{
    
    @Override
    public void sound()
    {
        System.out.println("手机的滴了咚～声");
    }
    
    @Override
    public void drawn()
    {
        System.out.println("一个苹果的logo");
    }
    
    @Override
    public void sendText()
    {
        System.out.println("我是苹果手机");
    }
}
