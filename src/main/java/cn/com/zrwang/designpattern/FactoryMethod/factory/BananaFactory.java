package cn.com.zrwang.designpattern.FactoryMethod.factory;

import cn.com.zrwang.designpattern.FactoryMethod.entity.Banana;
import cn.com.zrwang.designpattern.FactoryMethod.entity.Fruit;

/**
 * @author wzr
 *  实际的香蕉工厂
 */
public class BananaFactory implements FruitFactory
{
    @Override
    public Fruit createFruit()
    {
        return new Banana();
    }
}
