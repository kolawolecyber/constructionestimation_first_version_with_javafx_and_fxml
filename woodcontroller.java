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

public class woodcontroller {
	@FXML
	private TextField text1;
		@FXML
	private TextField text2;
	@FXML
	private TextField text01;
	
	@FXML
	private TextField text02;
	@FXML
	private TextField text03;
	
	
	@FXML
	private TextField plank1;
		@FXML
	private TextField plank2;
	@FXML
	private TextField plank3;
	@FXML
	private TextField plank4;
	
	
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
public void slabsubmit(ActionEvent e)
{
	String l = text1.getText();
	String b = text2.getText();
	double L = Double.parseDouble(l)*1000;
	double B = Double.parseDouble(b)*1000;
	double NL = (L/3600) + 1;
	double NB = (B/300) + 1;
	double total = NL *NB;
	double percentage = (30/100) * total;
	double overall = total + percentage;
	plank1.setText(String.format("%.0f 1 x 12 plank ",overall ));
	
	double NL2 = L/900;
	double total2 = NL2 * NB;
	double percentage2 = (30/100) * total2;
	double answer2 = total2+percentage2;
	plank2.setText(String.format("%.0f 2 x 3 plank ",answer2 ));
	
	double NL3 = L/900;
	double NB3 = B/900;
	double total3 = NB3*NL3;
	double percentage3 = (30/100) * total3;
	double answer3 = total3 + percentage3;
	plank3.setText(String.format("%.0f Bamboo ",answer3 ));
}
	
public void beamColumnSubmit(ActionEvent e)
{
	String l = text01.getText();
	String b = text02.getText();
	String h = text03.getText();
	double L = Double.parseDouble(l)*1000;
	double B = Double.parseDouble(b)*1000;
	double H = Double.parseDouble(h)*1000;
 double NL = L/300;
 double NB = B/300;
double total = NL * NB * H;
double percentage = (30/100) * total;
double answer = total + percentage;
plank4.setText(String.format("%.0f 2 x 3 plank ",answer ));
}
}
