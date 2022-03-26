package cn.com.zrwang.designpattern.Strategy;

import cn.com.zrwang.designpattern.Strategy.entity.Seller;
import cn.com.zrwang.designpattern.Strategy.interfaces.TaxCalculate;
import cn.com.zrwang.designpattern.Strategy.interfaces.impl.CnTaxCalculate;

public class MainController
{
    public static void main(String[] args)
    {
        // 声明一种税率方案，作为参数传入到seller中
        TaxCalculate calculate = new CnTaxCalculate();
        
        Seller seller = new Seller(calculate);
        
        seller.sold();
        
    }
}
