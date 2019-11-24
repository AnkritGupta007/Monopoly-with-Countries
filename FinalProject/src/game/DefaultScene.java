package game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import logic.GameManager;

public class DefaultScene {

	/**
	 * Generates the Default scene for the Banking System, which is the home page.
	 * 
	 * @return The constructed default scene for the Banking System.
	 */
	public static Scene getScene() {
		
		Image img = new Image("mono.png");
		StackPane sp = new StackPane();
		
		GridPane grid = new GridPane();
		//grid.setGridLinesVisible(true);
		grid.setAlignment(Pos.CENTER);
		//grid.setStyle("-fx-background-color: black;");
		grid.setHgap(5);
		grid.setVgap(5);
		
		Rectangle blueSpace1 = new Rectangle(20,20,150,150);
		blueSpace1.setStroke(Color.BLUE);
		blueSpace1.setFill(Color.BLUE);
		Rectangle blueSpace2 = new Rectangle(20,20,150,150);
		blueSpace2.setStroke(Color.BLUE);
		blueSpace2.setFill(Color.BLUE);
		Rectangle blueSpace3 = new Rectangle(20,20,150,150);
		blueSpace3.setStroke(Color.BLUE);
		blueSpace3.setFill(Color.BLUE);
		Rectangle redSpace1 = new Rectangle(20,20,150,150);
		redSpace1.setStroke(Color.RED);
		redSpace1.setFill(Color.RED);
		Rectangle redSpace2 = new Rectangle(20,20,150,150);
		redSpace2.setStroke(Color.RED);
		redSpace2.setFill(Color.RED);
		Rectangle redSpace3 = new Rectangle(20,20,150,150);
		redSpace3.setStroke(Color.RED);
		redSpace3.setFill(Color.RED);
		Rectangle greenSpace1 = new Rectangle(20,20,150,150);
		greenSpace1.setStroke(Color.GREEN);
		greenSpace1.setFill(Color.GREEN);
		Rectangle greenSpace3 = new Rectangle(20,20,150,150);
		greenSpace3.setStroke(Color.GREEN);
		greenSpace3.setFill(Color.GREEN);
		Rectangle yellowSpace1 = new Rectangle(20,20,150,150);
		yellowSpace1.setStroke(Color.YELLOW);
		yellowSpace1.setFill(Color.YELLOW);
		Rectangle yellowSpace2 = new Rectangle(20,20,150,150);
		yellowSpace2.setStroke(Color.YELLOW);
		yellowSpace2.setFill(Color.YELLOW);
		Rectangle yellowSpace3 = new Rectangle(20,20,150,150);
		yellowSpace3.setStroke(Color.YELLOW);
		yellowSpace3.setFill(Color.YELLOW);
		Rectangle orangeSpace1 = new Rectangle(20,20,150,150);
		orangeSpace1.setStroke(Color.ORANGE);
		orangeSpace1.setFill(Color.ORANGE);
		Rectangle orangeSpace2 = new Rectangle(20,20,150,150);
		orangeSpace2.setStroke(Color.ORANGE);
		orangeSpace2.setFill(Color.ORANGE);
		Rectangle orangeSpace3 = new Rectangle(20,20,150,150);
		orangeSpace3.setStroke(Color.ORANGE);
		orangeSpace3.setFill(Color.ORANGE);
		Rectangle purpleSpace1 = new Rectangle(20,20,150,150);
		purpleSpace1.setStroke(Color.PURPLE);
		purpleSpace1.setFill(Color.PURPLE);
		Rectangle purpleSpace2 = new Rectangle(20,20,150,150);
		purpleSpace2.setStroke(Color.PURPLE);
		purpleSpace2.setFill(Color.PURPLE);
		Rectangle purpleSpace3 = new Rectangle(20,20,150,150);
		purpleSpace3.setStroke(Color.PURPLE);
		purpleSpace3.setFill(Color.PURPLE);
		Rectangle brownSpace1 = new Rectangle(20,20,150,150);
		brownSpace1.setStroke(Color.BROWN);
		brownSpace1.setFill(Color.BROWN);
		Rectangle brownSpace2 = new Rectangle(20,20,150,150);
		brownSpace2.setStroke(Color.BROWN);
		brownSpace2.setFill(Color.BROWN);
		Rectangle brownSpace3 = new Rectangle(20,20,150,150);
		brownSpace3.setStroke(Color.BROWN);
		brownSpace3.setFill(Color.BROWN);
		Rectangle goSpace = new Rectangle(20,20,150,150);
		goSpace.setStroke(Color.BLACK);
		goSpace.setFill(Color.BLACK);
		
		grid.add(blueSpace1, 0, 0);
		grid.add(redSpace1, 1, 0);
		grid.add(greenSpace1, 2, 0);
		grid.add(yellowSpace1, 3, 0);
		grid.add(orangeSpace1, 4, 0);
		grid.add(purpleSpace1, 4, 1);
		grid.add(blueSpace2, 4, 2);
		grid.add(redSpace2, 4, 3);
		grid.add(goSpace, 4, 4);
		grid.add(yellowSpace2, 3, 4);
		grid.add(orangeSpace2, 2, 4);
		grid.add(purpleSpace2, 1, 4);
		grid.add(blueSpace3, 0, 4);
		grid.add(redSpace3, 0, 3);
		grid.add(greenSpace3, 0, 2);
		grid.add(yellowSpace3, 0, 1);
		grid.add(orangeSpace3, 0, 0);
		
		VBox goBox = new VBox();
		Text goText = new Text("GO!");
		goText.setFill(Color.DARKRED);
		goText.setFont(Font.font(36));
		goBox.setAlignment(Pos.CENTER);
		goBox.getChildren().add(goText);
		grid.add(goBox, 4, 4);
		
		VBox currentUserBox = new VBox(10);
		Text currentUserDisplay = new Text("Current Player: ");
		Text currentBalanceDisplay = new Text("Cash: ");
		Text nextUserDisplay = new Text("Next Player: ");
		Button checkPropertiesBtn = new Button("Properties");
		checkPropertiesBtn.setOnAction(new EventHandler <ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				GameManager.changeScene(UserPropertyListScene.getScene());
				
			}
		});
		currentUserBox.setAlignment(Pos.TOP_LEFT);
		currentUserBox.getChildren().add(currentUserDisplay);
		currentUserBox.getChildren().add(currentBalanceDisplay);
		currentUserBox.getChildren().add(checkPropertiesBtn);
		currentUserBox.getChildren().add(nextUserDisplay);
		grid.add(currentUserBox, 1, 1);
		
		HBox buyB = new HBox();
		Button buy = new Button("Buy");
		buyB.setAlignment(Pos.BOTTOM_CENTER);
		buyB.getChildren().add(buy);
		grid.add(buyB, 1, 3);
		
		HBox rollDiceB = new HBox();
		Button rollDice = new Button("Roll Dice");
		rollDiceB.setAlignment(Pos.BOTTOM_CENTER);
		rollDiceB.getChildren().add(rollDice);
		grid.add(rollDiceB, 2, 3);
		
		GameManager gm = GameManager.getInstance();
		currentUserDisplay.setText("Current Player: " + GameManager.currentPlayer.getName());
		nextUserDisplay.setText("Next Player: " + gm.getNextPlayer().getName());
		
		rollDice.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				GameManager gm = GameManager.getInstance();
				gm.executeTurn(GameManager.currentPlayer);
			}
			
		});
		
		HBox endB = new HBox();
		Button end = new Button("End Turn");
		endB.setAlignment(Pos.BOTTOM_CENTER);
		endB.getChildren().add(end);
		grid.add(endB, 3, 3);
		
		end.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				GameManager gm = GameManager.getInstance();
				gm.endTurn();
				currentUserDisplay.setText("Current Player: " + GameManager.currentPlayer.getName());
				nextUserDisplay.setText("Next Player: " + gm.getNextPlayer().getName());
			}
			
		});
		
		HBox sellB = new HBox();
		Button sell = new Button("Sell");
		sellB.setAlignment(Pos.BOTTOM_CENTER);
		sellB.getChildren().add(sell);
		grid.add(sellB, 4, 3);

		BorderPane bp = new BorderPane();
		HBox hb = new HBox();
		hb.setAlignment(Pos.BASELINE_CENTER);
		bp.setCenter(grid);
		bp.setLeft(hb);
		grid.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2))));

		Scene scene = new Scene(bp, 790, 790);
		//scene.getStylesheets().add(DefaultScene.class.getResource("Login.css").toExternalForm());

		return scene;
	}

}
