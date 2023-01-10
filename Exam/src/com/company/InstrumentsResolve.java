package com.company;

public class InstrumentsResolve {
    int instrument;
    InstrumentsResolve(){

    }
    InstrumentsResolve (int instrument){
    this.instrument = instrument;

}

    public void play (){
        int num = (int) Math.round(Math.random() * 5);

        switch (instrument){
            case 1:
                System.out.println("Guitar is playing now");
                break;
            case 2:
                System.out.println("Drums are playing now");
                break;
            case 3:
                System.out.println("Flute is playing now");
                break;
            case 4:
                System.out.println("Guitar and drums are playing now");
                break;
            case 5:
                System.out.println("Drums and flute are playing now");
                break;
            default:
                System.out.println("Wrong number");
        }

}
}
