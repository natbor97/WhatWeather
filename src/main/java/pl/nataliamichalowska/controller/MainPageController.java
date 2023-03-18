package pl.nataliamichalowska.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pl.nataliamichalowska.view.ViewFactory;

public class MainPageController extends BaseController {

    @FXML
    private TextField destinationCityText;

    @FXML
    private Label errorLabel;

    @FXML
    private TextField initialCityText;

    @FXML
    void checkButton() {
        if((initialCityText.getText().isEmpty()) && (destinationCityText.getText().isEmpty())){
            errorLabel.setText("Podaj nazwy miast!");
        } else if (initialCityText.getText().isEmpty()) {
            errorLabel.setText("Podaj nazwę swojego miasta!");
        } else if (destinationCityText.getText().isEmpty()) {
            errorLabel.setText("Podaj nazwę miasta docelowego!");
        }
        else {
            System.out.println("Its ok!");
        }
    }

    public MainPageController(ViewFactory viewFactory, String fxmlName) {
        super(viewFactory, fxmlName);
    }
}