package cn.com.zrwang.designpattern.Observer;

import cn.com.zrwang.designpattern.Observer.device.MainServer;
import cn.com.zrwang.designpattern.Observer.device.observers.NodeServer1;
import cn.com.zrwang.designpattern.Observer.device.observers.NodeServer2;

public class MainController
{
    public static void main(String[] args)
    {
        // 声明主服务器和从服务器
        MainServer mainServer = new MainServer(10);
        NodeServer1 nodeServer1 = new NodeServer1();
        NodeServer2 nodeServer2 = new NodeServer2();
        mainServer.addListener(nodeServer1);
        mainServer.addListener(nodeServer2);
        // 主服务器开始运行
        mainServer.running();
    }
}
