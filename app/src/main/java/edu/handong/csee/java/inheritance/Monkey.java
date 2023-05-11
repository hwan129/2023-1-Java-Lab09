package edu.handong.csee.java.inheritance;

class Monkey extends Animal {
    public static void testClassMethod() {
    	System.out.println("The static method in Monkey");		//hiding
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Monkey"); // Overriding
    }
}
