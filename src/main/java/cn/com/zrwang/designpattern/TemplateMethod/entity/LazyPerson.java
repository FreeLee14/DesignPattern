package cn.com.zrwang.designpattern.TemplateMethod.entity;

import cn.com.zrwang.designpattern.TemplateMethod.interfaces.Postgraduate;

/**
 * @author wzr
 * 懒惰的人
 */
public class LazyPerson implements Postgraduate
{
    @Override
    public void prepareExams()
    {
        System.out.println("备战阶段：三天打鱼连天晒网，just so so");
    }
    
    @Override
    public void getResult()
    {
        System.out.println("获取结果： defeat！！");
    }
}
