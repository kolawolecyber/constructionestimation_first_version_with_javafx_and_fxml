package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class steelestimationswitch {
	private Stage stage;
	private Scene scene;
	
	public void back(ActionEvent e) throws IOException
	{
		Parent root =FXMLLoader.load(getClass().getResource("scene2.fxml"));
		stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void slab(ActionEvent e) throws IOException
	{
		Parent root =FXMLLoader.load(getClass().getResource("scene6.fxml"));
		stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void column(ActionEvent e) throws IOException
	{
		Parent root =FXMLLoader.load(getClass().getResource("scene7.fxml"));
		stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void beam(ActionEvent e) throws IOException
	{
		Parent root =FXMLLoader.load(getClass().getResource("scene7.fxml"));
		stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
