package cn.com.zrwang.designpattern.FactoryMethod;

import cn.com.zrwang.designpattern.FactoryMethod.entity.Fruit;
import cn.com.zrwang.designpattern.FactoryMethod.factory.AppleFactory;
import cn.com.zrwang.designpattern.FactoryMethod.factory.FruitFactory;

public class MainController
{
    public FruitFactory fruitFactory;
    public MainController()
    {}
    public MainController(FruitFactory factory)
    {
        this.fruitFactory = factory;
    }
    
    public void sellFruit()
    {
        Fruit fruit = fruitFactory.createFruit();
        fruit.whoIAM();
    }

    public static void main(String[] args)
    {
        new MainController(new AppleFactory()).sellFruit();
    }
}
