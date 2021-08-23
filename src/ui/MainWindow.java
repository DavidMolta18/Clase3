package ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class MainWindow extends Stage {

	// Componentes UI
	private MenuItem exitBtn;
	private MenuItem eraseall;
	private TextArea areaT;

	public MainWindow() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root, 600, 400);
			setScene(scene);
			exitBtn = (MenuItem) loader.getNamespace().get("exitBtn");
			eraseall =(MenuItem) loader.getNamespace().get("eraseall");
			areaT= (TextArea) loader.getNamespace().get("areaT");
			init();

			
		} catch (Exception ex) {

		}

	}

	public void init() {

		exitBtn.setOnAction(event -> {

			System.exit(0);

		});
		
		eraseall.setOnAction(event ->{
			
			areaT.setText("");
			
		});

	}

}