package Reflection;

/**
 * Created by Luis on 28/11/2016.
 */
class MyClassInstance{

    public void Display1(int data){
        System.out.println("Inside Display1");
    }

    public void Display2(int data,String name){
        System.out.println("Inside Display2");
    }

    public MyClassInstance(String name){
        System.out.println("Inside Constructor");
    }
    public MyClassInstance(int data,String name){
        System.out.println("Inside Constructor with two parameters");
    }
}

class ReflectionCreateInstanceDemo {
    public static void main(String[] args){
        try{
            Class<?> classObj = Class.forName("Reflection.MyClassInstance");
            Object obj = classObj.newInstance();

        } catch (Exception e){

        }
    }
}
