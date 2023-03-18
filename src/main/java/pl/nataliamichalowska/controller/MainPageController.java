package pl.nataliamichalowska.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pl.nataliamichalowska.view.ViewFactory;

public class MainPageController extends BaseController {

    @FXML
    private TextField purposeCityText;

    @FXML
    private Label errorLabel;

    @FXML
    private TextField myCityText;

    @FXML
    void checkButton() {
        if((myCityText.getText().isEmpty()) && (purposeCityText.getText().isEmpty())){
            errorLabel.setText("Podaj nazwy miast!");
        } else if (myCityText.getText().isEmpty()) {
            errorLabel.setText("Podaj nazwę swojego miasta!");
        } else if (purposeCityText.getText().isEmpty()) {
            errorLabel.setText("Podaj nazwę miasta docelowego!");
        }
        else {
            displayWeather();
        }
    }

    private void displayWeather(){
        ViewFactory viewFactory = new ViewFactory();
        viewFactory.showWeatherDisplay();
    }

    public MainPageController(ViewFactory viewFactory, String fxmlName) {
        super(viewFactory, fxmlName);
    }
}