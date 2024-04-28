package org.example.project;

public class Task2 {
    public static void main(String[] args) {
        String a="Hello**!";
        int count=0;
        for (int i = 0; i <a.length() ; i++) {
            a=a.replaceAll("[!@#%ˆ&*]","");
            count++;

        }
        System.out.println(count);

    }
}
