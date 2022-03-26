package cn.com.zrwang.designpattern.Visitor.visitor;

public class VisitorB extends ElementVisitor
{
    @Override
    public void processA()
    {
        System.out.println("visitor B process A action .....");
    }
    
    @Override
    public void processB()
    {
        System.out.println("visitor B process B action .....");
    }
}
