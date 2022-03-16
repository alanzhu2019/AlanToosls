package com.alan.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App extends Application {

    public static Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        Label label = new Label("你好！");
        BorderPane borderPane = new BorderPane(label);

        Scene scene = new Scene(borderPane,900,500);
        stage.setScene(scene);
        logger.debug("log4j 测试！");
        stage.setTitle("alan的工具箱");
        stage.getIcons().add(new Image("image/logo.png"));
        stage.show();

    }


}
