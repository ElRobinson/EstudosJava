package Reflection;

import java.lang.reflect.Constructor;

/**
 * Created by Luis on 28/11/2016.
 */
class ReflectionConstructorInfoDemo {
    public static void main(String[] args){
        try{
            Class<?> classObj = Class.forName("Reflection.MyClass");

            Constructor<?> cons[] = classObj.getConstructors();

            for(int i = 0;i<cons.length;i++){
                System.out.println(cons[i]);
                System.out.println("name:" + cons[i].getName());
            }

        } catch (Exception e){

        }
    }
}
