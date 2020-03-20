package imageManageToolSceneBuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

//fx:controller="calculatorController.java"
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {

            Pane root = FXMLLoader.load(getClass().getResource("ImageManageTool.fxml"));

            // Creating a Scene by passing the vbox object, height and width
            Scene scene = new Scene(root, 1000, 400);

            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

            // Setting the title to Stage.
            primaryStage.setTitle("Image Manage Tool Application");

            // Adding the scene to Stage
            primaryStage.setScene(scene);

            // Displaying the contents of the stage
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String args[]) {
        launch(args);
    }
}