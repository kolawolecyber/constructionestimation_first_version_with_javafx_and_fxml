package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class blockworkcontroller {
	@FXML
	private TextField text1;
	@FXML
	private TextField text2;
	@FXML
	private TextField blockwork;
	
	
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
public void submit(ActionEvent e)
{
	String girth = text1.getText();
	String height = text2.getText();
	
	double girthN = Double.parseDouble(girth);
	double heightN = Double.parseDouble(height);
	
	double heightNumber = (heightN*1000)/225;
	double Length = (girthN*1000)/450;
	
	double answer = heightNumber *Length;
	double percentage = (40/100) * answer;
double total = answer + percentage;
blockwork.setText(String.format("%.0f Blocks", total)); 
}
}
