package org.example.project;

public class Task4 {
    public static void main(String[] args) {
        String str="hello";
        StringBuilder s=new StringBuilder(str);
        String pal=s.reverse().toString();
        if(str.equals(pal)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }

    }
}
