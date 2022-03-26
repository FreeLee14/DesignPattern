package cn.com.zrwang.designpattern.Decorator.abstarcts;

/**
 * @author wzr
 * 中间类
 */
public class DecoratorStream extends Stream
{
    public Stream stream;
    
    public DecoratorStream(Stream stream)
    {
        this.stream = stream;
    }
}
