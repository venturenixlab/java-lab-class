
/**
 * Expected Output:
 * LOW
 * MEDIUM
 * HIGH
 */
enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    int value;

    Level(int value) {
        this.value = value;
    }

    // Program a method to print all enum level
    
}

class Exercise18 {

    public static void main(String[] args) {
        Level.showValues();
    }
}
