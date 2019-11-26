package gui.scenes;

import gui.main.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class PlayerNameScene {

	@SuppressWarnings("restriction")
	public static Scene getScene() {
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Text sceneTitle = new Text("Enter Player Names:");
		sceneTitle.setFont(new Font(37));
		grid.add(sceneTitle, 1, 0);
		
		Label p1Name = new Label("Player 1:");
		grid.add(p1Name, 0, 1);

		TextField p1Box = new TextField();
		grid.add(p1Box, 1, 1);

		Label p2Name = new Label("Player 2:");
		grid.add(p2Name, 0, 2);

		TextField p2Box = new TextField();
		grid.add(p2Box, 1, 2);
		
		Label p3Name = new Label("Player 3:");
		grid.add(p3Name, 0, 3);

		TextField p3Box = new TextField();
		grid.add(p3Box, 1, 3);

		Label p4Name = new Label("Player 4:");
		grid.add(p4Name, 0, 4);

		TextField p4Box = new TextField();
		grid.add(p4Box, 1, 4);

		Button btn = new Button("Start Game!");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_CENTER);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn, 1, 5);

		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				Main.changeScene(LoginScene.getScene());
			}
		});

		Scene scene = new Scene(grid, 475, 275);

		return scene;
	}
}