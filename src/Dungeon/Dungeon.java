package Dungeon;

import java.util.ArrayList;
import java.util.Random;

public class Dungeon {
    private int x;
    private int y;
    private ArrayList<Room> test = new ArrayList<>();

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public ArrayList<Room> getTest(){
        return test;
    }

    public void generateDungeon(){
        Random random = new Random();
        //Room start = new Room(0,0);
        boolean go = true;

        for(int i = 0; i < x; i ++){
            for(int j = 0; j < y; j++){
                if(random.nextBoolean() && go){
                    test.add(new Room(i, j));
                    go = false;
                }else{
                    go = true;
                }
            }
        }

    }
}
