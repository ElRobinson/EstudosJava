package DynamicClassLoading;

/**
 * Created by Luis on 29/11/2016.
 */
 class ClassLoaderDemo {
    public static void main(String[] args){
        Class<?> classObj = ClassLoaderDemo.class;
        ClassLoader loader = classObj.getClassLoader();

        System.out.println("lalal: " + loader.getClass().getSimpleName());
    }
}
