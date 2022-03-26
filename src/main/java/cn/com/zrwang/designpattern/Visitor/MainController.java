package cn.com.zrwang.designpattern.Visitor;

import cn.com.zrwang.designpattern.Visitor.entity.Element;
import cn.com.zrwang.designpattern.Visitor.entity.ElementB;
import cn.com.zrwang.designpattern.Visitor.visitor.VisitorA;
import cn.com.zrwang.designpattern.Visitor.visitor.VisitorB;

public class MainController
{
    private Element element;
    
    public MainController(Element element)
    {
        this.element = element;
    }
    
    public static void main(String[] args)
    {
        VisitorA visitorA = new VisitorA();
        VisitorB visitorB = new VisitorB();
        MainController mainController = new MainController(new ElementB());
        // 第一次多态分配
        mainController.element.accept(visitorB);
    }
}
