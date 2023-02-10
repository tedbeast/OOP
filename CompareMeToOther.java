/** 
 * this class can take in a generic type that *must* implement comparable
 * so that it can compare its contained object with other objects of the same type
 * 
 * T's should be Comparable to other T's
 * (eg, Strings should be Comparable to other Strings etc)
 * otherwise, there's simply no way to write comparison logic at all
*/
public class CompareMeToOther<T extends Comparable<T>> {
    T item;
    public CompareMeToOther(T item){
        this.item = item;
    }
    /**
     * Compare my object to the other's object.
     * Eg, if String, then comparing Dog - Cat should return true, but comparing Apple -Banana should return false (dictionary order)
     * if Int, then comparing 1 - 2 should return false, but comparing 4 -3 should return true (numeric ordering)
     * If Date, then comparing 2/9 - 1/9 should return true, but comparing 2/9 - 2/10 should return false (temporal ordering)
     * 
     * eg, I could sort dates, ints, strings all with the same piece of code
     * 
     * Interfaces guaranteeing that behavior exists
     * Generics can stand in for any type of Object
     * @return
     */
    boolean amIGreaterThanTheOther(T other){
        int value = item.compareTo(other);
        if(value>0){
            /**
             * my generic's value is greater than the other
             */
            return true;
        }
        /** my generic's value is less than the other */
        return false;
    }
    
}