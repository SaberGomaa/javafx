package first;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.RED;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author Saber
 */
public class First extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage Stage) throws Exception {

        Stage stage = new Stage();

        Group root = new Group();

        Scene scene = new Scene(root, 500, 500, Color.BLACK);

        stage.setTitle("الحمد لله");

        Image icon = new Image("cat.png");
        stage.getIcons().add(icon);
        stage.setResizable(false);

        Text label = new Text();
        label.setText("E-mail : ");
        label.setFont(Font.font("normal", 20));
        label.setLayoutX(10);
        label.setLayoutY(80);
        label.setFill(RED);

        Text label1 = new Text();
        label1.setText("Password : ");
        label1.setFont(Font.font("normal", 20));
        label1.setLayoutX(20);
        label1.setLayoutY(140);
        label1.setFill(RED);

        Text remember = new Text();
        remember.setText("Remember Me.");
        remember.setFont(Font.font("normal", 20));
        remember.setLayoutX(150);
        remember.setLayoutY(200);
        remember.setFill(RED);

        Text login = new Text();
        login.setText("Login");
        login.setFont(Font.font("verdana", 30));
        login.setX(200);
        login.setY(30);
        login.setFill(RED);

        TextField text = new TextField();
        text.setAlignment(Pos.TOP_LEFT);
        text.setLayoutX(120);
        text.setLayoutY(60);
        text.setFont(Font.font("verdana", 16));

        TextField text1 = new TextField();
        text1.setAlignment(Pos.TOP_LEFT);
        text1.setLayoutX(120);
        text1.setLayoutY(120);
        text1.setFont(Font.font("verdana", 16));

        CheckBox ch = new CheckBox();
        ch.setMaxSize(10, 10);
        ch.setLayoutX(120);
        ch.setLayoutY(180);

        Button btn = new Button();
        btn.setLayoutX(120);
        btn.setLayoutY(250);
        btn.setText("Log in");

        Button btn1 = new Button();
        btn1.setLayoutX(120);
        btn1.setLayoutY(300);
        btn1.setText("Sign up");

        root.getChildren().add(label);
        root.getChildren().add(btn);
        root.getChildren().add(btn1);
        root.getChildren().add(login);
        root.getChildren().add(label1);
        root.getChildren().add(remember);
        root.getChildren().add(text);
        root.getChildren().add(ch);
        root.getChildren().add(text1);
        stage.setScene(scene);
        stage.show();
    }

}
