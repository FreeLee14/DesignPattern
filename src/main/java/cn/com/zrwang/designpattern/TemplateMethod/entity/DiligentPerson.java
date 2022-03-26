package cn.com.zrwang.designpattern.TemplateMethod.entity;

import cn.com.zrwang.designpattern.TemplateMethod.interfaces.Postgraduate;

/**
 * @author wzr
 * 勤奋的人
 */
public class DiligentPerson implements Postgraduate
{
    @Override
    public void prepareExams()
    {
        System.out.println("备战阶段：合理安排时间，早6晚10的学习时间范围，心无杂念");
    }
    
    @Override
    public void getResult()
    {
        System.out.println("获取结果：off course success");
    }
}
