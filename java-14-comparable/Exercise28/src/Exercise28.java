import java.io.*;
import java.util.*;

/**
 * Execrise:
 * Implement a Class DescYearComparator implements Comparator for Collections.sort use
 */
/**
 * Movies after sorting:
 * Force Awakens 8.3 2015
 * Return of the Jedi 8.4 1983
 * Star Wars 8.7 1977
 */
// A class 'Movie' that implements Comparable
class Movies {
    private double rating;
    private String name;
    private int year;

    // Constructor
    public Movies(String nm, double rt, int yr) {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

// Driver class
class Exercise28 {
    public static void main(String[] args) {
        ArrayList<Movies> movies = new ArrayList<>();
        movies.add(new Movies("Force Awakens", 8.3, 2015));
        movies.add(new Movies("Star Wars", 8.7, 1977));
        movies.add(new Movies("Return of the Jedi", 8.4, 1983));

        // Moive implements Comparable, having comparable function
        Collections.sort(movies, new DescYearComparator());

        System.out.println("Movies after sorting: ");
        for (Movies movie : movies) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }
}