package a;

public class Main {

    public static void main(String[] args) {

        MyObject myObject = new MyObject();

        MyObject1 myObject1 = new MyObject1(myObject);
        MyObject2 myObject2 = new MyObject2(myObject);

        myObject1.myMethod(3);
        myObject2.myMethod(4);

    }
}
