package Reflection;

import java.lang.reflect.Constructor;

/**
 * Created by Luis on 28/11/2016.
 */
 class ReflectionConstructorCreateInstanceDemo {
    public static void main(String[] args){
        try{
            Class<?> classObj = Class.forName("Reflection.MyClassInstance");

            Constructor<?> cons1 = classObj.getConstructor(String.class);
            Object obj1 = cons1.newInstance("lala");

            Constructor<?> cons2 = classObj.getConstructor(int.class,String.class);
            Object obj2 = cons2.newInstance(10,"lala");


        } catch (Exception e){

        }
    }
}
