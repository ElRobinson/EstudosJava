/**
 * Created by Luis on 23/11/2016.
 */
public class GenericMethodDemo {

    static <T> void Display(T value){
        System.out.println("Value:" + value);
    }

    public static void main(String args[]){
        Display(10);
        Display("Generic");
    }
}
