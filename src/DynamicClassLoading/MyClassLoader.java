package DynamicClassLoading;

/**
 * Created by Luis on 30/11/2016.
 */
public class MyClassLoader extends ClassLoader {
    public MyClassLoader(ClassLoader parent){
        super(parent);
    }

    public Class<?> loadClass (String cls) throws ClassNotFoundException{
        Class<?> classObj = super.loadClass(cls);

        if (!SuperClass.class.isAssignableFrom(classObj)){
            throw new IllegalArgumentException("Cannot create a instance of: " + cls);
        }

        return classObj;
    }
}
