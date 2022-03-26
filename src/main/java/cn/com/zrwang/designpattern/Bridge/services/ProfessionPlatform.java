package cn.com.zrwang.designpattern.Bridge.services;

import cn.com.zrwang.designpattern.Bridge.abstracts.Platform;
import cn.com.zrwang.designpattern.Bridge.abstracts.PlatformImpl;

/**
 * @author wzr
 *  专业平台
 */
public class ProfessionPlatform extends Platform
{
    public ProfessionPlatform(PlatformImpl platformImp)
    {
        super(platformImp);
    }
    
    @Override
    public void login()
    {
        platformImp.sound();
        platformImp.drawn();
        System.out.println("专业系统》》》》》登陆成功");
    }
    
    @Override
    public void connect()
    {
        platformImp.drawn();
        System.out.println("专业系统》》》》》连接成功");
        platformImp.sound();
    }
    
    @Override
    public void transfer()
    {
        platformImp.sendText();
        System.out.println("专业系统》》》》》发生成功");
        platformImp.sound();
    }
}
