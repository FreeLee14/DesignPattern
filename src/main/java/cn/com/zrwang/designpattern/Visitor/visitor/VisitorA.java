package cn.com.zrwang.designpattern.Visitor.visitor;

public class VisitorA extends ElementVisitor
{
    @Override
    public void processA()
    {
        System.out.println("visitor A process A action .....");
    }
    
    @Override
    public void processB()
    {
        System.out.println("visitor A process B action .....");
    }
}
