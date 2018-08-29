package test;

import javafx.fxml.FXML;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {

    @FXML
    public TextField firstName;

    public void getFirstName()
    {
        System.out.println(firstName.getText());
    }
}
