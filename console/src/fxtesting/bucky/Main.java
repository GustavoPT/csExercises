package fxtesting.bucky;

import Programs.UnitConverter.AlarmClock;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application
{
    Button button;
    Stage window;
    Scene scene1,scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;

        Label label1 = new Label("I wanna be the very best ");
        Button button1 = new Button("Go to Scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        Button alertButton = new Button("Go to alert");
        alertButton.setOnAction(e -> AlertBox.display("new box","this is the message"));
        VBox layout1 = new VBox(20);

        Text t = new Text("This is a text sample");

        layout1.getChildren().addAll(label1,button1);
        layout1.getChildren().addAll(alertButton);
        layout1.getChildren().add(t);

        scene1 = new Scene(layout1,600,300);

        Button button2 = new Button("This scene sucks go back to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);

        scene2 = new Scene(layout2,600,300);
        window.setScene(scene1);
        window.setTitle("Home Scene");
        window.show();

    }

//    @Override
//    public void handle(ActionEvent event) {
//        if(event.getSource() == button){
//            System.out.println("ooohhhhh");
//        }
//    }

}
