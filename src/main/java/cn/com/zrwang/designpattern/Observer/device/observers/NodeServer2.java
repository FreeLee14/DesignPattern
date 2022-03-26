package cn.com.zrwang.designpattern.Observer.device.observers;

import cn.com.zrwang.designpattern.Observer.entity.AlarmInfo;
import cn.com.zrwang.designpattern.Observer.interfaces.AlarmListener;

/**
 * @author wzr
 * 节点服务器2
 */
public class NodeServer2 implements AlarmListener
{
    @Override
    public void receive(AlarmInfo info)
    {
        System.out.println("the listener 2 receive the alarm info is ");
        System.out.println(info.toString());
    }
}
