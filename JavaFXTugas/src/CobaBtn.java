/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
/**
 *
 * @author ABHINAYA
 */
public class CobaBtn extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Tombol Misteri");
        btn.setLayoutX(500);
        btn.setLayoutY(250);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Selamat Anda Berhasil");
            }
        });
        
        Button btn2= new Button();
        btn2.setText("Coba Tekan Tombol Ini");
        btn2.setLayoutX(500);
        btn2.setLayoutY(400);
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Silahkan Coba Lagi");
            }
        });
        
        Group root = new Group();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        HBox root2= new HBox();
        for (int i=0; i<5; i++){
            Button a = new Button("Tombol " + i);
            root2.getChildren().add(a);
        }
        root2.setLayoutX(0);
        root2.setLayoutY(400);
        root.getChildren().add(root2);
        
        Scene scene = new Scene(root, 700, 640);
        
        primaryStage.setTitle("Mencoba FX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
