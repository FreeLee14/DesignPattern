package cn.com.zrwang.designpattern.Bridge.abstracts;

/**
 * @author wzr
 * 业务方向基类
 */
public abstract class PlatformImpl
{
    /**
     * 发出声音
     **/
    public abstract void sound();
    
    
    /**
     * 绘画
     **/
    public abstract void drawn();
    
    
    /**
     * 发送消息
     **/
    public abstract void sendText();
    
    
}
