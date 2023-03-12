package com.example.mediaplayerdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Horizon23");
        Text text = new Text("Hello!");
        text.setFont(Font.font("Arial"));
        text.setFill(Color.YELLOW);
        text.setStroke(Color.GREEN);
        text.setX(50);
        text.setY(25);
        text.setTextOrigin(VPos.BASELINE);


        stage.setScene(scene);
        stage.isFullScreen();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}