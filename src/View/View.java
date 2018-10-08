package View;

import Controller.Controller;
import javafx.scene.layout.Pane;

public interface View {
    void create(Controller con);
    Pane getPane();
}
