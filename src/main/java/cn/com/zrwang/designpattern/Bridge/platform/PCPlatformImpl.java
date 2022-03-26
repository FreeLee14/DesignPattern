package cn.com.zrwang.designpattern.Bridge.platform;

import cn.com.zrwang.designpattern.Bridge.abstracts.PlatformImpl;

/**
 * @author wzr
 * 电脑平台
 */
public class PCPlatformImpl extends PlatformImpl
{
    
    @Override
    public void sound()
    {
        System.out.println("dung的一声");
    }
    
    @Override
    public void drawn()
    {
        System.out.println("一个大苹果logo");
    }
    
    @Override
    public void sendText()
    {
        System.out.println("我是苹果电脑");
    }
}
