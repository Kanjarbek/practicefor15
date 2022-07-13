package com.company;

public class Singer extends Person {
    private String bandName;

    public Singer() {
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    void singing(){
        System.out.println("singing");
    }
    void playGitar(){
        System.out.println("playGitar");
    }

    public Singer(String name, String designation){
        super(name, designation);
    }

    @Override
    public String toString() {
        return getName() +" "+ getDesignation() +" "+ bandName;

    }
}
