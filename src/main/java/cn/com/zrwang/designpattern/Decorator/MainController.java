package cn.com.zrwang.designpattern.Decorator;

import cn.com.zrwang.designpattern.Decorator.function.BufferedStream;
import cn.com.zrwang.designpattern.Decorator.function.EncryptStream;
import cn.com.zrwang.designpattern.Decorator.types.FileStream;

public class MainController
{
    public static void main(String[] args)
    {
        FileStream fileStream = new FileStream();
        // 此时是缓冲文件流
        BufferedStream bufferedStream = new BufferedStream(fileStream);
        // 再进行动态嵌套 得到加密缓冲文件流
        EncryptStream encryptStream = new EncryptStream(bufferedStream);
    
        encryptStream.read();
    }
}
