public class MethodeOverriding{
    public static void main(String[] args) {
        Parent obj1=new Parent();
        obj1.display();
        Parent parent = new Parent();
        parent.display(); // Output: This is the parent class.

        Child Obj2 = new Child();
        Obj2.display(); // Output: This is the child class.
    }
}

class Parent {
    public void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    public void display() {
        System.out.println("This is the child class.");
    }
}