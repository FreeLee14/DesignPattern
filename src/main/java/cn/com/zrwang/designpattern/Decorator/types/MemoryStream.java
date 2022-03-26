package cn.com.zrwang.designpattern.Decorator.types;

import cn.com.zrwang.designpattern.Decorator.abstarcts.Stream;

/**
 * @author wzr
 * 内存流
 */
public class MemoryStream extends Stream
{
    @Override
    public void read()
    {
        System.out.println("进行内存访问操作");
        super.read();
    }
}
