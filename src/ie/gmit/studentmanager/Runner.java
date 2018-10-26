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
		Button buttonLoadDB = new Button("Load DB");
		Button buttonAdd = new Button("Add Student");
		Button buttonDelete = new Button("Delete Student");
		Button buttonSearchByID = new Button("Search by ID");
		Button buttonSearchByFirstName = new Button("Search by First Name");
		Button buttonShowTotal = new Button("Show Total Students");
		Button buttonSaveDB = new Button("Save DB");
		Button buttonQuit = new Button("Quit");	
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
		myGridPane.add(buttonLoadDB, 0, 1);
		myGridPane.add(buttonAdd, 0, 2);
		myGridPane.add(buttonDelete, 0, 3);
		myGridPane.add(buttonSearchByID, 0, 4);
		myGridPane.add(buttonSearchByFirstName, 0, 5);
		myGridPane.add(buttonShowTotal, 0, 6);
		myGridPane.add(buttonSaveDB, 0, 7);
		myGridPane.add(buttonQuit, 0, 8);
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
