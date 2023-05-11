package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");	//hiding
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");	//Overriding
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;		//polymorphism,  upcasting
        Animal.testClassMethod();		//hiding
        myAnimal.testInstanceMethod();	//overriding
        
        Dog myDog = new Dog();
        Animal myAnimal1 = myDog;		//polymorphism,  upcasting
        Animal.testClassMethod();		//hiding
        myAnimal1.testInstanceMethod();	//overriding
        
        Monkey myMonkey = new Monkey();
        Animal myAnimal2 = myMonkey;	//polymorphism,  upcasting
        Animal.testClassMethod();		//hiding
        myAnimal2.testInstanceMethod();	//overriding
    }
}