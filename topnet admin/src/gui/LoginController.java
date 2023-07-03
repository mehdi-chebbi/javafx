/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class LoginController implements Initializable {

    @FXML
    private TextField pass_field;
    @FXML
    private TextField username_field;
    @FXML
    private Hyperlink recover_link;
    @FXML
    private Button sign_in_button;
    @FXML
    private Hyperlink register_link;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void recover_password(ActionEvent event) {
    }

    @FXML
    private void sign_in(ActionEvent event) {
    }

    @FXML
    private void register(ActionEvent event) {
    }
    
}
