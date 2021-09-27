package com.company;

import java.util.ArrayList;
import java.util.List;

public class JavierGomez implements Observable {

    private List<String> rankings = new ArrayList<>();
    private List<Observer> player = new ArrayList<>();

    public void addRankings(String player) {
        this.rankings.add(player);
        notifyAllPlayers();
    }

    public void removeRankings(String player) {
        this.rankings.remove(player);
        notifyAllPlayers();
    }


    @Override
    public void registerPlayers(Observer player) {
        this.player.add(player);

    }

    @Override
    public void unregisterPlayers(Observer player) {
        this.player.remove(player);
    }

    @Override
    public void notifyAllPlayers() {
        for(Observer player:player){
            player.update(this.rankings);
        }
    }


}