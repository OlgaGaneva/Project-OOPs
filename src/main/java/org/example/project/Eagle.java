package org.example.project;

public class Eagle extends Bird{
    @Override
    public void eat() {
        System.out.println("Eagles eat mouses");
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
