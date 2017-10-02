package AshesEditor.views.listCells;

import AshesEditor.Objects.Unit;
import AshesEditor.utils.Parser;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Aki on 6/3/2017.
 */
public class UnitListViewCell extends ListCell<Unit> {


    @FXML
    private ImageView image =new ImageView();
    @FXML
    private Label unitname=new Label();

    Parser parser=Parser.getInstance();

    private FXMLLoader mLLoader;
    private boolean loaded=false;


    @FXML
    private AnchorPane root;


    @Override
    protected void updateItem(Unit unit, boolean empty) {
        super.updateItem(unit, empty);
        if (empty || unit == null) {
            setText(null);
            setGraphic(null);
        } else {

            if (mLLoader == null) {
                mLLoader = new FXMLLoader(getClass().getResource("/views/unitlistcell.fxml"));
                mLLoader.setController(this);
                try {
                    mLLoader.load();

                } catch (IOException e) {
                     e.printStackTrace();
                }
            }
           unitname.setText(parser.getUnitTextUsingID(unit.getName()));
           // String name=parser.getUnitTextUsingID(unit.getName());
          //  unitname.textProperty().bind(parser.getUnitTextUsingID(unit.getName()));
            BufferedImage[] geticn = parser.geticn();
            int iconidex;
            BufferedImage[] icons=parser.geticn();
            if(!unit.getDetailIconIndex().equalsIgnoreCase(""))
            iconidex=Integer.parseInt(unit.getIconIndex());
            else
            iconidex=Integer.MAX_VALUE;

            if(iconidex<icons.length) {
                Image img = SwingFXUtils.toFXImage(geticn[iconidex], null);
                image.setImage(img);
            }else
                image.setImage(null);
            setText(null);
            setGraphic(root);
        }


    }



}
