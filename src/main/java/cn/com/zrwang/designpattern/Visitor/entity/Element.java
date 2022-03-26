package cn.com.zrwang.designpattern.Visitor.entity;

import cn.com.zrwang.designpattern.Visitor.visitor.ElementVisitor;

/**
 * @author wzr
 */
public abstract class Element
{
    /**
     * 设定一个抽象方法，用于接收不同的visitor的具体子类 （第二次多态分配）
     * @param visitor
     */
    public abstract void accept(ElementVisitor visitor);
}
