import Controller.Controller;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage stage) {
        Controller con = new Controller();

        stage.setTitle("ALGA56");
        stage.setScene(con.getScene());
        stage.show();
    }

}
