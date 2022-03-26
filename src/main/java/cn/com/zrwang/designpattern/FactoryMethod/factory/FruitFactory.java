package cn.com.zrwang.designpattern.FactoryMethod.factory;

import cn.com.zrwang.designpattern.FactoryMethod.entity.Fruit;

/**
 * @author wzr
 * 水果工厂
 */
public interface FruitFactory
{
    /**
     * 生成水果
     * @return
     */
    Fruit createFruit();
}
