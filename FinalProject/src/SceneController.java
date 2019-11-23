package game;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SceneController extends Application {

	private static Stage primaryStage;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		SceneController.primaryStage = primaryStage;
		primaryStage.setScene(DefaultScene.getScene());
		primaryStage.show();
	}

	/**
	 * Used to change to a different scene anywhere in the application.
	 * 
	 * @param scene The scene to change to.
	 */
	public static void changeScene(Scene scene) {
		SceneController.primaryStage.setScene(scene);
	}

}
