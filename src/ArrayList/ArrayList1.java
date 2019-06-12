import java.util.*; // ArrayList lives in .util
class Cities {
public static void main(String[] args) {
List<String> c = new ArrayList<String>(); // create an ArrayList, c
c.add("Oslo"); // add original cities
c.add("Paris");
c.add("Rome");
int index = c.indexOf("Paris"); // find Paris' index
System.out.println(c + " " + index);
c.add(index, "London"); // add London before Paris
System.out.println(c); // show the contents of c
}
}