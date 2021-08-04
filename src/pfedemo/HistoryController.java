/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfedemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import pfedemo.classes.Fichier;
/**
 * FXML Controller class
 *
 * @author khali
 */
public class HistoryController implements Initializable {
 @FXML 
    private TableView<Fichier> liste;
     @FXML
    private TableColumn<Fichier, Integer> id;
 @FXML
    private TableColumn<Fichier, String> titre;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
