/**
 * Created by Luis on 23/11/2016.
 */
public class ThreadDemo {
    public void startThreads(){

        Thread threadObj1 = new AA();
        threadObj1.start();

        Thread threadObj2 = new BB();
        threadObj2.start();
    }

    public static void main(String[] args){
        ThreadDemo obj = new ThreadDemo();

        obj.startThreads();


    }
}

class AA extends Thread{

    @Override
    public void run() {
        for (int i = 0;i < 20000;i++){
            if(i % 1000 == 0){
                System.out.println("inside A:" + i);
            }
        }
    }
}

class BB extends Thread{

    @Override
    public void run() {
        for (int i = 0;i < 20000;i++){
            if(i % 1000 == 0){
                System.out.println("inside B:" + i);
            }
        }
    }
}
