package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class beamAndColumnController implements Initializable{
	@FXML
	private TextField text1;
		@FXML
	private TextField text2;
		@FXML
		private TextField text3;
	
	@FXML
	private TextField steelLength;
	@FXML
	private TextField linksTotal;
	@FXML
	private TextField linksTotalLength;
	@FXML
	private ComboBox<String> steeltype;
	
	private String[] steel = {"6", "8","10","12","16","20","25","32"};
	
	
	private Stage stage;
	private Scene scene;
	public void back(ActionEvent e) throws IOException
	{
		Parent root =FXMLLoader.load(getClass().getResource("scene5.fxml"));
		stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		for (int i=0; i<steel.length; i++)
		{
			steeltype.getItems().add(steel[i]);
		}	
		steeltype.setOnAction(this::typeOfSlabM);
	}

	public void typeOfSlabM(ActionEvent actionevent1) {
		String length = text1.getText();
		String numbers = text2.getText();
		String links = text3.getText();
	double numberL = Double.parseDouble(length);
	double numberN = Double.parseDouble(numbers);
	double link = Double.parseDouble(links);
	double L = numberL *1000;
	double B = numberN ;
	
	double total  =((L +200)*B)/12000;
	double Nlinks = ((L/150)+1);
	
	double NlinksLength = (Nlinks * (link *1000))/12000;
	steelLength.setText(String.format("%.2f Length", total));
	linksTotal.setText(String.format("%.2f Links", Nlinks)); 
	linksTotalLength.setText(String.format("%.2f Links length", NlinksLength)); 
	}
}
