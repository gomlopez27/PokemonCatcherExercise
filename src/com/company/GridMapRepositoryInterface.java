package com.company;

import java.util.HashSet;

/**
 * This interface was created to provide an abstraction level to handle the data structures.
 * This way, if in the future we decide to add a database, it is easier to change the code.
 */
public interface GridMapRepositoryInterface {
    /*Adds new entry to map grip*/
    void put(int x, int y);
    /*Returns the values of a key*/
    HashSet<Integer> get(int key);
}
