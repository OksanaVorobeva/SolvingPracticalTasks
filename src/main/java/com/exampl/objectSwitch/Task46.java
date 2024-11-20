package com.exampl.objectSwitch;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Task46 {
    //Методы equals() and hashCode()

    public static void main(String[] args) {
        Player player1=new Player(1,"Рафаэль");
        Player player2=new Player(1,"Рафаэль");
        System.out.println(player1.equals(player2));


        Set<Player> players=new HashSet<>();
        players.add(player1);
        players.add(player2);
        System.out.println(player1.hashCode());
        System.out.println(player2.hashCode());
        System.out.println(players.size());
        System.out.println(players.contains(new Player(1,"Рафаэль")));

    }


}
class Player{
    private int id;
    private String name;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.name);

        return hash;
    }
}