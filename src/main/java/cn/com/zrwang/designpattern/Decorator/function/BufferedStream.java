package cn.com.zrwang.designpattern.Decorator.function;

import cn.com.zrwang.designpattern.Decorator.abstarcts.DecoratorStream;
import cn.com.zrwang.designpattern.Decorator.abstarcts.Stream;

/**
 * @author wzr
 * 有缓存功能的流
 */
public class BufferedStream extends DecoratorStream
{
    
    public BufferedStream(Stream stream)
    {
        super(stream);
    }
    
    @Override
    public void read()
    {
        stream.read();
        System.out.println("将IO流数据存入缓冲区，稍后统一进行操作");
    }
}
