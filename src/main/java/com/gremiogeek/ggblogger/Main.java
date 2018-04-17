package com.gremiogeek.ggblogger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {

    public static Stage splashStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage splashStage) throws IOException {
        Parent splash = FXMLLoader.load(getClass().getResource("/com/gremiogeek/ggblogger/view/Splash.fxml"));
        Main.splashStage = splashStage;
        Main.splashStage.setTitle("GGBlogger");
        Main.splashStage.setScene(new Scene(splash,625,350));
        Main.splashStage.initStyle(StageStyle.UNDECORATED);
        Main.splashStage.setAlwaysOnTop(true);
        Main.splashStage.setResizable(false);

        Main.splashStage.show();
    }
}
