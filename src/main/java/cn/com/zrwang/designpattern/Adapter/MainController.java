package cn.com.zrwang.designpattern.Adapter;

import cn.com.zrwang.designpattern.Adapter.adapter.Adapter;
import cn.com.zrwang.designpattern.Adapter.interfaces.impl.OldInterfaceImpl;

public class MainController
{
    public static void main(String[] args)
    {
        OldInterfaceImpl old = new OldInterfaceImpl();
        Adapter adapter = new Adapter(old);
        adapter.Process();
    }
}
