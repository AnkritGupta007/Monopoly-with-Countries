package game;

import java.util.List;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import logic.GameManager;
import logic.Property;


public class UserPropertyListScene {
	public static Scene getScene() {
		TableView tableView = new TableView();
		
		TableColumn<String, Property> column1 = new TableColumn<>("Property Name");
		TableColumn<String, Property> column2 = new TableColumn<>("Fee");
		TableColumn<String, Property> column3 = new TableColumn<>("Sell Price");
		
		column1.setCellValueFactory(new PropertyValueFactory<>("name"));
		column2.setCellValueFactory(new PropertyValueFactory<>("rent"));
		column3.setCellValueFactory(new PropertyValueFactory<>("cost"));
		
		tableView.getColumns().add(column1);
		tableView.getColumns().add(column2);
		tableView.getColumns().add(column3);

		List<Property> properties = GameManager.getCurrentPlayer().getOwnedProperties();
		for(Property p : properties) {
			tableView.getItems().add(p);
		}
		tableView.setPlaceholder(new Label("No rows to display."));
		
		//NOT FINISHED OR WORKING, DOUBLE CLICK EXAMPLE
		tableView.setOnMouseClicked((MouseEvent event) -> {
			if(event.getButton().equals(MouseButton.PRIMARY)&& event.getClickCount() == 2) {
				
			}
		});
		
		VBox vbox = new VBox(tableView);
		
		Scene scene = new Scene(vbox);
		
		return scene;
	}
}