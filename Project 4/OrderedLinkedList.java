import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Class to take a list of integers from input, sort them, and store them into a linked list using the Java Collections
 * Framework.  Takes a scanned input, stores in an ArrayList, sorts, then copies contents into a LinkedList.
 * @author Derek Morrison
 * @version 1.0
 * @since 6/2/23
 */

public class OrderedLinkedList {
    /**
     * Main method of the class, used for demonstration purposes.  Takes a list of integers from input and stores them
     * into an ArrayList, sorts the ArrayList, then copies contents of ArrayList into a LinkedList.  Finally, prints
     * contents of LinkedList.
     * @param args default parameter for a main - not used
     * @since 6/2/23
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

        //create linkedList and fill it with startingArray
        LinkedList<Integer> linkedList = new LinkedList<>(startingArray);

        //print out linkedList
        System.out.println("Here are the contents of the linked list:");
        System.out.println(linkedList);
    }
}
