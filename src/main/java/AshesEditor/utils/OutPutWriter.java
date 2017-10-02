package AshesEditor.utils;

import AshesEditor.Objects.Unit;
import javafx.collections.ObservableList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Aki on 6/5/2017.
 */
public class OutPutWriter {


    private String outputPath = "C:/";

    String UnitPATH= "\\Ashes of the Singularity Escalation\\Assets\\GameCore\\UnitTemplates.csv";
    String UnitTextPATH= "\\Ashes of the Singularity Escalation\\Assets\\UIText\\UnitText.csv";
    String DDSPATH="\\Assets\\UI\\Art\\New HUD\\MetaUnit_Icons_42x27.dds";
    String DDSPATHOther="\\Assets\\UI\\Art\\New HUD\\";


    private Parser parser = Parser.getInstance();

    private List<String> folders = new LinkedList<>();
    //Singleton
    private static OutPutWriter ourInstance = new OutPutWriter();

    public static OutPutWriter getInstance() {
        return ourInstance;
    }

    private OutPutWriter() {

    }


    public void WritesFiles( ObservableList<Unit> units,String path) {
    CreateFolders(path);
    WriteUnitFile(units,path);
        WriteUnitTextFile(path);

    }
    private void WriteUnitTextFile(String outputPath){
        try {
            Map<String,String> map=parser.getTextUsingIDMap();
            PrintWriter writer = new PrintWriter(outputPath+UnitTextPATH);
            writer.println("Key,Translated String");
            Set<String> strings = map.keySet();
            for (String key: strings) {

       //         writer.println(key+","+map.get(key).getValue());
                writer.println(key+","+map.get(key));
            }
            writer.close();
            // File file = new File(outputPath+UnitPATH);
            //  file.println
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }





    private void WriteUnitFile(ObservableList<Unit> units, String outputPath){
        try {
            PrintWriter writer = new PrintWriter(outputPath+UnitPATH);
            writer.println("Internal ID,Name,Icon Index,Detail Icon Index,Army Icon Index,AssetID," +
            "FlockerTemplate,Formation Template,Default Child Formation Template,Child Formation" +
            " X Offset,Child Formation Y Offset,Promoted Unit (when promoted - which units formation" +
            " data to use),Spawn Count,Max Children (do not set this higher than 128!!!)," +
            "Tie Breaker for Tier Promotions,Flags,Prereq Building,Prereq Factory Add-On,Can" +
            " Capture,Max HPs,Max Energy,Energy Per Second,Armor,Heal Rate,Max Shields,Shield " +
            "Regen Rate,Sight Radius,Radar Radius,Cost Metal,Cost Data,Cost Quanta,Cost Energy," +
            "Cost Logistics,Construction Time,Select UI.AudioGroup ID,Construct UI.AudioGroupID," +
            "Move Order UI.AudioGroup ID,Attack Order UI.AudioGroup ID,Module Definition File," +
            "Description");

            for (Unit unit:units) {
                writer.println(unit.fileLine());

            }
            writer.close();
           // File file = new File(outputPath+UnitPATH);
          //  file.println
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    private void CreateFolders(String path){
            folders.add("\\Ashes of the Singularity Escalation\\Assets\\GameCore\\BuildingModules");
            folders.add("\\Ashes of the Singularity Escalation\\Assets\\GameCore\\ModuleTemplates\\ConstructionLists");
            folders.add("\\Ashes of the Singularity Escalation\\Assets\\GameCore\\UnitModules");
            folders.add("\\Ashes of the Singularity Escalation\\Assets\\UIText");
            for (int i = 0; i < folders.size(); i++) {
                File outfile = new File(path + folders.get(i));
                if (!outfile.exists()) {
                    outfile.mkdirs();
                }
            }
        }




    public void SetOutPutPath(String path) {

        outputPath = path;

    }
    public String GETOutPutPath() {

        return outputPath;

    }


}
