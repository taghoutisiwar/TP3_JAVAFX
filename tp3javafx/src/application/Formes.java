package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Formes extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Création de la ligne
        Line line = new Line(50, 50, 200, 200);
        line.setStroke(Color.BLUE);
        line.setStrokeWidth(3);
        
        // Création du rectangle
        Rectangle rectangle = new Rectangle(100, 100, 100, 50);
        rectangle.setFill(Color.RED);
        
        // Création du cercle
        Circle circle = new Circle(300, 150, 50);
        circle.setFill(Color.GREEN);
        
        // Ajout des formes au pane
        Pane pane = new Pane();
        pane.getChildren().addAll(line, rectangle, circle);
        
        // Création de la scène
        Scene scene = new Scene(pane, 400, 300);
        
        // Affichage de la scène
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

