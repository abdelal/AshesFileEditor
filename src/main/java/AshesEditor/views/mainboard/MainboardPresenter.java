package AshesEditor.views.mainboard;

import AshesEditor.Objects.Unit;
import AshesEditor.utils.OutPutWriter;
import AshesEditor.utils.Parser;
import AshesEditor.views.buildtab.BuildtabView;
import AshesEditor.views.unittab.UnittabPresenter;
import AshesEditor.views.unittab.UnittabView;
import com.jfoenix.controls.JFXButton;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Aki on 6/2/2017.
 */
public class MainboardPresenter implements Initializable {

    @FXML
    AnchorPane unittab;

    @FXML
    AnchorPane buildingstab;

    @FXML
    Button button1;

    @FXML
    MenuItem gathPath;

    UnittabView unitview;
    BuildtabView buildingview;
    Parser parser=Parser.getInstance();

    @FXML
    TextField gamePathtv;

    @FXML
    TextField saveDir;
    @FXML
    JFXButton loadButton;



    ObservableList<Unit> unitList ;
    OutPutWriter writer=OutPutWriter.getInstance();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        unitview = new UnittabView();
        unitview.getViewAsync(unittab.getChildren()::add);
        gamePathtv.setText(parser.GetGamePath());
         saveDir.setText(writer.GETOutPutPath());
        buildingview = new BuildtabView();
        if(buildingview==null)
            System.out.println("something is wrong");
        buildingview.getViewAsync(buildingstab.getChildren()::add);



    }

    @FXML
    void Test(){
        System.out.println("checking if this is called");
    }

    @FXML
    void load(){

        ( new Thread(() -> {


          UnittabPresenter presenter = (UnittabPresenter) unitview.getPresenter();
          presenter.loadelements();
          unitList=presenter.GetUnits();

  /*        BuildtabPresenter bpresentor = (BuildtabPresenter) buildingview.getPresenter();
          bpresentor.LoadElements();*/

        })).start();

    }

    @FXML
     public void GamePathSetter(){
        parser.GamePathSetter();

    }

    @FXML
    public void GamePathSetter2(){
        parser.GamePathSetter(gamePathtv.getText());
        load();
    }

    @FXML
    public void SavePath(){
        writer.SetOutPutPath(saveDir.getText());
    }

    @FXML
    public void Save(){
        writer.WritesFiles(unitList ,saveDir.getText());

    }

}
