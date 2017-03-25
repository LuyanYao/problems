package basic;

public class SubClass extends SuperClass {
    
    public static int subCount;
    
    static{
        System.out.println("子类静态块被初始化");
    }
    
    public SubClass()
    {
        System.out.println("子类非静态块被舒适化");
    }
    
    public static void subClassStaticMethod()
    {
        System.out.println("子类静态方法被调用");
    }

}
