package com.company;

public class Main {

    public static void main(String[] args) {
        JavierGomez laliga = new JavierGomez();

        LaLiga somePlayer = new LaLiga("Leo Messi");

        laliga.registerPlayers(somePlayer);

        laliga.addRankings("#1 Cristiano Ronaldo"+"\n");
        laliga.addRankings("#2 Thiago Silva"+"\n");
        laliga.addRankings("#3 Zlatan Ibrahimović"+"\n");
        laliga.addRankings("#4 Kylian Mbappé"+"\n");


    }
}
