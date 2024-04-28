package org.example.project;

public class Bird extends Animals{

            @Override
            public void eat() {
                System.out.println("Birds eat grain");
            }

            @Override
            public void makeSound() {
                System.out.println("Birds tweets");
            }

            @Override
            public void displayInformation() {
                System.out.println("Birds are small");
            }
    }
