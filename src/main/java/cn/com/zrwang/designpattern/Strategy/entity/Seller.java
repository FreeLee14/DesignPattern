package cn.com.zrwang.designpattern.Strategy.entity;

import cn.com.zrwang.designpattern.Strategy.interfaces.SoldOrder;
import cn.com.zrwang.designpattern.Strategy.interfaces.TaxCalculate;

/**
 * @author wzr
 * 售卖者
 */
public class Seller implements SoldOrder
{
    private TaxCalculate taxCalculate;
    
    public Seller(TaxCalculate calculate)
    {
        this.taxCalculate = calculate;
    }
    
    @Override
    public void sold()
    {
        System.out.println("你好，买东西吗？");
        System.out.println("我来自**国家，我们国家的税率如下：");
        taxCalculate.calculate();
        System.out.println("交易愉快");
    }
    
}
