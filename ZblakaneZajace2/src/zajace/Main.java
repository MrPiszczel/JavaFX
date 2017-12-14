package zajace;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import zajace.view.MainC;

public class Main extends Application{

	Stage e;
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage e) throws Exception {
		this.e = e;
		
	createMain();
		
		
		
	}
	
	public void createMain(){
		try{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainV.fxml"));
		
		MainC controler = loader.getController();
		
		AnchorPane ap = (AnchorPane) loader.load();
		Scene scene = new Scene(ap);
		
		e.setScene(scene);
		e.show();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
