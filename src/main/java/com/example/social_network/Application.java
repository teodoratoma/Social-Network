package com.example.social_network;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Application extends javafx.application.Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/social_network/signIn.fxml")));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/main/resources/icons/icon.png"));
        stage.setResizable(false);
        stage.setTitle("Social Network");
        stage.show();
    }
}
