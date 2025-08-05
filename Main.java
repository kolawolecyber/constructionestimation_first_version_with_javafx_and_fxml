package application;
	
import java.io.IOException;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Construction Estimation");
			Image icon = new Image("application/constructionclipart.jpg");
			
			primaryStage.getIcons().add(icon); 
			primaryStage.show();
			primaryStage.setOnCloseRequest(event ->{
				event.consume();
				try {
					logout(primaryStage);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void logout(Stage stage ) throws IOException
	{
		Alert alert = new Alert(AlertType.CONFIRMATION);
				alert.setTitle("Logout");
		alert.setHeaderText("you are about ro logout");
		alert.setContentText("Do you Want to logout");
		if (alert.showAndWait().get()==ButtonType.OK) {
				stage.close();	
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
