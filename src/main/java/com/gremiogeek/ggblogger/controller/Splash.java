package com.gremiogeek.ggblogger.controller;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;

import javafx.scene.image.ImageView;

import java.io.IOException;

public class Splash {

    @FXML
    public Label lblGG;
    public ImageView logo;
    public BorderPane pane;

    private BorderPane form;

    public Splash(){
        Parent splashForm = null;
        try {
            splashForm = FXMLLoader.load(getClass().getResource("/com/gremiogeek/ggblogger/view/SplashForm.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        form = (BorderPane) splashForm;
    }

    @FXML
    public void initialize(){
        startSplashInitAnimation();
    }

    private void startSplashInitAnimation(){
        Timeline timeline = new Timeline();

        KeyFrame initKF = new KeyFrame(Duration.ZERO,
                new KeyValue(logo.rotateProperty(),0),
                new KeyValue(logo.opacityProperty(), 0),
                new KeyValue(logo.fitWidthProperty(), 124),
                new KeyValue(logo.fitHeightProperty(), 133),
                new KeyValue(logo.translateYProperty(), 0),
                new KeyValue(lblGG.opacityProperty(),1));

        KeyFrame firstKF = new KeyFrame(new Duration(1000),
                new KeyValue(logo.rotateProperty(),45),
                new KeyValue(logo.opacityProperty(), 1));

        KeyFrame secondKF = new KeyFrame(new Duration(1500),
                new KeyValue(logo.rotateProperty(),45),
                new KeyValue(logo.opacityProperty(), 1),
                new KeyValue(logo.fitWidthProperty(), 124),
                new KeyValue(logo.fitHeightProperty(), 133),
                new KeyValue(logo.translateYProperty(), 0),
                new KeyValue(lblGG.opacityProperty(),1),
                new KeyValue(lblGG.prefHeightProperty(),139));

        KeyFrame thirdKF = new KeyFrame(new Duration(2500),
                new KeyValue(logo.fitWidthProperty(), 102),
                new KeyValue(logo.fitHeightProperty(), 65),
                new KeyValue(lblGG.prefHeightProperty(), 0),
                new KeyValue(lblGG.opacityProperty(),0));
        
        KeyFrame fourthKF = new KeyFrame(new Duration(3000),
                new KeyValue(form.prefHeightProperty(),0),
                new KeyValue(pane.bottomProperty(),form));

        KeyFrame fifthKF = new KeyFrame(new Duration(3500),
        new KeyValue(form.prefHeightProperty(), 260));

        timeline.getKeyFrames().addAll(initKF,firstKF,secondKF,thirdKF,fourthKF,fifthKF);
        timeline.play();
    }
}
