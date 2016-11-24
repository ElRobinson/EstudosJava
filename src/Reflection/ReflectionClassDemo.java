package Reflection;

/**
 * Created by Luis on 24/11/2016.
 */
class MyClass{

}
class ReflectionClassDemo {
    public static void main(String[] args){
        try{
            Class<?> class1 = MyClass.class;

            Object myClassObj = new MyClass();
            Class<?> class2 = myClassObj.getClass();

            Class<?> class3 = Class.forName("Reflection.MyClass");


        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
