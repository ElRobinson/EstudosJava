package DynamicClassLoading;

/**
 * Created by Luis on 30/11/2016.
 */
 class DynamicClass implements DynamicClassInterface {
    static {
        System.out.println("Dynamic Class is initialized");
    }

    public DynamicClass(){
        System.out.println("Inside DynamicClass constructor");
    }

    public void Display(){
        System.out.println("Inside DynamicClass::Display");
    }
}
