package DynamicClassLoading;

/**
 * Created by Luis on 30/11/2016.
 */
public class CustomClassLoaderDemo {
    public static void main(String[] args) throws Exception{
        ClassLoader loader = new MyClassLoader(CustomClassLoaderDemo.class.getClassLoader());

        //Try to create an object of a class which extends  SuperClass
        Class<?> goodClass = loader.loadClass("DynamicClassLoading.GoodSubClass");
        SuperClass goodObj = (SuperClass) goodClass.newInstance();
        goodObj.Display();

        //Try to create an object of a class which does not extend SuperClass
        Class<?> badClass = loader.loadClass("DynamicClassLoading.BadSubClass");
        SuperClass badObj = (SuperClass) badClass.newInstance();
        badObj.Display();

    }
}
