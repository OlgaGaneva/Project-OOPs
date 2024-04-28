package org.example.project;

public class ZooTester {
    public static void main(String[] args) {
        Animals [] zoo={new Mammal(),new Bird(),new Lion(12,"Jimmy"),new Eagle(),new Parrot(),new Elephant()};
        for(Animals a:zoo ){
            a.eat();
            a.sleep();
            a.makeSound();
            a.displayInformation();
        }
    }
}
