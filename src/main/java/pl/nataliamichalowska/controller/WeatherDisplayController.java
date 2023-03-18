package pl.nataliamichalowska.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import pl.nataliamichalowska.model.Weather;
import pl.nataliamichalowska.view.ViewFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class WeatherDisplayController extends BaseController implements Initializable {

    @FXML
    private Label dateToday;

    @FXML
    private Label descriptionMyCityToday;

    @FXML
    private Label descriptionPurposeCityToday;

    @FXML
    private Group groupMyCityToday;

    @FXML
    private Group groupPurposeCityToday;

    @FXML
    private ImageView imageMyCityToday;

    @FXML
    private ImageView imagePurposeCityToday;

    @FXML
    private VBox myCityForecastBox;

    @FXML
    private Label pressureMyCityToday;

    @FXML
    private Label pressurePurposeCityToday;

    @FXML
    private VBox purposeCityForecastBox;

    @FXML
    private Label tempMyCityToday;

    @FXML
    private Label tempPurposeCityToday;




    public WeatherDisplayController(ViewFactory viewFactory, String fxmlName) {
        super(viewFactory, fxmlName);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setLocalDate();
    }

    private void setLocalDate() {
        LocalDate dateForToday = LocalDate.now();

        String formattedDate = dateForToday.format(Settings.DATE_FORMAT);
        dateToday.setText(formattedDate);
    }
}
