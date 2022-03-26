package cn.com.zrwang.designpattern.Composite.entity;

/**
 * @author wzr
 */
public class Leaf extends Component
{
    private String name;
    
    public Leaf(String name)
    {
        this.name = name;
    }
    
    @Override
    public void Process()
    {
        System.out.println("the leaf node name is " + name);
    }
}
