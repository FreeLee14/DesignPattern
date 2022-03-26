package cn.com.zrwang.designpattern.Bridge.abstracts;

/**
 * @author wzr
 *  平台功能基类
 */
public abstract class Platform
{
    public PlatformImpl platformImp;
    
    public Platform(PlatformImpl platformImp)
    {
        this.platformImp = platformImp;
    }
    
    /**
     * 登陆
     **/
    public abstract void login();
    
    /**
     * 连接
     **/
    public abstract void connect();
    
    /**
     * 传送
     **/
    public abstract void transfer();
    
}
