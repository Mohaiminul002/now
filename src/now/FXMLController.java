/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package now;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hp
 */
public class FXMLController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private TextField Username;
    @FXML
    private PasswordField Password;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   @FXML
    private void actionbutton(ActionEvent event) throws IOException {
        if (event.getSource() == button) {
            String userid = Username.getText();

            String userpass = Password.getText();

            if (userid.equalsIgnoreCase("Mohaiminul Islam") && userpass.equalsIgnoreCase("Mohaiminul")) {

                Stage primaryStage = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));

                Scene scene = new Scene(root);

                primaryStage.setScene(scene);
                primaryStage.show();
               primaryStage.setTitle("Dashboard");

                System.out.println("Login Success");

            } else {
                System.out.println("Unuccessful");

            }
        }

    }
}
