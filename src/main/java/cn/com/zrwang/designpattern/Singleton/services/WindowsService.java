package cn.com.zrwang.designpattern.Singleton.services;

/**
 * @author wzr
 * 窗口服务，我们要保证窗口服务在全局只有一个对象，才能在该窗口中展示不同的任务画面
 */
public class WindowsService
{
    
    private volatile WindowsService windowsService;
    
    /**
     * 私有化构造函数
     */
    private WindowsService()
    {
    }
    
    private final Object lock = new Object();
    
    /**
     * 普通的单例实现，判断当前引用是否为null，是null，new出一个新的对象，不为null，则直接返回该实例
     * 但是这种方法存在着多线程场景下的隐患，当两个线程都存在getInstance（）方法，若某个线程执行到if判断语句
     * 并通过验证，此时该线程的CPU时间片结束，CPU调度到另外一个线程是其处于运行状态，此时windowsService未完成实例化
     * 第二个线程也进入了判断，并创建出了对象，并返回，之后CPU去调度第一个线程时，会从return new WindowsService();开始执行，
     * 这样就又产生了一个新的实例，此时WindowsService类创建实例没有保证单例性
     *
     * @return
     */
    public WindowsService getInstance()
    {
        if (windowsService == null)
        {
            return new WindowsService();
        }
        return windowsService;
    }
    
    /**
     * 通过加锁实现创建单例对象,这种方法是最安全的方式，但是也是性能开销较大的方式
     * 如果有上千个线程都需要执行getInstanceBySync()，这个方法的话，那么将会严重
     * 影响到系统的并发处理能力。而且我们一般要保证读共享，写互斥。所以这种方式
     * 只能在少量线程的情况下可以考虑使用
     *
     * @return
     */
    public WindowsService getInstanceBySync()
    {
        synchronized (lock)
        {
            if (windowsService == null)
            {
                return new WindowsService();
            }
            return windowsService;
        }
    }
    
    /**
     * double check 由于大范围加锁造成了较大的性能问题，所以采用双检查+加锁的方法才实现获取单例对象
     * 这种方法只有在windowsService为null时才会进入到synchronized互斥锁范围内，一般在多线程场景下
     * 是较为安全的，且不会造成大量线程处于一个等待或阻塞的状态。不会轻易导致synchronized锁升级。
     * 但是这种方法又有另外一种隐患，那就是指令重排序问题（reorder），这是CPU层面进行的一个代码优化
     * 操作，是将汇编代码进行重排序，提高CPU的执行效率。所以new WindowsService();这个动作，很有可能
     * 存在 已经给这个对象分配了内存空间，即windowsService != null 但是，该对象内部并未完成初始化，若
     * 其他线程到达第一个if判断时，发现此时windowsService != null，则返回windowsService实例，但是其内部
     * 属性并未完成初始化，所以该对象无法使用，会导致其他线程执行任务时出现异常。为了防止指令重排序，此时
     * 需要为private WindowsService windowsService;的声明添加volatile关键字
     *
     * @return
     */
    
    public WindowsService getInstanceByDouCheck()
    {
        if (windowsService == null)
        {
            synchronized (lock)
            {
                if (windowsService == null)
                {
                    return new WindowsService();
                }
                return windowsService;
            }
        }
        return windowsService;
    }
    
    
    // 剩余的两种方法一种是将 对象的初始化放在静态编译阶段 ，另外一种是通过枚举的方式（其实也是属于利用静态编译的一种手段）
    // 这两种方式不能滥用，否则会影响编译阶段的速度，并且面向对象编程，提倡的是运行时再创建。
    
}
