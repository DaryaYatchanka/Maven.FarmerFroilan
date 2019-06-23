package com.zipcodewilmington.froilansfarm;




public class FarmHouse extends House {

    public static FarmHouse getInstance() {
        return Instance;
    }


    private final static FarmHouse Instance= new FarmHouse();
    private Refrigerator<Edible> fridge;
    private Tractor tractor;
    private CropDuster cropDuster;
    private CombineHarvester combineHarvester;

    private FarmHouse() {
        fridge = new Refrigerator<Edible>();
    }

    public Refrigerator<Edible> getFridge(){
        return fridge;
    }




}
