package cn.com.zrwang.designpattern.Observer.device;

import cn.com.zrwang.designpattern.Observer.entity.AlarmInfo;
import cn.com.zrwang.designpattern.Observer.interfaces.AlarmListener;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wzr
 * 主服务器节点
 */
public class MainServer
{
    public List<AlarmListener> listeners;
    private AlarmInfo info;
    
    public MainServer()
    {
    }
    
    public MainServer(int lNum)
    {
        listeners = new ArrayList<>(lNum);
    }
    
    /**
     * 运行方法
     */
    public void running()
    {
        try
        {
            // 假设运行了5s之后
            Thread.sleep(5_000);
            // 发生了运行时异常
            int a = 1 / 0;
        }
        catch (Exception e)
        {
            info = new AlarmInfo();
            info.setAlarmId(1);
            info.setMsg("alarm");
            info.setTime(LocalDateTime.now().toString());
            for (AlarmListener listener : listeners)
            {
                listener.receive(info);
            }
            System.out.println("发送完毕");
            e.printStackTrace();
        }
    }
    
    /**
     * 添加监听者
     * @param listener
     */
    public void addListener(AlarmListener listener)
    {
        listeners.add(listener);
    }
    
    /**
     * 去除监听者
     * @param listener
     */
    public void removeListener(AlarmListener listener)
    {
        listeners.remove(listener);
    }
}
