/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coba;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lely
 */
public class FXMLLatihanController implements Initializable {

    String pin = "";
    String PING = "1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private TextField editNama;
    @FXML
    private TextField editAlamat
            ;
    @FXML
    private TextField editAbsen;
    @FXML
    private TextField editTlp;
    @FXML
    private TextArea TA;
    @FXML
    private Button cetak;
    @FXML
    private Button hapus;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    void buttonCetak(ActionEvent event) {
        String nama=editNama.getText();
        String alamat=editAlamat.getText();
        String absen=editAbsen.getText();
        String tlp=editTlp.getText();
        
        TA.setText("Nama : " +nama+ "\nAlamat: " +alamat+ "\nAbsen : "+absen+"\nNomor Telepon: " +tlp);
    }
    @FXML
    void buttonHapus(ActionEvent event) {
        TA.setText("");
        editNama.setText("");
        editAlamat.setText("");
        editAbsen.setText("");
        editTlp.setText("");
    }

}
