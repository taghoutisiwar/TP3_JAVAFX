package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {

    TextField display;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnAdd, btnSub, btnMult, btnDiv, btnEquals, btnClear;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        display = new TextField();
        display.setEditable(false);
        display.setAlignment(Pos.CENTER_RIGHT);

        btn0 = new Button("0");
        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");

        btnAdd = new Button("+");
        btnSub = new Button("-");
        btnMult = new Button("*");
        btnDiv = new Button("/");
        btnEquals = new Button("=");
        btnClear = new Button("C");

        HBox row1 = new HBox(5, btn7, btn8, btn9, btnDiv);
        HBox row2 = new HBox(5, btn4, btn5, btn6, btnMult);
        HBox row3 = new HBox(5, btn1, btn2, btn3, btnSub);
        HBox row4 = new HBox(5, btnClear, btn0, btnEquals, btnAdd);

        VBox vbox = new VBox(10, display, row1, row2, row3, row4);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
