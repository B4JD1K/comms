package bnow.app.comms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("mainWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);

        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.setResizable(true);

        stage.setTitle("Comms!");

        // close app on ESC
        stage.addEventHandler(KeyEvent.KEY_PRESSED, (KeyEvent event) -> {
            if (event.getCode() == KeyCode.ESCAPE) {
                stage.close();
            }
        });

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}