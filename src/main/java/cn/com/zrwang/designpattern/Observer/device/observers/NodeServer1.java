package cn.com.zrwang.designpattern.Observer.device.observers;

import cn.com.zrwang.designpattern.Observer.entity.AlarmInfo;
import cn.com.zrwang.designpattern.Observer.interfaces.AlarmListener;

/**
 * @author wzr
 * 监听者1
 */
public class NodeServer1 implements AlarmListener
{
    
    @Override
    public void receive(AlarmInfo info)
    {
        System.out.println("the listener 1 receive the alarm info is ");
        System.out.println(info.toString());
    }
}
