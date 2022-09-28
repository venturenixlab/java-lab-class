/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class Exercise2 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // Use name.charAt()
    // prints J
    // prints e

    // Use indexOf(int ch), or indexOf(String ch)
    // prints 3
    // prints 9
    // prints 10

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"

    // Use String replace() method
    // prints VenturenixLAB, Coding

    // int length()
    // prints 19

    // Use String substring(int start, int end)
    // prints "ren"

    // String toLowerCase(), and String toUpperCase()
    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"

    // Method Chaining, replaceAll(), toUpperCase(), concat()
    // prints "V*NTUR*NIXLAB, JAVA!!!"
  }

}