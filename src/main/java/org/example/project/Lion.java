package org.example.project;

import java.sql.SQLOutput;

public class Lion extends Mammal{
       public void eat(){
            System.out.println("Lions eat meat");
        }

    @Override
    public void makeSound() {
        System.out.println("Lions Rrrrr");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
    }
    Lion(int age, String name){
        System.out.println(name+" "+age);
    }
}
