/**
 * Exercise: 
 * Implement a generic method genericDisplay() to print the class name and its assigned value
 */
/**
 * Expected Output:
 * java.lang.Integer = 11
 * java.lang.Byte = 11
 * java.lang.String = Venturenix LAB
 * java.lang.Double = 1.0
 * java.lang.Float = 1.0
 */
class Exercise29 {
    // Code here, generic method genericDisplay()
    // object.getClass().getName() will return the class name & path, like java.lang.Integer 

    // Driver method
    public static void main(String[] args) {
        // Calling generic method with Integer argument (Default int)
        genericDisplay(11);

        genericDisplay((byte) 11);

        // Calling generic method with String argument
        genericDisplay("Venturenix LAB");

        // Calling generic method with double argument (Default double)
        genericDisplay(1.0);

        genericDisplay((float) 1.0);
    }
}