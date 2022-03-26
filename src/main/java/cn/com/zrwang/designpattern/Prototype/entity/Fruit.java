package cn.com.zrwang.designpattern.Prototype.entity;

/**
 * @author wzr
 */
public abstract class Fruit
{
    public String name;
    public int price;
    
    public Fruit(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
    
    public void whoIAM()
    {
        System.out.println("i am " + this.name + "and my price is " + this.price);
    }
    
    public abstract Fruit clone(Fruit fruit);
    
}
