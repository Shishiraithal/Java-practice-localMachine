package cannotOverridePrivate;


class Base {
private static void display() {
System.out.println("Static or class method from Base");
}
public void print() {
System.out.println("Non-static or instance method from Base");
}
class Derived extends Base {
//private static void display() {
//System.out.println("Static or class method from Derived");
//}
public void print() {
System.out.println("Non-static or instance method from Derived");
}
}

class test {
//public static void main(String args[])
//{
////Base obj= new test();
////obj.display();
////obj.print();
//}
 }
}
