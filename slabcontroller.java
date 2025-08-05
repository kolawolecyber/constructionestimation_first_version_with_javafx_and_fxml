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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class slabcontroller implements Initializable{
	

	@FXML
	private TextField text1;
		@FXML
	private TextField text2;
	
	@FXML
	private Label numOfSteel;
	@FXML
	private Label inTonne;
	@FXML
	private ComboBox<String> steeltype;
	@FXML
	private ComboBox<String> slabtype;
	
	private String[] steel = {"6", "8","10","12","16","20","25","32"};
	private String[] typeOfSlab= { "Single Reinforcement", "Double Reinforcement"};
	
	
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
		for (int z=0; z<typeOfSlab.length; z++)
		{
			slabtype.getItems().add(typeOfSlab[z]);
		}
		steeltype.setOnAction(this::typeOfSlabM);
		slabtype.setOnAction(this::typeOfSlabM);
	}
	
	
	
	public void typeOfSteel(ActionEvent actionevent1) 
	{
		
	}
	public void typeOfSlabM(ActionEvent actionevent1)
	{
		String length = text1.getText();
		String breadth = text2.getText();
	double numberL = Double.parseDouble(length);
	double numberB = Double.parseDouble(breadth);
	double L = numberL *1000;
	double B = numberB *1000;
	
	double NL = L/150;
	double NB = B/150;
if (slabtype.getValue()==typeOfSlab[0])
{
	
double totalL = NL* (B +2400);
double totalB = NB * (L +2400);
double total = totalL + totalB;

double answer1 = total/12000;

numOfSteel.setText(String.format("%.0f Length of Steel", answer1));



if (steeltype.getValue()==steel[0])
{
	double steel6 =answer1/376;
inTonne.setText(String.format("%.2f Tonnes of Steel", steel6));	
	}
else if (steeltype.getValue()==steel[1])
{
	double steel8 =answer1/211;
inTonne.setText(String.format("%.2f Tonnes of Steel", steel8));	
}
else if (steeltype.getValue()==steel[2])
{
	double steel10 =answer1/135;
inTonne.setText(String.format("%.2f Tonnes of Steel", steel10));	
}

else if (steeltype.getValue()==steel[3])
{
	double steel12 =answer1/93;
inTonne.setText(String.format("%.2f Tonnes of Steel", steel12));	
}
else if (steeltype.getValue()==steel[4])
{
	double steel16 =answer1/53;
inTonne.setText(String.format("%.2f Tonnes of Steel", steel16));	
}
else if (steeltype.getValue()==steel[5])
{
	double steel20 =answer1/34;
inTonne.setText(String.format("%.2f Tonnes of Steel", steel20));	
}

else if (steeltype.getValue()==steel[6])
{
	double steel25 =answer1/22;
inTonne.setText(String.format("%.2f Tonnes of Steel", steel25));	
}
else if (steeltype.getValue()==steel[7])
{
	double steel32 =answer1/13;
inTonne.setText(String.format("%.2f Tonnes of Steel", steel32));	
}

}


else if (slabtype.getValue()==typeOfSlab[1])
{
	double totalL = NL* B ;
	double totalB = NB * L;
	double total = totalL + totalB;

	double answer = (total*2)/12000;
	numOfSteel.setText(String.format("%.0f Length of Steel",answer));

	
	if (steeltype.getValue()==steel[0])
	{
		double steel6 =answer/376;
	inTonne.setText(String.format("%.2f Tonnes of Steel", steel6));	
		}
	else if (steeltype.getValue()==steel[1])
	{
		double steel8 =answer/211;
	inTonne.setText(String.format("%.2f Tonnes of Steel", steel8));	
	}
	else if (steeltype.getValue()==steel[2])
	{
		double steel10 =answer/135;
	inTonne.setText(String.format("%.2f Tonnes of Steel", steel10));	
	}

	else if (steeltype.getValue()==steel[3])
	{
		double steel12 =answer/93;
	inTonne.setText(String.format("%.2f Tonnes of Steel", steel12));	
	}
	else if (steeltype.getValue()==steel[4])
	{
		double steel16 =answer/53;
	inTonne.setText(String.format("%.2f Tonnes of Steel", steel16));	
	}
	else if (steeltype.getValue()==steel[5])
	{
		double steel20 =answer/34;
	inTonne.setText(String.format("%.2f Tonnes of Steel", steel20));	
	}

	else if (steeltype.getValue()==steel[6])
	{
		double steel25 =answer/22;
	inTonne.setText(String.format("%.2f Tonnes of Steel", steel25));	
	}
	else if (steeltype.getValue()==steel[7])
	{
		double steel32 =answer/13;
	inTonne.setText(String.format("%.2f Tonnes of Steel", steel32));	
	}
}
	
	}
}
