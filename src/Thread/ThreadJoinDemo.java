package Thread;

/**
 * Created by Luis on 24/11/2016.
 */
class AAA implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 20000; i++){
            if(i % 1000 == 0){
                System.out.println("Thread AAA:" + i);
            }
        }
    }
}

class BBB implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 20000; i++){
            if(i % 1000 == 0){
                System.out.println("Thread BBB:" + i);
            }
        }
    }
}

public class ThreadJoinDemo {
    public void startThreads(){
        AAA obj1 = new AAA();
        BBB obj2 = new BBB();

        Thread threadObj1 = new Thread(obj1);
        threadObj1.start();

        Thread threadObj2 = new Thread(obj2);
        threadObj2.start();

        try{
            threadObj1.join();
            threadObj2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        ThreadJoinDemo obj = new ThreadJoinDemo();

        obj.startThreads();
    }
}
