/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author ghazi
 */
public class Produits_1Controller implements Initializable {

    @FXML
    private ComboBox<?> ComboBoxCat;
    @FXML
    private ScrollPane scrollPane;
    @FXML
    private ImageView LogoApp;
    @FXML
    private ImageView imagePanier;
    @FXML
    private Label Count;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ChangeValue(ActionEvent event) {
    }

    @FXML
    private void AccederPanier(MouseEvent event) {
    }
    
}
