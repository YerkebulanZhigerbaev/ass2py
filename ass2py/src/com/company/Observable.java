package com.company;

public interface Observable {
    void registerPlayers(Observer player);
    void unregisterPlayers(Observer player);
    void notifyAllPlayers();
}
