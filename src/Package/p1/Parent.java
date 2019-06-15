//Write a java program to demonstrate method overriding with the use of protected access modifier in same package
package p1;

public class Parent {
    protected int id = 10;

    public void getvalue(int x) {
        id = x;
    }

    protected void display() {
        System.out.println("This is parent class of package1");
        System.out.println("ID : " + id);
    }
}

class Child1 extends Parent {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.getvalue(10);
        c.display();
    }

    protected void display() {
        System.out.println("This is child class of package1");
        super.display();
    }
}

class Child2 {
    public static void main(String[] args) {
        Parent px = new Parent();
        px.id = 20;
        px.display();
    }
}