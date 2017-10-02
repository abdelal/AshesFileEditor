package AshesEditor.views.unitdetails;

import AshesEditor.Objects.Unit;
import AshesEditor.utils.OutPutWriter;
import AshesEditor.utils.Parser;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import org.controlsfx.control.textfield.TextFields;

import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Aki on 6/2/2017.
 */
public class UnitdetailsPresenter implements Initializable {


    @FXML
    private ImageView image;

    @FXML
    private TextField internailID;

    @FXML
    private TextField name;

    @FXML
    private TextField aicon;

    @FXML
    private TextField dicon;

    @FXML
    private TextField AssetID;

    @FXML
    private TextField quanta;

    @FXML
    private TextField logistics;

    @FXML
    private TextField dchild;

    @FXML
    private TextField cform;

    @FXML
    private TextField energy;

    @FXML
    private TextField data;

    @FXML
    private TextField metal;

    @FXML
    private TextField aorder;

    @FXML
    private TextField cTime;

    @FXML
    private TextField select;

    @FXML
    private TextField construct;

    @FXML
    private TextField morder;

    @FXML
    private TextArea desc;

    @FXML
    private TextField icon;

    @FXML
    private TextField descID;
    @FXML
    private TextField eps;

    @FXML
    private TextField nhp;
    @FXML
    private TextField mshields;
    @FXML
    private TextField menrgy;
    @FXML
    private TextField armor;
    @FXML
    private TextField hRate;
    @FXML
    private TextField sRate;
    @FXML
    private TextField breaker;
    @FXML
    private TextField prom;
    @FXML
    private TextField cYform;
    @FXML
    private TextField flokerTemp;
    @FXML
    private TextField unitflags;
    @FXML
    private TextField maxChildren;
    @FXML
    private TextField rRadius;
    @FXML
    private TextField sRadius;
    @FXML
    private TextField preReqBuilding;

    @FXML
    private TextField preReqAddon;
   @FXML
    private TextField capture;
    @FXML
    private TextField formation;
    @FXML
    private TextField unitmodule;


    @FXML
    Unit unit;
    OutPutWriter fileWriter=OutPutWriter.getInstance();



    Parser parser=Parser.getInstance();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      BufferedImage[]  geticn = parser.geticn();
        Setlistners();
        desc.setWrapText(true);


       }
    void Setlistners(){
        name.textProperty().addListener((observable, oldValue, newValue) -> {
            unit.setName(newValue);

            if(!newValue.isEmpty()){
            //    UnittabPresenter.changeName(unit,name.getText());

            }
        });
        internailID.textProperty().addListener((observable, oldValue, newValue) -> {
            unit.setInternalID(newValue);
        });
        aicon.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setArmyIconIndex(newValue);
        });
        dicon.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setDetailIconIndex(newValue);
        });
        AssetID.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setAssetID(newValue);
        });
        quanta.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setCostQuanta(newValue);
        });
        logistics.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setCostLogistics(newValue);
        });
        dchild.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setDefaultChildFormationTemplate(newValue);
        });
        cform.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setChildFormationXOffset(newValue);
        });
        energy.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setCostEnergy(newValue);
        });
        data.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setCostData(newValue);
        });
        metal.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setCostMetal(newValue);
        });
        aorder.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setAttackOrderUIAudioGroupID(newValue);
        });
        cTime.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setConstructionTime(newValue);
        });
        select.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setSelectUIAudioGroupID(newValue);
        });
        construct.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setConstructUIAudioGroupID(newValue);
        });
        morder.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setMoveOrderUIAudioGroupID(newValue);
        });
        descID.textProperty().addListener((observable, oldValue, newValue) -> {
            unit.setDescription(newValue);

        });
        icon.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setIconIndex(newValue);
        });
        eps.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setEnergyPerSecond(newValue);
        });
        nhp.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setMaxHPs(newValue);
        });
        mshields.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setMaxShields(newValue);
        });
        menrgy.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setMaxEnergy(newValue);
        });
        armor.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setArmor(newValue);
        });
        hRate.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setHealRate(newValue);
        });
        sRate.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setShieldRegenRate(newValue);
        });
        breaker.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setTieBreakerForTierPromotions(newValue);
        });
        prom.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setPromotedUnitWhenPromotedWhichUnitsFormationDataToUse(newValue);
        });
        cYform.textProperty().addListener((observable, oldValue, newValue) -> {

                    unit.setChildFormationYOffset(newValue);
                });
        flokerTemp.textProperty().addListener((observable, oldValue, newValue) -> {

                    unit.setFlockerTemplate(newValue);
                } );
        unitflags.textProperty().addListener((observable, oldValue, newValue) -> {

                    unit.setFlags(newValue);
                });
        maxChildren.textProperty().addListener((observable, oldValue, newValue) -> {

                    unit.setMaxChildrenDoNotSetThisHigherThan128(newValue);
                });
        rRadius.textProperty().addListener((observable, oldValue, newValue) -> {

                    unit.setRadarRadius(newValue);
                });
        sRadius.textProperty().addListener((observable, oldValue, newValue) -> {

                    unit.setSightRadius(newValue);
                });
        preReqBuilding.textProperty().addListener((observable, oldValue, newValue) -> {

                    unit.setPrereqBuilding(newValue);
                } );
        preReqAddon.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setPrereqFactoryAddOn(newValue);
        } );
        capture.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setCanCapture(newValue);
        } );
        formation.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setFormationTemplate(newValue);
        } );
        unitmodule.textProperty().addListener((observable, oldValue, newValue) -> {

            unit.setModuleDefinitionFile(newValue);
        } );
        descID.setOnKeyPressed((KeyEvent e)->{
            switch (e.getCode()){
                case ENTER:
                    if (parser.getUnitTextUsingID(descID.getText())!=null)

                   desc.setText(parser.getUnitTextUsingID(descID.getText()));
               //     desc.setText(parser.getUnitTextUsingID(descID.getText().toString()).getValue());
                    else {
                        StringProperty string = new SimpleStringProperty();
                        string.setValue("");
                    }
                        parser.upadteTextWithID(descID.getText(), "");
                    break;
                    default:
                        break;
            }});
        desc.setOnKeyPressed((KeyEvent e)->{
            switch (e.getCode()){
                case ENTER:
                    StringProperty newDesc=new SimpleStringProperty();
                    newDesc.setValue(desc.getText());
              //   parser.upadteTextWithID(descID.getText(),newDesc);
                    parser.upadteTextWithID(descID.getText(),desc.getText());
                    break;
                default:
                    break;
            }

        });



    }




public void loadUnit(Unit unit){

    this.unit=unit;
    if (unit!=null){
    BufferedImage[]  geticn = parser.geticn();
    internailID.setText(unit.getInternalID());
    name.setText(unit.getName());
    aicon.setText(unit.getArmyIconIndex());
    dicon.setText(unit.getDetailIconIndex());
    AssetID.setText(unit.getAssetID());;
    quanta.setText(unit.getCostQuanta());
    logistics.setText(unit.getCostLogistics());
    dchild.setText(unit.getDefaultChildFormationTemplate());
    cform.setText(unit.getChildFormationXOffset());
    energy.setText(unit.getCostEnergy());
    data.setText(unit.getCostData());
    metal.setText(unit.getCostMetal());
    aorder.setText(unit.getAttackOrderUIAudioGroupID());
    cTime.setText(unit.getConstructionTime());
    select.setText(unit.getSelectUIAudioGroupID());
    construct.setText(unit.getConstructUIAudioGroupID());
    morder.setText(unit.getMoveOrderUIAudioGroupID());
    descID.setText(unit.getDescription());
    icon.setText(unit.getIconIndex());
    eps.setText(unit.getEnergyPerSecond());
    nhp.setText(unit.getMaxHPs());
    mshields.setText(unit.getMaxShields());
    menrgy.setText(unit.getMaxEnergy());
    armor.setText(unit.getArmor());
    hRate.setText(unit.getHealRate());
    sRate.setText(unit.getShieldRegenRate());
    breaker.setText(unit.getTieBreakerForTierPromotions());
    prom.setText(unit.getPromotedUnitWhenPromotedWhichUnitsFormationDataToUse());
    cYform.setText(unit.getChildFormationYOffset());
    flokerTemp.setText(unit.getFlockerTemplate());
    unitflags.setText(unit.getFlags());
    maxChildren.setText(unit.getMaxChildrenDoNotSetThisHigherThan128());
    rRadius.setText(unit.getRadarRadius());
    sRadius.setText(unit.getSightRadius());
    preReqAddon.setText(unit.getPrereqFactoryAddOn());
    preReqBuilding.setText(unit.getPrereqBuilding());
    capture.setText(unit.getCanCapture());
    formation.setText(unit.getFormationTemplate());
    unitmodule.setText(unit.getModuleDefinitionFile());
    TextFields.bindAutoCompletion(descID,parser.getUnitTextKeys());
   // desc.setText(parser.getUnitTextUsingID(unit.getDescription()).getValue());
        desc.setText(parser.getUnitTextUsingID(unit.getDescription()));

    }

    }
}
