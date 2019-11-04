package Miniräknare;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class CalcWindow extends Group{

	Rectangle Window = new Rectangle();
	Text display = new Text(10, 27, "");
	
	public CalcWindow() {
		
		Window.setWidth(200);
		Window.setHeight(50);
		Window.setFill(Color.WHITE);
		this.getChildren().add(Window);
		
		display.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
		display.setFill(Color.BLACK);
		display.setTranslateX(-display.getBoundsInLocal().getWidth() / 2);
		display.setTranslateY(display.getBoundsInLocal().getHeight() / 4);
		this.getChildren().add(display);
	}
	
	public void set(String text) {
		display.setText(text);
	}
	
}
