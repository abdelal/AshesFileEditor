package AshesEditor.views.buildtab;

import AshesEditor.Objects.Building;
import AshesEditor.utils.Parser;
import AshesEditor.views.listCells.BuildingListViewCell;
import com.jfoenix.controls.JFXListView;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Aki on 6/8/2017.
 */
public class BuildtabPresenter implements Initializable {


    @FXML
    private JFXListView<Building> buildinglist= new JFXListView<>();

    @FXML
    private TextField searchtf;


    private ObservableList<Building> buldingObserableList;
    private Parser parser= Parser.getInstance();


    public void LoadElements(){
        buldingObserableList =parser.ReadBuildings();


        buildinglist.setItems(buldingObserableList);
        buildinglist.setCellFactory(studentListView -> new BuildingListViewCell());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        LoadElements();
    }
}
