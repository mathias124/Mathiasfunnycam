package com.example.mathiasfunnycam;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private StackPane cameraPane; // New StackPane to hold the camera view

    @FXML
    protected void initialize() {
        // Create a Media object representing the camera feed
        String mediaSource = "file:///C:/Users/mfs20/Downloads/mælk.mp4";
        Media media = new Media(mediaSource);

        // Create a MediaPlayer to play the media
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);

        // Create a MediaView to display the media player
        MediaView mediaView = new MediaView(mediaPlayer);

        // Add the MediaView to the StackPane
        cameraPane.getChildren().add(mediaView);
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
