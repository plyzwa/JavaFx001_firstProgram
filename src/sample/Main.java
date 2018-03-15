package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
   //     Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        primaryStage.setTitle("This is JavaFX");
        primaryStage.setScene(new Scene(root, 600, 500));


        Label label = new Label("This is JavaFX!");
        label.setTextFill(Color.BLUE);
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
        root.getChildren().add(label);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
