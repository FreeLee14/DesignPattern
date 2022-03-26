package cn.com.zrwang.designpattern.TemplateMethod;

import cn.com.zrwang.designpattern.TemplateMethod.entity.DiligentPerson;
import cn.com.zrwang.designpattern.TemplateMethod.entity.LazyPerson;
import cn.com.zrwang.designpattern.TemplateMethod.entity.NormalPerson;

public class MainController
{
    public static void main(String[] args)
    {
        DiligentPerson diligentPerson = new DiligentPerson();
        NormalPerson normalPerson = new NormalPerson();
        LazyPerson lazyPerson = new LazyPerson();
        try
        {
            diligentPerson.run();
            Thread.sleep(1_000);
            normalPerson.run();
            Thread.sleep(1_000);
            lazyPerson.run();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
