package Thread;

/**
 * Created by Luis on 24/11/2016.
 */

class AAAA implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 20000; i++){
            if(i % 1000 == 0){
                System.out.println("Thread AAA:" + i);
            }
        }
    }
}

class BBBB implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 20000; i++){
            if(i % 1000 == 0){
                System.out.println("Thread BBB:" + i);
            }
        }
    }
}

public class ThreadSleepDemo {
    public void startThreads(){
        try{
            AAAA obj1 = new AAAA();
            BBBB obj2 = new BBBB();

            Thread threadObj1 = new Thread(obj1);
            threadObj1.start();

            threadObj1.sleep(1000);

            Thread threadObj2 = new Thread(obj2);
            threadObj2.start();

        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        ThreadSleepDemo obj = new ThreadSleepDemo();

        obj.startThreads();
    }
}
