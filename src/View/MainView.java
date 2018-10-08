package View;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import Controller.Controller;

public class MainView implements View{
    private GridPane gp = new GridPane();

    public void create(Controller con){
        Button b1 = new Button("Go");
        Text t1 = new Text("X:");
        Text t2 = new Text("Y:");
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();

        b1.setOnAction((ActionEvent av) -> {
            if(!tf1.getText().isEmpty() && !tf2.getText().isEmpty()){
                con.toGV(5, 5);
            }
        });

        gp.setMinSize(400, 200);

        gp.setPadding(new Insets(10, 10, 10, 10));

        gp.setVgap(5);
        gp.setHgap(5);

        gp.setAlignment(Pos.CENTER);

        gp.add(t1, 0, 0);
        gp.add(tf1, 1, 0);
        gp.add(t2, 0, 1);
        gp.add(tf2, 1, 1);
        gp.add(b1, 0, 2);
    }

    public Pane getPane(){
        return gp;
    }
}
