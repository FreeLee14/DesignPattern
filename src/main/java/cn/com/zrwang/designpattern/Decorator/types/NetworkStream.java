package cn.com.zrwang.designpattern.Decorator.types;

import cn.com.zrwang.designpattern.Decorator.abstarcts.Stream;

/**
 * @author wzr
 * 网络流
 */
public class NetworkStream extends Stream
{
    @Override
    public void read()
    {
        System.out.println("进行网络请求操作");
        super.read();
    }
}
