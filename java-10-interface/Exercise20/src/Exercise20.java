/**
 * Implement one more Interface Cooker
 */
/**
 * Expected Output:
 * I can drive.
 * I can cook.
 */
interface Driver {
    public void drive(); // interface method
}

// Program an interface Cooker with cook method

class Father implements Driver {
    @Override
    public void drive() {
        System.out.println("I can drive.");
    }

}

class Exercise20 {
    public static void main(String[] args) throws Exception {
        Father father = new Father();
        father.drive();
        father.cook();
    }
}
