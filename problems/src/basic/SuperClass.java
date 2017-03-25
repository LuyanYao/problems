package basic;

public class SuperClass {
    
    public static int superCount;
    
    public static final int subClassFinalStaticCount = 5;
    
    static{
        System.out.println("父类静态块被初始化"); 
    }
    
    public SuperClass()
    {
        System.out.println("父类非静态块被初始化");
    }

    public static void superClassStaticMethod()
    {
        System.out.println("父类静态方法被调用");
    }
    
}
