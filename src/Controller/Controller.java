package Controller;

import Dungeon.Dungeon;
import View.GridView;
import View.MainView;
import javafx.scene.Scene;

public class Controller {
    Scene scene;
    Dungeon dg = new Dungeon();
    MainView mv = new MainView();
    GridView gv;


    public Controller(){
        mv.create(this);
        scene = new Scene(mv.getPane(), 600, 600);
    }

    public Scene getScene(){
        return scene;
    }

    public void toGV(int x, int y){
        dg.setX(x);
        dg.setY(y);
        dg.generateDungeon();
        gv = new GridView(dg);
        gv.create(this);
        scene.setRoot(gv.getPane());
    }

    public void toMV(){
        scene.setRoot(mv.getPane());
    }
}
