package imageManageToolSceneBuilder;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.collections.ObservableList;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javax.swing.*;
import javafx.scene.layout.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class Controller implements Initializable {
    @FXML
    private BorderPane pane;
    // double pw, ph;

    @FXML
    private HBox hb;
    // double hbw;
    @FXML
    private Button btn1, btn2, btn3;

    @FXML
    private TableView<ImageInfo> tbview;
    // double w, h;

    @FXML
    private TableColumn<ImageInfo, String> c1;// c1 should output ImageInfo not string, need to change
    @FXML
    private TableColumn<ImageInfo, String> c2;
    @FXML
    private TableColumn<ImageInfo, String> c3;
    @FXML
    private TableColumn<ImageInfo, String> c4;
    @FXML
    private TableColumn<ImageInfo, String> c5;
    @FXML
    private TableColumn<ImageInfo, String> c6;
    @FXML
    private TableColumn<ImageInfo, String> c7;

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
    /*
     * initialize the Controller class
     */

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // ttv.prefWidthProperty().bind(pane.widthProperty());
        // set up the columns in the table
        c1.setCellValueFactory(new PropertyValueFactory<ImageInfo, String>("ImageInfo"));
        c2.setCellValueFactory(new PropertyValueFactory<ImageInfo, String>("Name"));
        c3.setCellValueFactory(new PropertyValueFactory<ImageInfo, String>("Type"));
        c4.setCellValueFactory(new PropertyValueFactory<ImageInfo, String>("Size"));
        c5.setCellValueFactory(new PropertyValueFactory<ImageInfo, String>("Resolution"));
        c6.setCellValueFactory(new PropertyValueFactory<ImageInfo, String>("Date"));
        c7.setCellValueFactory(new PropertyValueFactory<ImageInfo, String>("Path"));

        // load dummy data
        tbview.setItems(getImageInfo());

    }

    /*
     * this method will return an ObservableList of ImageInfo objects
     */
    public ObservableList<ImageInfo> getImageInfo() {
        ObservableList<ImageInfo> img = FXCollections.observableArrayList();
        // img.add(new ImageInfo());
        return img;
    }

}