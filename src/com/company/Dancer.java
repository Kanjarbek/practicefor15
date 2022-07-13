package com.company;

public class Dancer extends Person {
    private String groupName;

    public Dancer() {
    }

    public Dancer(String groupName) {
        this.groupName = groupName;
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    void dancing(){
        System.out.println("dancing");
    }

    public Dancer(String name, String designation)
    {
        super(name, designation);

        }

    @Override
    public String toString() {
        return getName()+" " + getDesignation() + " "+ groupName;

    }
}
