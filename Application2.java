import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Application2 {
    /**
     * It is very often going to be useful for us to compare Objects in some way:
     * eg, sorting, valuation, etc
     * -sort numbers
     * -sort names
     * -sort products in an ecommerce app by price
     * but it doesnt make any sense to compare
     * -scanner
     * -connection
     * -service class
     * @param args
     */
    public static void main(String[] args) {
        /**
         * How do we guarantee that any item that goes in a list is sortable?
         */
        List<Integer> intList = new ArrayList<>();
        List<Scanner> scannerList = new ArrayList<>();
        /**
         * EG, a TreeSet requires items to be sortable in order for them to fall within an ordered tree
         */
        Set<Integer> intSet = new TreeSet<>();
        Set<Scanner> scannerSet = new TreeSet<>();


        CompareMeToOther<String> compareMe1 = new CompareMeToOther<String>("cat");
        System.out.println(compareMe1.amIGreaterThanTheOther("dog"));
        System.out.println(compareMe1.amIGreaterThanTheOther("animal"));

        CompareMeToOther<Integer> compareMe2 = new CompareMeToOther<>(34);
        System.out.println(compareMe2.amIGreaterThanTheOther(4));
        System.out.println(compareMe2.amIGreaterThanTheOther(40));

        /**
         * Interfaces allow us to guarantee the behavior of an Object
         */

         Comparable myComparable = new String("1234");
         Comparable myComparable2 = new Integer(1234);

         myComparable.compareTo("xyz");

         /**
          * Interfaces are often referred to as a contract of behavior
          * they promise that the object will do xyz thing
          */
    }
}