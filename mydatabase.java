package application;
import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage; 
public class mydatabase {
	@FXML
	private TextField text;
	@FXML
	private PasswordField pass;
	@FXML
private AnchorPane scenePane;
	@FXML
	private Label label;

	
	private Scene scene;
	private Stage stage;
	
	
	public void getData(ActionEvent event) throws Exception {
			String username = text.getText();
		String password = pass.getText();
		
				
				if (username.equals("cyber") && password.equals("1234"))
				{
					Parent root =FXMLLoader.load(getClass().getResource("scene2.fxml"));
					stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
					scene = new Scene(root);
					stage.setScene(scene);
					stage.show();
				}
				else 
				{
					label.setText("Invalid Login!!!, Try Again");
				}
				
				
	}
	public void reset(ActionEvent e)
	{
		text.setText(null);
		pass.setText(null);
	}
	public void logout(ActionEvent e) throws IOException
	{
		Alert alert = new Alert(AlertType.CONFIRMATION);
				alert.setTitle("Logout");
		alert.setHeaderText("you are about ro logout");
		alert.setContentText("Do you Want to logout");
		if (alert.showAndWait().get()==ButtonType.OK) {
			stage = (Stage) scenePane.getScene().getWindow();
			stage.close();	
		}
		
	}
}
