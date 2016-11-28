package Reflection;

import java.lang.reflect.Method;

/**
 * Created by Luis on 25/11/2016.
 */
class ReflectionMethodInfoDemo {
    public static void main(String[] args){

        try{
            Class<?> classObj = Class.forName("Reflection.MyClass");

            Method methods[] = classObj.getMethods();

            for(int i = 0;i<methods.length;i++){
                System.out.println(methods[i]);
                System.out.println("Name:" + methods[i].getName());
            }
        } catch (ClassNotFoundException e){

        }
    }
}
