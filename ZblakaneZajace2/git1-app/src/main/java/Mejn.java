import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Mejn extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage e) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("/fxml/kik.fxml"));
		AnchorPane gp = loader.load();
		
		Scene scena = new Scene(gp);
		
		e.setScene(scena);
		e.setTitle("kolko i krzyzyk");
		e.show();
	}

}
