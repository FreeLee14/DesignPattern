package cn.com.zrwang.designpattern.Strategy.interfaces.impl;

import cn.com.zrwang.designpattern.Strategy.interfaces.TaxCalculate;

/**
 * @author wzr
 * 俄罗斯税率计算
 */
public class RuTaxCalculate implements TaxCalculate
{
    
    @Override
    public void calculate()
    {
        System.out.println("俄罗斯税率为。。。。");
    }
}
