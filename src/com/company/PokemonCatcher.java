package com.company;

import java.util.HashSet;
import java.util.InputMismatchException;

public class PokemonCatcher {

    private final GridMapRepositoryInterface gridMap;
    private int pokemonCount;
    private int x;
    private int y;

    public PokemonCatcher(){
        gridMap = new GridMapRepository();
        pokemonCount = 1;
        x = 0;
        y = 0;
        gridMap.put(x, y);
    }

    public int getPokemonCount() {
        return pokemonCount;
    }

    public void move(String input){
        for(int i = 0; i < input.length(); i++){
            switch (input.charAt(i)) {
                case 'N' -> y++;
                case 'S' -> y--;
                case 'E' -> x++;
                case 'O' -> x--;
                default -> throw new InputMismatchException("Your input cannot contain characters other than N,S,E,O");
            }
            pokemonCount += checkPokemonSlot();

//            System.out.println("x: " + x);
//            System.out.println("y: " + y);
//            System.out.println("pokemonCount: " + pokemonCount);
//            System.out.println("--------------- ");
        }
    }

    private int checkPokemonSlot(){
        int count = 0;
        HashSet<Integer> yValues = gridMap.get(x);

        if(yValues != null){
            if(!yValues.contains(y)){
                yValues.add(y);
                count++;
            }
        }else{
            gridMap.put(x, y);
            count++;
        }

        return count;
    }
}
