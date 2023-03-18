package pl.nataliamichalowska.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.nataliamichalowska.controller.BaseController;
import pl.nataliamichalowska.controller.MainPageController;
import pl.nataliamichalowska.controller.WeatherDisplayController;
import pl.nataliamichalowska.model.Weather;

import java.io.IOException;

public class ViewFactory {
    public void showMainPage(){
        BaseController controller = new MainPageController (this, "MainPageView.fxml");
        initializeStage(controller);
    }

    public void showWeatherDisplay(){
        BaseController controller = new WeatherDisplayController(this, "WeatherDisplayView.fxml");
        initializeStage(controller);
    }

    private static void initializeStage(BaseController controller){
        FXMLLoader fxmlLoader = new FXMLLoader(ViewFactory.class.getResource(controller.getFxmlName()));
        fxmlLoader.setController(controller);

        Parent parent;
        try {
            parent = fxmlLoader.load();
        }catch(IOException e){
            e.printStackTrace();
            return;
        }

        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
