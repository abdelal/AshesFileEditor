package AshesEditor.views.unittab;

import AshesEditor.Objects.Unit;
import AshesEditor.utils.GeneralFunctions;
import AshesEditor.utils.Parser;
import AshesEditor.views.listCells.UnitListViewCell;
import AshesEditor.views.unitdetails.UnitdetailsPresenter;
import AshesEditor.views.unitdetails.UnitdetailsView;
import com.google.common.collect.ArrayListMultimap;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.*;

/**
 * Created by Aki on 6/2/2017.
 */
public class UnittabPresenter implements Initializable {

    @FXML
    AnchorPane details;

    @FXML
    JFXListView<Unit> unitslist;

    @FXML
    private JFXCheckBox phcCheck;

    @FXML
    private JFXCheckBox subCheck;

    @FXML
    private TextField searchtf;

    ArrayListMultimap multMap= ArrayListMultimap.create();
    @FXML
    JFXButton saveButton;


    Map<String,String> unitsText=new HashMap<>();


    ObservableList<Unit> dispalyList=FXCollections.observableList(new LinkedList<>());
    Parser parser=Parser.getInstance();
    UnitdetailsView unitview;
    private ObservableList<Unit> unitObserableList= FXCollections.observableArrayList();


    public UnittabPresenter(){

    }

    @Override
    /*i think i need to maintain a map for searching and the convert that to a list */
    public void initialize(URL location, ResourceBundle resources) {

        unitview = new UnitdetailsView();
        unitview.getViewAsync(details.getChildren()::add);
        searchtf.setText("");
        subCheck.selectedProperty().setValue(true);
        phcCheck.selectedProperty().set(true);

        SetListners();

    }
    private void SetListners() {
        unitslist.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            UnitdetailsPresenter presenter = (UnitdetailsPresenter) unitview.getPresenter();
            presenter.loadUnit(newValue);
        });
        phcCheck.selectedProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue.booleanValue());

        });
        searchtf.textProperty().addListener((observable, oldValue, newValue) -> {

            //searching using a multimap
           Thread thread=new Thread(() -> {
                if(!newValue.isEmpty()) {
                    System.out.println("text");
                    List list = multMap.get(newValue.toLowerCase());
                    dispalyList.setAll(list);
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i).toString());
                    }
                    System.out.println("if");
                    unitslist.setItems(dispalyList);
                }
                else {
                    System.out.println("else");
                    unitslist.setItems(unitObserableList);
                 }

            });
            thread.run();


    });
    }



    private void searchwithenter() {
        searchtf.setOnKeyPressed((KeyEvent e)->{
        switch (e.getCode())
        {
        case ENTER:
            String newValue=searchtf.getText().toLowerCase();
            Thread thread=new Thread(() -> {
                if(newValue.isEmpty()) {

                    System.out.println("fffffffffffffffffffffffffffff");
                    dispalyList.setAll(unitObserableList);
                }
                else{
                    System.out.println("vakdsadsa");
                    List list = multMap.get(newValue);
                    dispalyList.setAll(list);}
                       });
                thread.run();


        }});
    }

    public void loadelements(){

            unitObserableList = parser.ReadUnits();
            //  dispalyList.setAll(unitObserableList);
               multMap= GeneralFunctions.generateMap(unitObserableList);
                unitslist.setItems(unitObserableList);
                unitslist.setCellFactory(studentListView -> new UnitListViewCell());


    }

    @FXML
    void SaveButtonClicked(){



    }

    public ObservableList<Unit> GetUnits() {
        return unitObserableList;

    }
}


