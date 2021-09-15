import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class javafxsample extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception {
        /*
      Code for JavaFX application.
      (Stage, scene, scene graph)
      */ //creating a Group object
        Group root=new Group();
        //Creating a Scene by passing the group object, height and width
        Scene scene=new Scene(root,500,300);
        //setting color to the scene
        scene.setFill(Color.BROWN);
        //Setting the title to Stage.
        primaryStage.setTitle("sample application");
        //Setting the scene to Stage
        primaryStage.setScene(scene);
        //Displaying the stage
        primaryStage.show();
    }
    public static void main(String []args)
    {
        launch(args);
    }
}
