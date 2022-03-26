package cn.com.zrwang.designpattern.Visitor.entity;

import cn.com.zrwang.designpattern.Visitor.visitor.ElementVisitor;

public class ElementA extends Element
{
    @Override
    public void accept(ElementVisitor visitor)
    {
        visitor.processA();
    }
}
