package a;

public class MyObject1 extends MyObjectWrapper {

    public MyObject1(InterfaceMyObject myObject) {
        super(myObject);
    }

    private void aMethod() {
        System.out.println("Gotcha! myMethod 1 ");
        myMethod(1);
    }

    public void doSomething() {
        System.out.println("Gotcha! 1 ");
    }
}
