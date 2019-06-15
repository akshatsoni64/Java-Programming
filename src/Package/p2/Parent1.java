//Write a java program to demonstrate use of protected access modifier in different package
package p2;

import p1.*;

class Parent1 extends Parent {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        p.display();
    }

    protected void display() {

        System.out.println("This is parent class of package 2");
        super.display();
    }
}
/*not accessible here
class Child 
{
	public static void main(String args[])
	{
		Parent px=new Parent();
		px.id=20;
		px.display();		
	}
}*/