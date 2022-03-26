package cn.com.zrwang.designpattern.Prototype;

import cn.com.zrwang.designpattern.Prototype.entity.Apple;
import cn.com.zrwang.designpattern.Prototype.entity.Fruit;

public class MainController
{
    private Fruit fruit;
    
    public MainController(Fruit fruit)
    {
        this.fruit = fruit;
    }
    
    private void sellFruit()
    {
        System.out.println("source hashcode" + fruit.hashCode());
        // 通过一个新的引用 将获取到的原fruit进行clone
        Fruit fruitClone = fruit.clone(fruit);
        System.out.println("target hashcode" + fruitClone.hashCode());
        fruitClone.whoIAM();
    }
    
    public static void main(String[] args)
    {
        new MainController(new Apple("苹果", 6)).sellFruit();
    }
    
    
}
