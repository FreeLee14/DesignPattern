package cn.com.zrwang.designpattern.Decorator.function;

import cn.com.zrwang.designpattern.Decorator.abstarcts.DecoratorStream;
import cn.com.zrwang.designpattern.Decorator.abstarcts.Stream;

/**
 * @author wzr
 * 有加密功能的流
 */
public class EncryptStream extends DecoratorStream
{
    public EncryptStream(Stream stream)
    {
        super(stream);
    }
    
    @Override
    public void read()
    {
        System.out.println("开始对流进行加密");
        stream.read();
    }
}
