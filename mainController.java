package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class mainController {
	private Stage stage;
	private Scene scene;
	

public void concrete(ActionEvent e) throws IOException
{
	Parent root =FXMLLoader.load(getClass().getResource("scene3.fxml"));
	stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void sandandcement(ActionEvent e) throws IOException
{
	Parent root =FXMLLoader.load(getClass().getResource("scene4.fxml"));
	stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void steelanalysis(ActionEvent e) throws IOException
{
	Parent root =FXMLLoader.load(getClass().getResource("scene5.fxml"));
	stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void formwork(ActionEvent e) throws IOException
{
	Parent root =FXMLLoader.load(getClass().getResource("scene8.fxml"));
	stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void blockwall(ActionEvent e) throws IOException
{
	Parent root =FXMLLoader.load(getClass().getResource("scene10.fxml"));
	stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void back(ActionEvent e) throws IOException
{
	Parent root =FXMLLoader.load(getClass().getResource("scene1.fxml"));
	stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void roof(ActionEvent e) throws IOException
{
	Parent root =FXMLLoader.load(getClass().getResource("scene9.fxml"));
	stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
}
