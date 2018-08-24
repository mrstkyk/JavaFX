
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class HelloWorld	extends Application {

	
	public static void main(String[] args) {
		launch(args);
		
		
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		
		/*Button btn = new Button("Press Me");
		Button exit = new Button("Exit");
		exit.setOnAction(e -> {
			System.out.println("Exiting app");
			System.exit(0);
		});
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Fuck off bitch");
			}
		});*/

		//StackPane root = new StackPane();
		Parent root  = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(root,500,300);
		arg0.setTitle("Hello World Application");
		arg0.setScene(scene);
		arg0.show();
		
	}

}
