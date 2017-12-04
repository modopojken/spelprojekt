package sample;

//import com.sun.org.apache.xpath.internal.operations.String;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;
public class Spel {
public static void main(String[] args) {


    int n;
    n = 1;
while(n < 11){

   n++;

    int sten;
    int sax;
    int pase;
    int dator;
    int minimum;
    int maximum;

    minimum = 0;
    maximum = 2;
    dator = minimum + (int) (Math.random()*maximum);






//Custom button text
    Object[] options = {"sten",
            "sax",
            "pase"};
    int resultat = JOptionPane.showOptionDialog(null,
            "Choose wisley",
            "Sten, Sax, Påse",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[2]);


    if (resultat == dator) {

        JOptionPane.showMessageDialog(null, "Det blev lika!");

    }



    if (resultat == 0)
    if (options[resultat].equals("sten")) {
        if (dator == 1) {
            JOptionPane.showMessageDialog(null, "Dator valde sax. Du vann!");
        }
    }

    if (resultat == 1)
        if (options[resultat].equals("sax")) {
            if (dator == 2) {
                JOptionPane.showMessageDialog(null, "Dator valde påse. Du vann!");
            }
        }

    if (resultat == 2)
        if (options[resultat].equals("pase")) {
            if (dator == 0) {
                JOptionPane.showMessageDialog(null, "Dator valde sten. Du vann!");
            }
        }

    if (resultat == 0)
        if (options[resultat].equals("sten")) {
            if (dator == 2) {
                JOptionPane.showMessageDialog(null, "Dator valde påse. Du förlorade!");
            }
        }
    if (resultat == 1)
        if (options[resultat].equals("sax")) {
            if (dator == 0) {
                JOptionPane.showMessageDialog(null, "Dator valde sten. Du förlorade!");
            }
        }

    if (resultat == 2)
        if (options[resultat].equals("pase")) {
            if (dator == 1) {
                JOptionPane.showMessageDialog(null, "Dator valde sax. Du förlorade!");
            }
        }




}

    }

}