package edu.csueastbay.cs401.scelli2;

import edu.csueastbay.cs401.scelli.Truth;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    Truth samsTruth;
    @FXML
    private Label displayLabel;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(samsTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        samsTruth = new Truth("My favorite person is", "Sara");
        displayLabel.setText(samsTruth.getQuestion());
    }
}
