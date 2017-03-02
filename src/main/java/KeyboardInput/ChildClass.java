package KeyboardInput;


public class ChildClass extends ParentClass {

    public static void main(String[] args){
        new ChildClass().open();
    }

    public void open(){
        System.out.println("Parent Open method");
    }
}
