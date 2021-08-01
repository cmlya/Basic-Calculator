import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static final int STAGE_WIDTH = 350;
    public static final int STAGE_HEIGHT = 600;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("calculator.fxml")));
        primaryStage.setTitle("Calculator");
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("calculatorIcon.png")));
        primaryStage.getIcons().add(icon);
        primaryStage.setScene(new Scene(root, STAGE_WIDTH, STAGE_HEIGHT));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
