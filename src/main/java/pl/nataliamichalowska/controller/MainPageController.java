package pl.nataliamichalowska.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pl.nataliamichalowska.model.Weather;
import pl.nataliamichalowska.model.WeatherService;
import pl.nataliamichalowska.view.ViewFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainPageController extends BaseController implements Initializable {

    @FXML
    private TextField purposeCityText;

    @FXML
    private Label errorLabel;

    @FXML
    private TextField myCityText;

    private final WeatherService weatherService = new WeatherService();

    @FXML
    void checkButton() throws IOException {
        if((myCityText.getText().isEmpty()) && (purposeCityText.getText().isEmpty())){
            errorLabel.setText("Podaj nazwy miast!");
        } else if (myCityText.getText().isEmpty()) {
            errorLabel.setText("Podaj nazwę swojego miasta!");
        } else if (purposeCityText.getText().isEmpty()) {
            errorLabel.setText("Podaj nazwę miasta docelowego!");
        }
        else {
            getWeather();
        }
    }

    private void getWeather() throws IOException {
        String myCity = myCityText.getText();
        String purposeCity = purposeCityText.getText();
        ViewFactory viewFactory = new ViewFactory();
        viewFactory.showWeatherDisplay();

    }

    public MainPageController(ViewFactory viewFactory, String fxmlName) {
        super(viewFactory, fxmlName);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myCityText.setText("Kraków");
        purposeCityText.setText("Rzym");
    }
}