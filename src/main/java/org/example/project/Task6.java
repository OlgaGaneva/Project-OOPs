package org.example.project;

public class Task6 {
    public static String countVowels(String word){


        return word.replaceAll("[^euioa]","");
    }

    public static void main(String[] args) {
        System.out.println(Task6.countVowels("anagram").length());

    }

}
