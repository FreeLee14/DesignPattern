package cn.com.zrwang.designpattern.Adapter.adapter;

import cn.com.zrwang.designpattern.Adapter.interfaces.OldInterface;
import cn.com.zrwang.designpattern.Adapter.interfaces.TargetInterface;

/**
 * @author wzr
 *  适配器类
 */
public class Adapter implements TargetInterface
{
    private OldInterface oldInterface;
    
    public Adapter(OldInterface oldInterface)
    {
        this.oldInterface = oldInterface;
    }
    
    @Override
    public void Process()
    {
        oldInterface.step1();
        oldInterface.step2();
    }
}
