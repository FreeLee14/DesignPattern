package cn.com.zrwang.designpattern.Strategy.interfaces.impl;

import cn.com.zrwang.designpattern.Strategy.interfaces.TaxCalculate;

/**
 * @author wzr
 * 美国税率计算
 */
public class AmTaxCalculate implements TaxCalculate
{
    
    @Override
    public void calculate()
    {
        System.out.println("美国税率为。。。。");
    }
}
