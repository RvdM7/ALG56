package Dungeon;

import javafx.scene.layout.Region;

import java.util.Set;

public class Room extends Region {
    char symbol = 'R';

    private int x;
    private int y;

    public Room(int x, int y){
        this.x = x;
        this.y = y;
    }

    private Set<Room> closeRooms;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
