import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Car myTruck = new Truck();
        /*
         * myTruck is a Truck, which inherits all of the behavior of Car
         * including the move() method
         * 
         * INHERITANCE
         * 
         * POLYMORPHISM
         * 
         * compile-time (method overloading), run-time (overriding)
         * 
         * ENCAPSULATION
         * encapsulation has to do with the ability for an object to 'hide' its data
         * access modifiers - public, protected, default, private
         * public - accessible everywhere
         * protected - accessible within package and subclasses
         * default - accessfible within package
         * private - accessible only within class
         * Encapsulation contains everything in a single unit
         * 
         * Abstraction - avoiding complicated implementation details, referring to human-readable
         * descriptions of code instead - 'simplification'
         * multiple ways to achieve this - the best way is interfaces
         */
        myTruck.move();
        
        List<Animal> animals = new ArrayList();
        List<Animal> animals2 = new LinkedList();
        Animal kitty = new Cat();

        /**
         * A class can only immediately extend one other class
         * (multiple inheritance - we want to avoid conflicts when inheriting fields/methods)
         * if we want to have an extremely useful class, we may have a class that implements multiple interfaces
         * 'whats the difference between extends and inherits'
         * 
         * 
         * 
         * INHERITANCE
         * POLYMORPHISM
         * ENCAPSULATION
         * ABSTRACTION
         * 
         * thursday - generics, interfaces
         */
    }
}
