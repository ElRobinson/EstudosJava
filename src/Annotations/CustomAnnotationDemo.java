package Annotations;

import java.lang.reflect.Method;

/**
 * Created by Luis on 02/12/2016.
 */
public class CustomAnnotationDemo {

    @AnnotationDemo(author="oi",id=100)
    public void annoatedMethod1(){
        System.out.println("Method1");
    }

    @AnnotationDemo(id=0)
    public void annoatedMethod2(){System.out.println("Method2"); }

    public static void main(String[] args){
        CustomAnnotationDemo obj = new CustomAnnotationDemo();

        Method[] objMethod = obj.getClass().getMethods();


        for(Method method: objMethod){
            AnnotationDemo annotation = method.getAnnotation(AnnotationDemo.class);
            if(annotation != null){
                System.out.println(method.getName() + " - Author : " + annotation.author() + "id :" + annotation.id());
            }

        }
    }
}
