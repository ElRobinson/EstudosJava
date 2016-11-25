package Reflection;

/**
 * Created by Luis on 24/11/2016.
 */
class MyClass{
    public int data;
    public String name;

    public MyClass (int data,String name){}
    public void Method1(){}
    public int Method2(int value){return value;}

}
class ReflectionClassDemo {
    public static void main(String[] args){
        try{
            Class<?> class1 = MyClass.class;
            System.out.println(MyClass.class);

            Object myClassObj = new MyClass(5,"lala");
            Class<?> class2 = myClassObj.getClass();
            System.out.println(class2);

            Class<?> class3 = Class.forName("Reflection.MyClass");
            System.out.println(class3);


        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("end of main");
        }
    }
}
