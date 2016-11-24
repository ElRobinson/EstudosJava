package Reflection;

/**
 * Created by Luis on 24/11/2016.
 */

class ReflectionClassInfoDemo {
    public static void main(String args[]){
        try {
            Class<?> classObj = Class.forName("Reflection.MyClass");
            System.out.println(classObj.getName());
            System.out.println(classObj.getSimpleName());
            System.out.println(classObj.getSuperclass().getName());
        }  catch (Exception e){

        }
    }
}
