import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * Class to take a list of integers from input, sort them, and store them into a Stack using the Java Collections
 * Framework.  Takes a scanned input, stores in an ArrayList, sorts, then copies contents into a Stack.
 * @author Derek Morrison
 * @version 2.0
 * @since 6/6/23
 */

public class OrderedStack {
    /**
     * Main method of the class, used for demonstration purposes.  Takes a list of integers from input and stores them
     * into an ArrayList, sorts the ArrayList, then copies contents of the ArrayList into a Stack called sortedStack.
     * Finally, prints contents of sortedStack to the screen.
     * @param args default parameter for a main - not used
     * @since 6/6/23
     */

    public static void main(String[] args) {
        ArrayList<Integer> startingArray = new ArrayList<>();

        //start a Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Please input integers separated by spaces, enter a non-integer and Enter to finish:");

        //read each integer that was detected and store it in startingArray
        while(in.hasNextInt()){
            startingArray.add(in.nextInt());
        }

        //close Scanner
        in.close();

        //sort startingArray
        Collections.sort(startingArray);

        //create sortedStack
        Stack<Integer> sortedStack = new Stack<>();

        //fill sortedStack with sorted integers from startingArray
        sortedStack.addAll(startingArray);

        //print out sortedStack
        System.out.println("Here are the contents of the Stack:");
        System.out.println(sortedStack);
    }
}
