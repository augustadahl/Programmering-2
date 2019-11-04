package Miniräknare;

import com.sun.java.swing.plaf.windows.resources.windows;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainCalc extends Application {
	
	static CalcWindow window = new CalcWindow();
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, 200, 300, Color.LIGHTBLUE);
		primaryStage.setScene(scene);
		primaryStage.show();

		
		root.getChildren().add(window);

		String[] label = {"7", "8", "9", "/", "4", "5", "6", "x", "1", "2", "3", "-", "0", ".", "=", "+", "AC" };

		for (int i = 0; i < label.length; i++) {
			CalcButton button = new CalcButton(label[i], Color.LIGHTBLUE, Color.DIMGRAY, 1);
			button.setTranslateX((i % 4) * 50);
			button.setTranslateY(50 + ((int) i / 4) * 50);
			root.getChildren().add(button);
		}
		
	}
	
	public static void settext(Double in) {
		window.set(Double.toString(in));
	}

	public static void main(String[] args) {
		launch();
	}

}
