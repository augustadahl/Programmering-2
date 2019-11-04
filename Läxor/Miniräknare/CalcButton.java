package Miniräknare;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class CalcButton extends Group{

	Rectangle Background = new Rectangle();
	Text display = new Text(25, 27, "");
	String function;
	
	public CalcButton(String function, Color BackCol, Color TextCol, double scale) {
		Background.setWidth(50 * scale);
		Background.setHeight(50 * scale);
		Background.setFill(BackCol);
		this.getChildren().add(Background);
				
		display.setFont(Font.font("Verdana", FontWeight.BOLD, 30 * scale));
		display.setFill(TextCol);
		display.setText(function);
		display.setTranslateX(-display.getBoundsInLocal().getWidth() / 2);
		display.setTranslateY(display.getBoundsInLocal().getHeight() / 4);
		this.getChildren().add(display);
		
		this.function = function;
		
		Background.setOnMousePressed(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
                Background.setFill(BackCol.darker());
                display.setFill(TextCol.darker());
                pressed();
            }
        });	
		Background.setOnMouseReleased(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
                Background.setFill(BackCol);
                display.setFill(TextCol);
                
            }
        });
		
		display.setOnMousePressed(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
            	Background.setFill(BackCol.darker());
                display.setFill(TextCol.darker());
                pressed();
            }
        });	
		display.setOnMouseReleased(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
            	Background.setFill(BackCol);
                display.setFill(TextCol);

            }
        });
	
		
	
	}
	
	private void pressed() {
		CalcEngine.input(function);
	}
	
	
}
