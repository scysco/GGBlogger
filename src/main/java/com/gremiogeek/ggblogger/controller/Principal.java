package com.gremiogeek.ggblogger.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.web.WebView;

import java.io.IOException;
import java.net.URL;

public class Principal {
    public BorderPane pnlMenu;

    public BorderPane pnlPrincipal;
    public FlowPane btnInicio;
    public FlowPane btnInsertar;
    public FlowPane btnRevisar;
    public FlowPane btnPublicar;

    public WebView webView;

    public void initialize(){
        changePane("Inicio");
        btnInicio.setStyle("-fx-background-color:#081828;");
        URL url = this.getClass().getResource("/com/gremiogeek/ggblogger/view/editor.html");
        webView.getEngine().load(url.toString());
    }

    public void clickInicio(MouseEvent mouseEvent) {
        changePane("Inicio");
        changeColor(btnInicio);
    }

    public void clickInsertar(MouseEvent mouseEvent) {
        changePane("Insertar");
        changeColor(btnInsertar);
    }

    public void clickRevisar(MouseEvent mouseEvent) {
        changePane("Revisar");
        changeColor(btnRevisar);
    }

    public void clickPublicar(MouseEvent mouseEvent) {
        changePane("Publicar");
        changeColor(btnPublicar);
    }

    private void changePane(String pane){
        FlowPane fxml = new FlowPane();
        try {
            fxml = FXMLLoader.load(getClass().getResource("/com/gremiogeek/ggblogger/view/principal/" +pane+".fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pnlMenu.setCenter(fxml);
    }

    private void changeColor(FlowPane boton){
        btnInicio.setStyle("-fx-background-color:#7dc43a;");
        btnInsertar.setStyle("-fx-background-color:#7dc43a;");
        btnRevisar.setStyle("-fx-background-color:#7dc43a;");
        btnPublicar.setStyle("-fx-background-color:#7dc43a;");
        boton.setStyle("-fx-background-color:#081828;");
    }

    public void htmlGen(MouseEvent mouseEvent) {
        System.out.println((String) webView.getEngine().executeScript("document.documentElement.outerHTML"));
        //webView.getEngine().reload();
    }
}
