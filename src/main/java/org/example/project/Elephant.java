package org.example.project;

public class Elephant extends Mammal{
    @Override
    public void eat() {
        System.out.println("Elephants eat leaves");
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
    }
}
