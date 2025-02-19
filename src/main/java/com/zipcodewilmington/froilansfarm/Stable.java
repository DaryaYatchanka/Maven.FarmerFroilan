package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Iterator;

public class Stable extends AnimalStorage<Horse> {

    ArrayList<Horse> horses = new ArrayList<>();

    public void remove(Horse horse) {
        horses.remove(horse);
    }

    public void add(Horse horse){
        horses.add(horse);
    }

    public ArrayList<Horse> getHorses(){
        return horses;
    }

    public Iterator iterator(){
        return horses.iterator();
    }
}
