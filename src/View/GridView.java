package View;

import Controller.Controller;
import Dungeon.*;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;
import javafx.stage.Screen;

public class GridView implements View{
    private GridPane gp = new GridPane();
    private Dungeon dg;

    public GridView(Dungeon dg){
        this.dg = dg;
    }

    public void create(Controller con){
        Rectangle2D boundaries = Screen.getPrimary().getVisualBounds();
        ColumnConstraints ccHor = new ColumnConstraints(boundaries.getHeight());
        RowConstraints ccVer = new RowConstraints(boundaries.getWidth());
        ccHor.setPercentWidth(100.0/5);
        ccVer.setPercentHeight(100.0/5);



        gp.setPadding(new Insets(10, 10, 10, 10));
        gp.setHgap(5);
        gp.setVgap(5);
        gp.setAlignment(Pos.CENTER);

        gp.setGridLinesVisible(true);

        for (Room d : dg.getTest()) {
            gp.add(new Text("R"), d.getX(), d.getY());
            gp.getColumnConstraints().addAll(ccHor);
            gp.getRowConstraints().addAll(ccVer);
        }
    }

    public Pane getPane(){
        return gp;
    }

}
