package game;

import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.text.*;
import logic.GameManager;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import java.io.IOException;

public class SellConfirmationScene {
	@SuppressWarnings("restriction")
	public static Scene getScene() {
		BorderPane bp = new BorderPane();
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setPadding(new Insets(25,25,25,25));
		bp.setCenter(gp);

		Text firstName = new Text ("First Name");
		gp.add(firstName, 0, 0);

		Text lastName = new Text ("Last Name");
		gp.add(lastName, 1, 0);

		HBox leftBox = new HBox();
		HBox.setHgrow(leftBox, Priority.ALWAYS);
		leftBox.setAlignment(Pos.CENTER_LEFT);

		Button cancelButton = new Button("Cancel Button");

		cancelButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Main.changeScene(UserPropertyListScene.getScene());
			}

		});
		leftBox.getChildren().add(cancelButton);

		HBox rightBox = new HBox();
		HBox.setHgrow(rightBox, Priority.ALWAYS);
		rightBox.setAlignment(Pos.CENTER_RIGHT);

		Button submitButton = new Button("Submit Button");

		submitButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				//sell method
			}
		});
		rightBox.getChildren().add(submitButton);

		HBox bottom = new HBox(leftBox, rightBox);
		bottom.setPadding(new Insets(10));
		bp.setBottom(bottom);

		Scene scene = new Scene(bp);
		return scene;
	}
}