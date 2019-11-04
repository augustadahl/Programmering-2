package Miniräknare;

import com.sun.xml.internal.ws.dump.LoggingDumpTube.Position;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Calculator extends Application{

	private static final String[] label = {"AC","7","8","9","/","4","5","6","x","1","2","3","-","0",".","=","+"};
	
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root,500,500,Color.SKYBLUE);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Button[] buttons = new Button[17];
		double position = 0;
		
		
		
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new Button(label[i]);
			root.getChildren().add(buttons[i]);
			
			
			buttons[i].setTranslateX(position);
			position += 30;
			
			buttons[i].setOnAction(e -> System.out.println());
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
