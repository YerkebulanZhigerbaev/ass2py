package com.company;
import java.util.List;

public class LaLiga implements Observer{

    private String name;

    public LaLiga(String name){
        this.name = name;
    }

    @Override
    public void update(List<String> rankings) {
        System.out.println("Hey "+this.name+"\n The rankings have been changed!:\n" + rankings +"\n");
    }
}
