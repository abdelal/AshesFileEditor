package AshesEditor.views.listCells;

import AshesEditor.Objects.Building;
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
 * Created by Aki on 6/8/2017.
 */
public class BuildingListViewCell extends ListCell<Building> {


    @FXML
    private AnchorPane root;

    @FXML
    private ImageView image= new ImageView();

    @FXML
    private Label buildingname=new Label();

    private Parser parser=Parser.getInstance();
    private FXMLLoader mLLoader;

    @Override
    protected void updateItem(Building building, boolean empty) {
        super.updateItem(building, empty);
        if (empty || building == null) {
            setText(null);
            setGraphic(null);
        } else {

            if (mLLoader == null) {
                mLLoader = new FXMLLoader(getClass().getResource("/views/buildinglistcell.fxml"));
                mLLoader.setController(this);
                try {
                    mLLoader.load();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            buildingname.setText(building.getName());
            BufferedImage[] geticn = parser.geticn();
            int iconidex=0;
            BufferedImage[] icons=parser.geticn();
            if(!building.getDetailIconIndex().isEmpty()) {
                if(iconidex<icons.length) {
                    Image img = SwingFXUtils.toFXImage(geticn[iconidex], null);
                    image.setImage(img);
                }
                else
                iconidex = Integer.parseInt(building.getIconIndex());
            }
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
