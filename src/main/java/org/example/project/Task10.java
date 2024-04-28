package org.example.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {

    //How can you remove all duplicates from ArrayList?
    ArrayList<Integer> integers=new ArrayList<>(new LinkedHashSet<>());
    integers.add(10);
    integers.add(30);
    integers.add(10);
    integers.add(50);
    integers.add(1);
        Set<Integer> s=new LinkedHashSet<>(integers);
        System.out.println(s);

}
}