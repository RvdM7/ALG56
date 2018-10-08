package View;

import Controller.Controller;
import Dungeon.*;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class GridView implements View{
    private GridPane gp = new GridPane();
    private Dungeon dg;

    public GridView(Dungeon dg){
        this.dg = dg;
    }

    public void create(Controller con){
        gp.setPadding(new Insets(10, 10, 10, 10));
        gp.setHgap(5);
        gp.setVgap(5);
        gp.setAlignment(Pos.CENTER);

        gp.setGridLinesVisible(true);

        for (Room d : dg.getTest()) {
            gp.add(new Text("R"), d.getX(), d.getY());
        }
    }

    public Pane getPane(){
        return gp;
    }

}
