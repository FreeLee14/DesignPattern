package cn.com.zrwang.designpattern.Prototype.entity;

public class Apple extends Fruit
{
    public Apple(String name, int price)
    {
        super(name, price);
    }
    
    
    /**
     * 重写clone方法，实现深度克隆
     * @param fruit
     * @return
     */
    @Override
    public Fruit clone(Fruit fruit)
    {
        return new Apple(fruit.name, fruit.price);
    }
}
