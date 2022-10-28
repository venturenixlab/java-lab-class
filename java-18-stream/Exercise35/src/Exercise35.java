import java.util.*;
import java.util.stream.*;
/**
 * Exercise: Follow the instruction to complete the code, in order to generate the output.
 */
/**
 * Expected Output
[144, 169, 196, 225]
[Stream]
[Collection, Reflection, Stream]
[Stream, Reflection, Collection]
Squeare Set: [16, 36, 25]
The Square of each elements: 
25
16
25
36
The sum is: 10
 */
class Exercise35 {
    public static void main(String args[]) {

        // create a list of integers
        List<Integer> numbers = Arrays.asList(12, 13, 14, 15);
        // Revise each of integer elements to become square of itself, and store it in another ArrayList
        // Code here ...
        System.out.println(squares);

        // create a list of String
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
        // Filter those elements start with "S" to another list of String, and print it out
        // Code here ...
        System.out.println(filteredList);

        // Sorts the ArraryList by using stream sorting method by natual order in JVM
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNames);
        // Do you remember Comparator? Use Lambda expression to implement sorted() method
        // To print REVERSE order of ArrayList names, [Stream, Reflection, Collection]
        // Code here ...
        System.out.println(sortedNames);

        // create a list of integers
        List<Integer> anotherNumbers = Arrays.asList(5, 4, 5, 6);

        // Return the square of elements
        // What Data Structure stores unquie elements ONLY? Use it to remove duplicated element(s)
        // // Code here ...
        System.out.println("Squeare Set: " + squareSet);

        // Use stream forEach method to print square of each Integer in ArrayList anotherNumbers
        System.out.println("The Square of each elements: ");
        // Code here ...

        // Implement stream reduce() method to sum up all even numbers from ArrayList anotherNumbers
        // By using lambda expression
        // Code here ...
    }
}
