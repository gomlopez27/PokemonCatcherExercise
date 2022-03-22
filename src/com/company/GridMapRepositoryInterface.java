package com.company;

import java.util.HashSet;

public interface GridMapRepositoryInterface {
    /*Adds new entry to map grip*/
    void put(int x, int y);
    /*Returns the values of a key*/
    HashSet<Integer> get(int key);
}
