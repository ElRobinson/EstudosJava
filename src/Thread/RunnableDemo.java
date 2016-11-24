package Thread;

/**
 * Created by Luis on 23/11/2016.
 */
public class RunnableDemo {
    public void startThreads(){
        A obj1 = new A();
        B obj2 = new B();

        Thread threadObj1 = new Thread(obj1);
        threadObj1.start();

        Thread threadObj2 = new Thread(obj2);
        threadObj2.start();
    }

    public static void main(String[] args){
        RunnableDemo obj = new RunnableDemo();

        obj.startThreads();
    }
}

class A implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i < 20000;i++){
            if(i % 1000 == 0){
                System.out.println("inside A:" + i);
            }
        }
    }
}

class B implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i < 20000;i++){
            if(i % 1000 == 0){
                System.out.println("inside B:" + i);
            }
        }
    }
}
