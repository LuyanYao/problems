package basic;

public class ClassLoaderTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // SubClass subClass = null;//除了new，静态方法被调用，静态域被访问,静态域被赋值之外不会发生类的初始化
        
        //SubClass subClass = new SubClass();//通过new初始化，父类初始化早于子类,静态块初始化早于非静态块
        
       // System.out.println(SubClass.superCount);//由于对静态变量的访问而初始化,此处只初始化父类静态块
        
       //  System.out.println(SubClass.subCount);//初始化父类和子类的静态块
        
      //SubClass.superCount = 1;//只初始化父类静态块
        
       // SubClass.subCount = 2;//初始化父类和子类静态块
        
        //SubClass.superClassStaticMethod();//通过子类调用父类静态方法，只初始化父类的讲台块
        
      //SubClass.subClassStaticMethod();//调用子类的静态方法，先初始化父类的静态块再初始化子类的静态块
        
       // System.out.println(SubClass.subClassFinalStaticCount);//静态常量已经在类编译时就放入常量池，所以此处不会发生类的初始化
        
      

    }

}
