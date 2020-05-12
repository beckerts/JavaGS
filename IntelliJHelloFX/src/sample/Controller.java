package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField nameField;
    @FXML private PasswordField passwordField;
    @FXML private Text actiontarget;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText(nameField.getText() + "'s password is " + passwordField.getText());
    }
}
