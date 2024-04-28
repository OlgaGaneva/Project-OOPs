package org.example.project;

public class Task9 {
    //Find the First Non-Repeating Character in a String: Given a string,
    // find and return the first non-repeating character.
    // For example, in the string "abracadabra", the first non-repeating character is 'c'.
    public static void main(String[] args) {

        String str="abracadabra";
        int index=-1;
        char c=' ';
        for (char i:str.toCharArray()) {
            if(str.indexOf(i) == str.lastIndexOf(i)){
                c=i;
                break;
            }else{
                index +=1;
            }
        }
        if(index==1){
            System.out.println("all characters are repeating");
        }else{
            System.out.println("first non-repeated character is "+c);
        }
    }

}
