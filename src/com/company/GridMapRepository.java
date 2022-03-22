package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GridMapRepository implements GridMapRepositoryInterface{
    private Map<Integer, HashSet<Integer>> gridMap;

    public GridMapRepository() {
        this.gridMap = new HashMap<>();
    }

    @Override
    public void put(int x, int y) {
        HashSet<Integer> yValues = new HashSet<>();
        yValues.add(y);
        gridMap.put(x, yValues);

    }

    @Override
    public HashSet<Integer> get(int key) {
        return gridMap.get(key);
    }
}
