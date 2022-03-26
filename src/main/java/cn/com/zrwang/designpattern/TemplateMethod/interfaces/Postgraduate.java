package cn.com.zrwang.designpattern.TemplateMethod.interfaces;

/**
 * @author wzr
 * @description: 考研动作接口
 */
public interface Postgraduate
{
    /**
     * 默认实现接口，学习课程
     */
    default public void learningClass()
    {
        System.out.println("上课阶段：我要开始准备考研了，所以首先我需要报考一个培训班进行课程的学习");
    };
    /**
     * 默认实现接口，参加考试
     */
    default public void takeExams()
    {
        System.out.println("考试阶段：开始进行考试。。。。。。。。");
    };
    
    /**
     * 默认实现接口，面试
     */
    default public void interview()
    {
        System.out.println("面试阶段：参加未来导师的面试！！");
    };
    
    /**
     * 需要具体类型的实现类进行方法的重写，备考阶段
     */
    void prepareExams();
    
    /**
     * 需要具体的实现类进行方法的重写，获取结果
     */
    void getResult();
    
    /**
     * 考研的全过程方法逻辑
     */
    default public void run()
    {
        learningClass();
        prepareExams();
        takeExams();
        interview();
        getResult();
    }
    
}
