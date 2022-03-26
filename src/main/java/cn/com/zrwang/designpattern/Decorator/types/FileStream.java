package cn.com.zrwang.designpattern.Decorator.types;

import cn.com.zrwang.designpattern.Decorator.abstarcts.Stream;


/**
 * @author wzr
 *  文件流
 */
public class FileStream extends Stream
{
    @Override
    public void read()
    {
        System.out.println("进行读取文件操作");
        super.read();
    }
}
