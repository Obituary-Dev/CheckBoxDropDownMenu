package checkboxdropdownmenu;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Obituary
 */
public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("ChoiceBox demo");

        button = new Button("Click me");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        // getItems returns the Observable List object which you can add items to 
        // add: 1 elm, addAll: list
        choiceBox.getItems().addAll("Apples", "Bananas", "Bacon", "Ham", "Meatballs");
        // default value must be equal an elm of the list already made 
        choiceBox.setValue("Apples");
        
        button.setOnAction(e -> getChoice(choiceBox));
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(choiceBox, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }

    //to get the value of the selected item
    private void getChoice(ChoiceBox<String> choiceBox){
        String food = choiceBox.getValue();
        System.out.println(food);
    }
}
