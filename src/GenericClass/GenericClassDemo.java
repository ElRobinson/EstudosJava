package GenericClass;

/**
 * Created by Luis on 23/11/2016.
 */
class Node{
        private String key;
        private String Data;

    public Node(String keyValue,String DataValue){
        key = keyValue;
        Data = DataValue;
    }
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }
}
class MyGenericClass<T>{
    private T info;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}
class GenericClassDemo {

    public static void main(String args[]){

        MyGenericClass<Integer> obj1 = new MyGenericClass<Integer>();
        obj1.setInfo(10);

        MyGenericClass<Node> obj = new MyGenericClass<Node>();
        Node nodeData = new Node("007","james bond");

    }
}
