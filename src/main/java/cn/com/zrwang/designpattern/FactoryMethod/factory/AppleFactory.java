package cn.com.zrwang.designpattern.FactoryMethod.factory;

import cn.com.zrwang.designpattern.FactoryMethod.entity.Apple;
import cn.com.zrwang.designpattern.FactoryMethod.entity.Fruit;

/**
 * @author wzr
 * 实际的苹果工厂
 */
public class AppleFactory implements FruitFactory
{
    @Override
    public Fruit createFruit()
    {
        return new Apple();
    }
}
