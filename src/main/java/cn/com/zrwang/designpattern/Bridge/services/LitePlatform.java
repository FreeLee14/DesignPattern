package cn.com.zrwang.designpattern.Bridge.services;

import cn.com.zrwang.designpattern.Bridge.abstracts.Platform;
import cn.com.zrwang.designpattern.Bridge.abstracts.PlatformImpl;

/**
 * @author wzr
 * 经典平台
 */
public class LitePlatform extends Platform
{
    
    public LitePlatform(PlatformImpl platformImp)
    {
        super(platformImp);
    }
    
    @Override
    public void login()
    {
        platformImp.sound();
        System.out.println("经典系统》》》》》登陆成功");
    }
    
    @Override
    public void connect()
    {
        platformImp.drawn();
        System.out.println("经典系统》》》》》连接成功");
    }
    
    @Override
    public void transfer()
    {
        platformImp.sendText();
        System.out.println("经典系统》》》》》》发送成功");
    }
}
