package cn.com.zrwang.designpattern.Observer.entity;

/**
 * @author wzr
 * 报警信息
 */
public class AlarmInfo
{
    private int alarmId;
    
    private String msg;
    
    private String time;
    
    public int getAlarmId()
    {
        return alarmId;
    }
    
    public void setAlarmId(int alarmId)
    {
        this.alarmId = alarmId;
    }
    
    public String getMsg()
    {
        return msg;
    }
    
    public void setMsg(String msg)
    {
        this.msg = msg;
    }
    
    public String getTime()
    {
        return time;
    }
    
    public void setTime(String time)
    {
        this.time = time;
    }
    
    @Override
    public String toString()
    {
        return "AlarmInfo{" +
            "alarmId=" + alarmId +
            ", msg='" + msg + '\'' +
            ", time='" + time + '\'' +
            '}';
    }
}
