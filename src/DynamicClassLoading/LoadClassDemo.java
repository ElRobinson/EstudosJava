package DynamicClassLoading;

/**
 * Created by Luis on 30/11/2016.
 */
 class LoadClassDemo {
    public static void main(String[] args)  throws Exception{
        ClassLoader loader = LoadClassDemo.class.getClassLoader();
        Class<?> classObj = loader.loadClass("DynamicClassLoading.DynamicClass");

        DynamicClassInterface obj = (DynamicClassInterface) classObj.newInstance();
        obj.Display();

    }
}

