package cn.com.zrwang.designpattern.Composite.entity;

import java.util.ArrayList;
import java.util.List;

public class Root extends Component
{
    private String name;
    
    public List<Component> list = new ArrayList<>();
    
    public Root(String name)
    {
        this.name = name;
    }
    
    public void addComponent(Component component)
    {
        list.add(component);
    }
    
    public void removeComponent(Component component)
    {
        list.remove(component);
    }
    
    @Override
    public void Process()
    {
        for (Component component : list)
        {
            // 多态递归方法
            component.Process();
        }
    }
}
