package ie.gmit.studentmanager;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Runner extends Application {

	@Override
	public void start(Stage primaryStage) {

		Text myText = new Text("Please select a Menu Option below:");
		Button button1 = new Button("Button 1");
		Button button2 = new Button("Button 2");
		Button button3 = new Button("Button 3");
		Button button4 = new Button("Button 4");
		Button button5 = new Button("Button 5");
		Button button6 = new Button("Button 6");
		Button button7 = new Button("Button 7");
		Button button8 = new Button("Button 8");	
		TextArea myOutput = new TextArea();

		GridPane myGridPane = new GridPane();

		// Setting the padding
		myGridPane.setPadding(new Insets(10, 10, 10, 10));

		// Setting the vertical and horizontal gaps between the columns
		myGridPane.setVgap(10);
		myGridPane.setHgap(10);

		// Setting the Grid alignment
		myGridPane.setAlignment(Pos.CENTER);

		// Arranging all the nodes in the grid
		myGridPane.add(myText, 0, 0);
		myGridPane.add(button1, 0, 1);
		myGridPane.add(button2, 0, 2);
		myGridPane.add(button3, 0, 3);
		myGridPane.add(button4, 0, 4);
		myGridPane.add(button5, 0, 5);
		myGridPane.add(button6, 0, 6);
		myGridPane.add(button7, 0, 7);
		myGridPane.add(button8, 0, 8);
		myGridPane.add(myOutput, 0, 9);

		/* Preparing the Scene */
		// Create a Scene by passing the root group object, height and width
		Scene scene = new Scene(myGridPane, 500, 500);

		/* Preparing the Stage (i.e. the container of any JavaFX application) */
		// Setting the title to Stage.
		primaryStage.setTitle("Student Manager Application");
		// Setting the scene to Stage
		primaryStage.setScene(scene);
		// Displaying the stage
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
