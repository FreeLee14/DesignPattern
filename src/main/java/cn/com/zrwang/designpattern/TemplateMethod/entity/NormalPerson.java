package cn.com.zrwang.designpattern.TemplateMethod.entity;

import cn.com.zrwang.designpattern.TemplateMethod.interfaces.Postgraduate;

/**
 * @author wzr
 * 一般的人
 */
public class NormalPerson implements Postgraduate
{
    @Override
    public void prepareExams()
    {
        System.out.println("备战阶段：学习生活均衡，八小时学习时间，剩余时间用于娱乐、社交、运动");
    }
    
    @Override
    public void getResult()
    {
        System.out.println("获取结果：没有考中目标大学的目标专业，但是被调剂到其他专业");
    }
}
