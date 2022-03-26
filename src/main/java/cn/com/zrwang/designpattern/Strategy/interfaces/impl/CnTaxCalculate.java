package cn.com.zrwang.designpattern.Strategy.interfaces.impl;

import cn.com.zrwang.designpattern.Strategy.interfaces.TaxCalculate;

/**
 * @author wzr
 * 中国税率计算
 */
public class CnTaxCalculate implements TaxCalculate
{
    
    @Override
    public void calculate()
    {
        System.out.println("中国税率为。。。。");
    }
}
