package a;

public class MyObjectWrapper {
    private InterfaceMyObject myObject;
    public MyObjectWrapper (InterfaceMyObject myObject) {
        this.myObject = myObject;
    }

    public void myMethod(int param) {
        this.myObject.myMethod(param);
    }

}
