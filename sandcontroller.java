package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class sandcontroller {
	@FXML
private TextField text1;
	@FXML
private TextField text2;
	@FXML
	private TextField text3;
@FXML
private Label cement;
@FXML
private Label sand;
private Stage stage;
private Scene scene;
public void getResult(ActionEvent e)
{
	String string1 = text1.getText();
	String string2 = text2.getText();
	String string3 = text3.getText();
	double number1 = Double.parseDouble(string1);
	double number2 = Double.parseDouble(string2);
	double number3 = Double.parseDouble(string3);
	double vol =(number1 * number2 * number3);
	double percentage = vol* 0.2;
	double volume = vol + percentage;

	double cementf =  (volume *220)/50;

	cement.setText(String.format("%.2f bags of cement",cementf ));

	double sandf= (volume * 489)/1000;
	sand.setText(String.format("%.2f tonne of sand", sandf));
	System.out.printf( Double.toString(sandf));

}
public void back(ActionEvent e) throws IOException
{
	Parent root =FXMLLoader.load(getClass().getResource("scene2.fxml"));
	stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
}
