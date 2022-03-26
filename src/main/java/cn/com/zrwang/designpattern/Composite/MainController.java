package cn.com.zrwang.designpattern.Composite;

import cn.com.zrwang.designpattern.Composite.entity.Leaf;
import cn.com.zrwang.designpattern.Composite.entity.Root;

public class MainController
{
    public static void main(String[] args)
    {
        Root root1 = new Root("root1");
        Root root2 = new Root("root2");
        Root root3 = new Root("root3");
        
        Leaf leaf1 = new Leaf("leaf1");
        Leaf leaf2 = new Leaf("leaf2");
        Leaf leaf3 = new Leaf("leaf3");
        
        root1.addComponent(root2);
        root1.addComponent(leaf1);
        root2.addComponent(root3);
        root2.addComponent(leaf2);
        root3.addComponent(leaf3);
        
        root1.Process();
    }
}
