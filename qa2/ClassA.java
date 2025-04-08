package qa2;

// 21). Multiple Classes
//Class A with static method print()
public class A {

 public static void print() { 
     System.out.println("This is a method");
 }
 }

//Class B with main method
public class B {

 public static void main(String args[]) {

     // Calling the static method print() from class A
     print();
    

 }
}

