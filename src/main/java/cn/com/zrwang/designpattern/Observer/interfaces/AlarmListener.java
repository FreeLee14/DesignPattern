package cn.com.zrwang.designpattern.Observer.interfaces;

import cn.com.zrwang.designpattern.Observer.entity.AlarmInfo;

/**
 * @author wzr
 * 报警监听接口
 */
public interface AlarmListener
{
    /**
     * 接收报警方法
     * @param info
     */
    void receive(AlarmInfo info);
}
