package application;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Welcomeforme extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        primaryStage.show();
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL,
        20));
        grid.add(scenetitle, 0, 0, 2, 1);
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        btn.setOnAction(e -> {
            actiontarget.setText("Sign in button pressed");
            actiontarget.setFill(Color.FIREBRICK);
        });
        
        Button exitBtn = new Button("Exit");
        HBox hbExitBtn = new HBox(10);
        hbExitBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbExitBtn.getChildren().add(exitBtn);
        grid.add(hbExitBtn, 0, 4);

        exitBtn.setOnAction(e -> {
            Platform.exit();
        });
        
        btn.setOnAction(e -> {
            String userNameValue = userTextField.getText();
            String passwordValue = pwBox.getText();
            if ("monMotDePasse".equals(passwordValue)) {
                actiontarget.setText("Welcome " + userNameValue );
                actiontarget.setFill(Color.GREEN);
            } else {
                actiontarget.setText("Incorrect password. Please try again.");
                actiontarget.setFill(Color.FIREBRICK);
            }
        });

    }
    public static void main(String[] args) {
        launch(args);
    }
}
