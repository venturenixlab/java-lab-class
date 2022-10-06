enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    int value;

    Level(int value) {
        this.value = value;
    }

}

/**
 * Expected Output:
 * This is Medium level
 * enum is MEDIUM, and its value is 2
 */
public class Exercise17Ans {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        // Write a switch statement to print the expected output.

    }
}