


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {
   
    	
    
	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	private Button b1, b2,b3,b4,b5,b6;
	Label l1;
	TextField tf1;
	HBox box1,box2;
	//student Task #4:
	//  declare an instance of DataManager
	DataManager DM;
	
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		b1=new Button("Hello");
		b2=new Button("Howdy");
		b3=new Button("Chinese");
		b4=new Button("Clear");
		b5=new Button("Exit");
		b6=new Button("Francois");

		b1.setOnAction(new ButtonHandler());
		b2.setOnAction(new ButtonHandler());
		b3.setOnAction(new ButtonHandler());
		b4.setOnAction(new ButtonHandler());
		b5.setOnAction(new ButtonHandler());
		b6.setOnAction(new ButtonHandler());
		Insets ins= new Insets(10);
		l1= new Label("Text:");
		tf1=new TextField();
		box1=new HBox();
		box2=new HBox();
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		DM=new DataManager();
		  HBox.setMargin(b1, ins);
		  HBox.setMargin(b2, ins);
		  HBox.setMargin(b3, ins);
		  HBox.setMargin(b4, ins);
		  HBox.setMargin(b5, ins);
		  HBox.setMargin(b6, ins);

		  HBox.setMargin(tf1, ins);
		  box1.setAlignment(Pos.CENTER);
		  box2.setAlignment(Pos.CENTER);
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		box1.getChildren().addAll(b1,b2,b3,b4,b5,b6);
		box2.getChildren().addAll(l1,tf1);
		this.getChildren().addAll(box1,box2);
		
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	 private class ButtonHandler implements EventHandler<ActionEvent>{
		 @Override
		 public void handle(ActionEvent event) {
				
				Object source = event.getTarget();
				if (source == b1)
				{
					tf1.setText(DM.getHello());
				}
				else if(source == b2)
				{
					tf1.setText(DM.getHowdy());
				}
				else if(source == b3)
				{
					tf1.setText(DM.getChinese());
				}
				else if(source == b4)
				{
					tf1.setText("");
				}
				else if(source == b5)
				{
					Platform.exit();
					System.exit(0);
				}
				else if(source == b6)
				{
					tf1.setText(DM.getFrench());
				}
			}
		 
	 }
}
	