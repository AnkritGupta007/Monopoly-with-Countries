package game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
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
import javafx.stage.Modality;
import javafx.stage.Stage;
import logic.GameManager;
import logic.Player;
import logic.Property;

public class DefaultScene {

	/**
	 * Creates main scene for monopoly game
	 * 
	 * @return Main game scene
	 */
	public static Scene getScene() {

		Image img = new Image("mono.png");
		StackPane sp = new StackPane();

		GridPane grid = new GridPane();
		// grid.setGridLinesVisible(true);
		grid.setAlignment(Pos.CENTER);
		// grid.setStyle("-fx-background-color: black;");
		grid.setHgap(5);
		grid.setVgap(5);

		Rectangle blueSpace1 = new Rectangle(20, 20, 150, 150);
		blueSpace1.setStroke(Color.BLUE);
		blueSpace1.setFill(Color.BLUE);
		Rectangle blueSpace2 = new Rectangle(20, 20, 150, 150);
		blueSpace2.setStroke(Color.BLUE);
		blueSpace2.setFill(Color.BLUE);
		Rectangle blueSpace3 = new Rectangle(20, 20, 150, 150);
		blueSpace3.setStroke(Color.BLUE);
		blueSpace3.setFill(Color.BLUE);
		Rectangle redSpace1 = new Rectangle(20, 20, 150, 150);
		redSpace1.setStroke(Color.RED);
		redSpace1.setFill(Color.RED);
		Rectangle redSpace2 = new Rectangle(20, 20, 150, 150);
		redSpace2.setStroke(Color.RED);
		redSpace2.setFill(Color.RED);
		Rectangle redSpace3 = new Rectangle(20, 20, 150, 150);
		redSpace3.setStroke(Color.RED);
		redSpace3.setFill(Color.RED);
		Rectangle greenSpace1 = new Rectangle(20, 20, 150, 150);
		greenSpace1.setStroke(Color.GREEN);
		greenSpace1.setFill(Color.GREEN);
		Rectangle greenSpace3 = new Rectangle(20, 20, 150, 150);
		greenSpace3.setStroke(Color.GREEN);
		greenSpace3.setFill(Color.GREEN);
		Rectangle yellowSpace1 = new Rectangle(20, 20, 150, 150);
		yellowSpace1.setStroke(Color.YELLOW);
		yellowSpace1.setFill(Color.YELLOW);
		Rectangle yellowSpace2 = new Rectangle(20, 20, 150, 150);
		yellowSpace2.setStroke(Color.YELLOW);
		yellowSpace2.setFill(Color.YELLOW);
		Rectangle yellowSpace3 = new Rectangle(20, 20, 150, 150);
		yellowSpace3.setStroke(Color.YELLOW);
		yellowSpace3.setFill(Color.YELLOW);
		Rectangle orangeSpace1 = new Rectangle(20, 20, 150, 150);
		orangeSpace1.setStroke(Color.ORANGE);
		orangeSpace1.setFill(Color.ORANGE);
		Rectangle orangeSpace2 = new Rectangle(20, 20, 150, 150);
		orangeSpace2.setStroke(Color.ORANGE);
		orangeSpace2.setFill(Color.ORANGE);
		Rectangle orangeSpace3 = new Rectangle(20, 20, 150, 150);
		orangeSpace3.setStroke(Color.ORANGE);
		orangeSpace3.setFill(Color.ORANGE);
		Rectangle purpleSpace1 = new Rectangle(20, 20, 150, 150);
		purpleSpace1.setStroke(Color.PURPLE);
		purpleSpace1.setFill(Color.PURPLE);
		Rectangle purpleSpace2 = new Rectangle(20, 20, 150, 150);
		purpleSpace2.setStroke(Color.PURPLE);
		purpleSpace2.setFill(Color.PURPLE);
		Rectangle purpleSpace3 = new Rectangle(20, 20, 150, 150);
		purpleSpace3.setStroke(Color.PURPLE);
		purpleSpace3.setFill(Color.PURPLE);
		Rectangle brownSpace1 = new Rectangle(20, 20, 150, 150);
		brownSpace1.setStroke(Color.BROWN);
		brownSpace1.setFill(Color.BROWN);
		Rectangle brownSpace2 = new Rectangle(20, 20, 150, 150);
		brownSpace2.setStroke(Color.BROWN);
		brownSpace2.setFill(Color.BROWN);
		Rectangle brownSpace3 = new Rectangle(20, 20, 150, 150);
		brownSpace3.setStroke(Color.BROWN);
		brownSpace3.setFill(Color.BROWN);
		Rectangle goSpace = new Rectangle(20, 20, 150, 150);
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
		
		Image i1 = new Image("file:monopoly_img/go.png");
		ImageView iv_i1 = new ImageView(i1);
		iv_i1.setFitHeight(150);
		iv_i1.setFitWidth(150);
		
		Image i2 = new Image("file:monopoly_img/germany.png"); 
		ImageView iv_i2 = new ImageView(i2);
		iv_i2.setFitHeight(150);
		iv_i2.setFitWidth(150);
		
		Image i3 = new Image("file:monopoly_img/spain.png"); 
		ImageView iv_i3 = new ImageView(i3);
		iv_i3.setFitHeight(150);
		iv_i3.setFitWidth(150);
		
		Image i4 = new Image("file:monopoly_img/korea.png");
		ImageView iv_i4 = new ImageView(i4);
		iv_i4.setFitHeight(150);
		iv_i4.setFitWidth(150);
		
		Image i5 = new Image("file:monopoly_img/jail.png");
		ImageView iv_i5 = new ImageView(i5);
		iv_i5.setFitHeight(150);
		iv_i5.setFitWidth(150);
		
		Image i6 = new Image("file:monopoly_img/japan.png");
		ImageView iv_i6 = new ImageView(i6);
		iv_i6.setFitHeight(150);
		iv_i6.setFitWidth(150);
		
		Image i7 = new Image("file:monopoly_img/nepal.png"); 
		ImageView iv_i7 = new ImageView(i7);
		iv_i7.setFitHeight(150);
		iv_i7.setFitWidth(150);
		
		Image i8 = new Image("file:monopoly_img/australia.png"); 
		ImageView iv_i8 = new ImageView(i8);
		iv_i8.setFitHeight(150);
		iv_i8.setFitWidth(150);
		
		Image i9 = new Image("file:monopoly_img/freeparking.png");
		ImageView iv_i9 = new ImageView(i9);
		iv_i9.setFitHeight(150);
		iv_i9.setFitWidth(150);
		
		Image i10 = new Image("file:monopoly_img/brazil.png"); 
		ImageView iv_i10 = new ImageView(i10);
		iv_i10.setFitHeight(150);
		iv_i10.setFitWidth(150);
		
		Image i11 = new Image("file:monopoly_img/southafrica.png");
		ImageView iv_i11 = new ImageView(i11);
		iv_i11.setFitHeight(150);
		iv_i11.setFitWidth(150);
		
		Image i12 = new Image("file:monopoly_img/us.png");
		ImageView iv_i12 = new ImageView(i12);
		iv_i12.setFitHeight(150);
		iv_i12.setFitWidth(150);
		
		Image i13 = new Image("file:monopoly_img/gotojail.png");
		ImageView iv_i13 = new ImageView(i13);
		iv_i13.setFitHeight(150);
		iv_i13.setFitWidth(150);
		
		Image i14 = new Image("file:monopoly_img/france.png"); 
		ImageView iv_i14 = new ImageView(i14);
		iv_i14.setFitHeight(150);
		iv_i14.setFitWidth(150);
		
		Image i15 = new Image("file:monopoly_img/switzerland.png");
		ImageView iv_i15 = new ImageView(i15);
		iv_i15.setFitHeight(150);
		iv_i15.setFitWidth(150);
		
		Image i16 = new Image("file:monopoly_img/italy.png");
		ImageView iv_i16 = new ImageView(i16);
		iv_i16.setFitHeight(150);
		iv_i16.setFitWidth(150);
		
		
		VBox goBox = new VBox();
		goBox.setAlignment(Pos.CENTER);
		goBox.getChildren().add(iv_i1);
		grid.add(goBox, 4, 4);
		
		VBox i2Box = new VBox();
		i2Box.setAlignment(Pos.CENTER);
		i2Box.getChildren().add(iv_i2);
		grid.add(i2Box, 3, 4);
		
		VBox i3Box = new VBox();
		i3Box.setAlignment(Pos.CENTER);
		i3Box.getChildren().add(iv_i3);
		grid.add(i3Box, 2, 4);
		
		VBox i4Box = new VBox();
		i4Box.setAlignment(Pos.CENTER);
		i4Box.getChildren().add(iv_i4);
		grid.add(i4Box, 1, 4);
		
		VBox i5Box = new VBox();
		i5Box.setAlignment(Pos.CENTER);
		i5Box.getChildren().add(iv_i5);
		grid.add(i5Box, 0, 4);
		
		VBox i6Box = new VBox();
		i6Box.setAlignment(Pos.CENTER);
		i6Box.getChildren().add(iv_i6);
		grid.add(i6Box, 0, 3);
		
		VBox i7Box = new VBox();
		i7Box.setAlignment(Pos.CENTER);
		i7Box.getChildren().add(iv_i7);
		grid.add(i7Box, 0, 2);
		
		VBox i8Box = new VBox();
		i8Box.setAlignment(Pos.CENTER);
		i8Box.getChildren().add(iv_i8);
		grid.add(i8Box, 0, 1);
		
		VBox i9Box = new VBox();
		i9Box.setAlignment(Pos.CENTER);
		i9Box.getChildren().add(iv_i9);
		grid.add(i9Box, 0, 0);
		
		VBox i10Box = new VBox();
		i10Box.setAlignment(Pos.CENTER);
		i10Box.getChildren().add(iv_i10);
		grid.add(i10Box, 1, 0);
		
		VBox i11Box = new VBox();
		i11Box.setAlignment(Pos.CENTER);
		i11Box.getChildren().add(iv_i11);
		grid.add(i11Box, 2, 0);
		
		VBox i12Box = new VBox();
		i12Box.setAlignment(Pos.CENTER);
		i12Box.getChildren().add(iv_i12);
		grid.add(i12Box, 3, 0);
		
		VBox i13Box = new VBox();
		i13Box.setAlignment(Pos.CENTER);
		i13Box.getChildren().add(iv_i13);
		grid.add(i13Box, 4, 0);
		
		VBox i14Box = new VBox();
		i14Box.setAlignment(Pos.CENTER);
		i14Box.getChildren().add(iv_i14);
		grid.add(i14Box, 4, 1);
		
		VBox i15Box = new VBox();
		i15Box.setAlignment(Pos.CENTER);
		i15Box.getChildren().add(iv_i15);
		grid.add(i15Box, 4, 2);
		
		VBox i16Box = new VBox();
		i16Box.setAlignment(Pos.CENTER);
		i16Box.getChildren().add(iv_i16);
		grid.add(i16Box, 4, 3);

		VBox currentUserBox = new VBox(10);
		Text currentUserDisplay = new Text("Current Player: ");
		Text currentBalanceDisplay = new Text("Cash: ");
		Text nextUserDisplay = new Text("Next Player: ");
		Button checkPropertiesBtn = new Button("Properties");
		checkPropertiesBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Stage stage = new Stage();
				stage.setScene(UserPropertyListScene.getScene());
				stage.initModality(Modality.APPLICATION_MODAL);
				stage.setTitle(GameManager.getCurrentPlayer().getName() + "'s Properties");
				stage.showAndWait();
			}
		});
		currentUserBox.setAlignment(Pos.TOP_LEFT);
		currentUserBox.getChildren().add(currentUserDisplay);
		currentUserBox.getChildren().add(currentBalanceDisplay);
		currentUserBox.getChildren().add(checkPropertiesBtn);
		currentUserBox.getChildren().add(nextUserDisplay);
		grid.add(currentUserBox, 1, 1);

		// Current piece info
		VBox currentPieceBox = new VBox(10);
		Text currentPieceDisplay = new Text("You landed on: ");
		Text currentPriceDisplay = new Text("");
		currentPieceBox.setAlignment(Pos.TOP_LEFT);
		currentPieceBox.getChildren().add(currentPieceDisplay);
		currentPieceBox.getChildren().add(currentPriceDisplay);
		grid.add(currentPieceBox, 2, 1);

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

		HBox endB = new HBox();
		Button end = new Button("End Turn");
		endB.setAlignment(Pos.BOTTOM_CENTER);
		endB.getChildren().add(end);
		grid.add(endB, 3, 3);

		// Initial setup
		GameManager gm = GameManager.getInstance();
		currentUserDisplay.setText("Current Player: " + GameManager.getCurrentPlayer().getName());
		nextUserDisplay.setText("Next Player: " + gm.getNextPlayer().getName());
		currentBalanceDisplay.setText("Cash: " + GameManager.getCurrentPlayer().getBalance());
		end.setDisable(true);
		buy.setDisable(true);

		buy.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				GameManager.getCurrentPlayer().buyProperty((Property) GameManager.getCurrentBoardSquare());
				currentBalanceDisplay.setText("Cash: " + GameManager.getCurrentPlayer().getBalance());
				buy.setDisable(true);
			}

		});

		rollDice.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				GameManager gm = GameManager.getInstance();
				Player cp = GameManager.getCurrentPlayer();
				boolean doubles = gm.executeTurn(cp);
				boolean alreadyNext = false;
				currentPieceDisplay.setText("You landed on: " + GameManager.getCurrentBoardSquare().getName());
				if (GameManager.getCurrentBoardSquare() instanceof Property) {
					Property prop = (Property) GameManager.getCurrentBoardSquare();
					if (prop.isOwned()) {
						currentPriceDisplay.setText("Property is owned by: " + prop.getOwner().getName());
						if (!prop.getOwner().getName().equals(cp.getName())) {
							if (!(prop.getRent() >= cp.getBalance())) {
								Alert alert = new Alert(AlertType.INFORMATION,
										"Paid " + prop.getOwner().getName() + " rent in amount of: " + prop.getRent(),
										ButtonType.OK);
								alert.setHeaderText(null);
								alert.showAndWait();
							} else {
								Alert alert = new Alert(AlertType.INFORMATION, "Player has been removed due to inability to pay rent.", ButtonType.OK);
								alert.setHeaderText(null);
								alert.showAndWait();
								currentPieceDisplay.setText("You landed on: ");
								currentPriceDisplay.setText("");
								currentUserDisplay.setText("Current Player: " + GameManager.getCurrentPlayer().getName());
								nextUserDisplay.setText("Next Player: " + gm.getNextPlayer().getName());
								currentBalanceDisplay.setText("Cash: " + GameManager.getCurrentPlayer().getBalance());
								rollDice.setDisable(false);
								end.setDisable(true);
								buy.setDisable(true);
								alreadyNext = true;
								if (GameManager.getNumPlayers() == 1) {
									Main.changeScene(PlayerWinScene.getScene());
								}
							}
						}
						currentBalanceDisplay.setText("Cash: " + GameManager.getCurrentPlayer().getBalance());
					} else {
						currentPriceDisplay.setText("Property will cost: " + prop.getCost());
					}
				} else {
					currentPriceDisplay.setText("Property cannot be owned.");
					GameManager.setBuyable(false);
				}
				if (doubles) {
					Alert alert = new Alert(AlertType.INFORMATION, "You Got a Double\n Roll Again", ButtonType.OK);
					alert.setHeaderText(null);
					alert.showAndWait();
				}
				if (GameManager.isBuyable()) {
					buy.setDisable(false);
				}
				if (!doubles && !alreadyNext) {
					rollDice.setDisable(true);
					end.setDisable(false);
				}
			}

		});

		end.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				GameManager gm = GameManager.getInstance();
				gm.endTurn();
				currentPieceDisplay.setText("You landed on: ");
				currentPriceDisplay.setText("");
				currentUserDisplay.setText("Current Player: " + GameManager.getCurrentPlayer().getName());
				nextUserDisplay.setText("Next Player: " + gm.getNextPlayer().getName());
				currentBalanceDisplay.setText("Cash: " + GameManager.getCurrentPlayer().getBalance());
				rollDice.setDisable(false);
				end.setDisable(true);
				buy.setDisable(true);
				if (GameManager.getNumPlayers() == 1) {
					Main.changeScene(PlayerWinScene.getScene());
				}
			}

		});

		BorderPane bp = new BorderPane();
		HBox hb = new HBox();
		hb.setAlignment(Pos.BASELINE_CENTER);
		bp.setCenter(grid);
		bp.setLeft(hb);
		grid.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2))));

		Scene scene = new Scene(bp, 790, 790);
		scene.getStylesheets().add(DefaultScene.class.getResource("Style.css").toExternalForm());

		return scene;
	}

}
