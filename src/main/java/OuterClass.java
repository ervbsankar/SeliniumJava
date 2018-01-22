abstract class AnonymousInner {
    public abstract void myMethod();

    public void nonAbstractMethod() {
        System.out.println("Non abstract method");
    }
}

public class OuterClass {

    public static void main(String args[]) {
        AnonymousInner inner = new AnonymousInner() {
            public void myMethod() {
                System.out.println("This is an example of anonymous inner class");
            }
        };
        inner.myMethod();
        inner.nonAbstractMethod();
    }
}