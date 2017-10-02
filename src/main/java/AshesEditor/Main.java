package AshesEditor;

import AshesEditor.views.mainboard.MainboardView;
import com.airhacks.afterburner.injection.Injector;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static String path="";

    @Override
    public void start(Stage stage) throws Exception {

        System.setProperty("happyEnding", " Enjoy the flight!");
        MainboardView appView;
        appView = new MainboardView();
        Scene scene = new Scene(appView.getView());
        stage.setTitle("AshesEditor");
        final String uri = getClass().getResource("app.css").toExternalForm();
        scene.getStylesheets().add("bootstrapfx.css");
        scene.getStylesheets().add(uri);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        Injector.forgetAll();
    }

    public static void main(String[] args) {
        launch(args);
    }
}