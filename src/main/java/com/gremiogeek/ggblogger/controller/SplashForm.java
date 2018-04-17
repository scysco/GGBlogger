package com.gremiogeek.ggblogger.controller;

import com.gremiogeek.ggblogger.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class SplashForm {
    public void newBlog(MouseEvent mouseEvent) {
        Main.splashStage.close();
        Stage principal = new Stage();
        try {
            principal.setScene(new Scene(FXMLLoader.load(getClass().getResource("/com/gremiogeek/ggblogger/view/Principal.fxml")),800,600));
        } catch (IOException e) {
            e.printStackTrace();
        }
        principal.setTitle("GGBlogger");
        principal.setMaximized(true);

        principal.show();
    }
}
