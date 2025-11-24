// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Main class
public class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();  // object of subclass
        d.eat();            // inherited method from Animal
        d.bark();           // method of Dog class
    }
}
