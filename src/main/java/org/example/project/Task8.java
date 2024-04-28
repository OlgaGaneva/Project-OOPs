package org.example.project;

import java.util.ArrayList;
import java.util.List;

public class Task8 {

    //You have a list of strings and you want to keep only those that start with “A”
    // and you want to return them in lower case".

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("America");
        list.add("Africa");
        list.add("Ukraine");
        list.add("China");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).startsWith("A")){
                System.out.println(list.get(i).toLowerCase());
            }
            }
        }

    }

