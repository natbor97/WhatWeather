package pl.nataliamichalowska.controller;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import pl.nataliamichalowska.model.Weather;
import pl.nataliamichalowska.view.ViewFactory;

public class WeatherDisplayController extends BaseController {
    @FXML
    private Label dateToday1;

    @FXML
    private Label dateToday2;

    @FXML
    private Label descriptionMyCityToday;

    @FXML
    private Label descriptionPurposeCityToday;

    @FXML
    private Group groupInitialToday1;

    @FXML
    private Group groupInitialToday11;

    @FXML
    private ImageView imageMyCityToday;

    @FXML
    private ImageView imagePurposeCityToday;

    @FXML
    private VBox initialForecastBox;

    @FXML
    private VBox initialForecastBox1;

    @FXML
    private Label myCity;

    @FXML
    private Label pressureMyCityToday;

    @FXML
    private Label pressurePurposeCityToday;

    @FXML
    private Label purposeCity;

    @FXML
    private Label tempMyCityToday;

    @FXML
    private Label tempPurposeCityToday;



    public WeatherDisplayController(ViewFactory viewFactory, String fxmlName) {
        super(viewFactory, fxmlName);

    }
}
