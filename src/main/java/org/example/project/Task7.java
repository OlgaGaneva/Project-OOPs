package org.example.project;

public class Task7 {
    //Count the Number of Words in a String: Write a function to count the
    //number of words in a given string. Words are separated by spaces or
    //punctuation. For example, the input "Hello, world!" should return 2.

    public static void main(String[] args) {
        String str="Hello, world!";
        int total= 1;
        int i = 0;
        while (i < str.length()) {

            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                total++;
            }
            i++;
        }
        System.out.println(total);
}

}
