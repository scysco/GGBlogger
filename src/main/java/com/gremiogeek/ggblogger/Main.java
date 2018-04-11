package com.gremiogeek.ggblogger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent splash = FXMLLoader.load(getClass().getResource("/com/gremiogeek/ggblogger/view/Splash.fxml"));
        primaryStage.setTitle("GGBlogger");
        primaryStage.setScene(new Scene(splash,625,350));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setResizable(false);

        primaryStage.show();
    }
}
