package Reflection;

import java.lang.reflect.Field;

/**
 * Created by Luis on 25/11/2016.
 */
class ReflectionFieldInfoDemo {
    public static void main(String[] args) throws ClassNotFoundException{
        try{
            Class<?> classObj = Class.forName("Reflection.MyClass");
            Field fields[] = classObj.getFields();

            for(int i = 0; i< fields.length;i++){
                System.out.println(fields[i]);
                System.out.println("Name: " + fields[i].getName());
                System.out.println("Type: " + fields[i].getType());
            }
        } catch (Exception e){

        }

    }
}
