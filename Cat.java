public class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("cat says meow");
        
    }

    @Override
    public void move() {
        System.out.println("cats move very quietly");
    }
    
}
