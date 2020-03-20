package imageManageToolSceneBuilder;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javax.swing.*;
import javafx.scene.layout.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class Controller implements Initializable {
    @FXML
    private BorderPane pane;
    double pw, ph;

    @FXML
    private HBox hb;
    double hbw;
    @FXML
    private Button btn1, btn2, btn3;

    @FXML
    private TreeTableView ttv;
    double w, h;

    @FXML
    private TreeTableColumn c1, c2, c3, c4, c5, c6, c7;

    @FXML
    public void convertFormat(ActionEvent event) {
        // to do
    }

    @FXML
    public void upload(ActionEvent event) {
        // to do

    }

    @FXML
    public void download(ActionEvent event) {
        // to do

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ttv.prefWidthProperty().bind(pane.widthProperty());
        /*
         * pw = pane.getWidth(); ph = pane.getHeight(); w = ttv.getWidth(); h =
         * ttv.getHeight(); // bind treetableview's width to borderpane's width
         * ttv.prefWidthProperty().bind(pane.widthProperty()); // set treetableview and
         * hbox's height ttv.setPrefHeight(ph * 0.9); hb.setPrefHeight(ph * 0.1); // set
         * each cell's width c1.setPrefWidth(w * 0.25); c2.setPrefWidth(w * 0.05);
         * c3.setPrefWidth(w * 0.05); c4.setPrefWidth(w * 0.1); c5.setPrefWidth(w *
         * 0.2); c6.setPrefWidth(w * 0.1); c7.setPrefWidth(w * 0.25);
         * 
         * // bind buttons' height to hbox's height
         * btn1.prefHeightProperty().bind(hb.heightProperty());
         * btn2.prefHeightProperty().bind(hb.heightProperty());
         * btn3.prefHeightProperty().bind(hb.heightProperty()); // set buttons' width
         * hbw = hb.getWidth(); btn1.setPrefWidth(hbw * 0.25); btn2.setPrefWidth(hbw *
         * 0.25); btn3.setPrefWidth(hbw * 0.25);
         */

    }

}