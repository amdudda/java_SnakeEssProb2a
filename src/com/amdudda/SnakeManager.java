package com.amdudda;

import java.util.Collections;
import java.util.LinkedList;

public class SnakeManager {

    public static void main(String[] args) {
	// write your code here

        // create a linked list of snakes
        LinkedList<Snake> snakelist = new LinkedList<Snake>();
        snakelist.add(new Snake("Rattlesnake",4));
        snakelist.add(new Snake("Sea Snake",9));
        snakelist.add(new Snake("Green Mamba",9));
        snakelist.add(new Snake("Cobra",5));
        snakelist.add(new Snake("Boa Constrictor", 0));

        // then sort it and print out the results.
        Collections.sort(snakelist);
        for (Snake s:snakelist) {
            System.out.println(s);
        }
    }
}
