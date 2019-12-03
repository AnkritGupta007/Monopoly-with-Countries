package game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;
import logic.GameManager;

public class PlayerWinScene {
	public static Scene getScene() {
		BorderPane bp = new BorderPane();
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setPadding(new Insets(25,25,25,25));
		bp.setCenter(gp);

		Text firstName = new Text (GameManager.getCurrentPlayer().getName() + " has won!");
		gp.add(firstName, 0, 0);

		Scene scene = new Scene(bp);
		return scene;
	}
}
