package cn.com.zrwang.designpattern.Prototype.entity;

public class Banana extends Fruit
{
    public Banana(String name, int price)
    {
        super(name, price);
    }
    
    @Override
    public Fruit clone(Fruit fruit)
    {
        return new Banana(fruit.name, fruit.price);
    }
}
