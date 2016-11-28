package Reflection;

import java.lang.reflect.Method;

/**
 * Created by Luis on 28/11/2016.
 */
public class ReflectionDynamicMethodInvokeDemo2 {
    public static void main(String[] args){
        try{
            Class<?> classObj = Class.forName("Reflection.MyClassInstance");
            Object obj = classObj.newInstance();

            Method m = classObj.getMethod("Display1",int.class);
            m.invoke(obj,10);

            m = classObj.getMethod("Display2",int.class,String.class);
            m.invoke(obj,10,"La");

        } catch (Exception e){

        }
    }
}
