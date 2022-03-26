package cn.com.zrwang.designpattern.Bridge;

import cn.com.zrwang.designpattern.Bridge.platform.MobilePlatformImpl;
import cn.com.zrwang.designpattern.Bridge.services.LitePlatform;
import cn.com.zrwang.designpattern.Bridge.services.ProfessionPlatform;

public class MainController
{
    public static void main(String[] args)
    {
        MobilePlatformImpl mobilePlatform = new MobilePlatformImpl();
        // 通过桥接模式，组合出了一个手机平台的经典系统流程
        LitePlatform litePlatform = new LitePlatform(mobilePlatform);
        litePlatform.login();
        litePlatform.connect();
        litePlatform.transfer();
        // 通过桥接模式，组合出了一个手机平台的专业系统流程
        ProfessionPlatform professionPlatform = new ProfessionPlatform(mobilePlatform);
        professionPlatform.login();
        professionPlatform.connect();
        professionPlatform.transfer();
    }
}
