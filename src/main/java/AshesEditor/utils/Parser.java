package AshesEditor.utils;

import AshesEditor.Objects.Building;
import AshesEditor.Objects.TextWithID;
import AshesEditor.Objects.Unit;
import AshesEditor.utils.DDS.DDSImage;
import com.google.gson.Gson;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.scene.control.TextInputDialog;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import static AshesEditor.utils.DDS.DDSUtils.getSwingImage;


/**
 * Created by Aki on 5/31/2017.
 */
public class Parser {

   // FileWriter fileWriter=FileWriter.getInstance();


      private String PATH="F:\\Games\\Steam\\steamapps\\common\\Ashes of the Singularity Escalation";
      private String UnitPATH= "\\Assets\\GameCore\\UnitTemplates.csv";
      private String UnitTextPATH= "\\Assets\\UIText\\UnitText.csv";
      private String DDSPATH=PATH+"\\Assets\\UI\\Art\\New HUD\\MetaUnit_Icons_42x27.dds";
      private String DDSPATH2=PATH+"\\Assets\\UI\\Art\\New HUD\\Build_Menu_Icons_70x44.dds";
      private String DDSPATH3=PATH+"\\Assets\\UI\\Art\\New HUD\\Build_Menu_Icons_41x46   A.dds";
      private String DDSPATHOther=PATH+"\\Assets\\UI\\Art\\New HUD\\";
      private String BuildingPATH="\\Assets\\GameCore\\BuildingTemplates.csv";
    boolean iconsloaded=false;


   private Map<String,String> unitsText;
    Parser parser=null;
   private BufferedImage[] sprites;
   private    BufferedImage[] icons;
   static Gson gson=new Gson();
    private static Parser ourInstance = new Parser();

    public static Parser getInstance() {
        return ourInstance;
    }

    private Parser() {
    }


    public void upadteTextWithID(String key,String newDesc){
       unitsText.put(key,newDesc);

    }

    public String getUnitTextUsingID(String key){
        return unitsText.get(key);

    }

   public void SetPath(String path){
       PATH=path;
   }


   public List<String> getUnitTextKeys(){
       Set<String> strings = unitsText.keySet();
        List<String> text=new LinkedList<>();
       for (String key :
               strings) {
           text.add(key);

       }

       return text;
   }


    public  BufferedImage[] geticn(){
       //BufferedImage bigImg2= getbufferedImage(DDSPATHOther+"Build_Menu_Icons_41x46   A.dds");
        if(!iconsloaded) {
            iconsloaded=true;
            BufferedImage bigImg2 = getbufferedImage(DDSPATH2);
              final int width = 70;
            final int height = 44;
            final int rows = 59;
            final int cols = 2;
            System.out.println(bigImg2.getHeight() / 44);
            sprites = new BufferedImage[rows * cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sprites[(i * cols) + j] = bigImg2.getSubimage(
                            j * width,
                            i * height,
                            width,
                            height
                    );
                }
            }
            icons = sprites;
            return sprites;
        }
        return sprites;
  }





    private void writetoFile() {
        try{
            File file= new File("D:/ds/DSAD/dsaw/dsa/ewq/tesst.txt");
            if (!file.exists()) {
                if(file.mkdirs())
                System.out.println("sssssssssss");
                else
                    System.out.println("cant make file ");
            }
            PrintWriter writer = new PrintWriter("D:/ds/DSAD/dsaw/dsa/ewq/test.txt", "UTF-8");
            writer.println("The first line");
            writer.println("The second line");
            writer.close();
        } catch (IOException e) {
            // do something
        }
    }
    public  BufferedImage[] geticn1(){
/*            final int width = 42;
            final int height = 27;
            final int rows = 25;
            final int cols = 2;
            BufferedImage[] sprites  =new BufferedImage[rows*cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sprites[(i * cols) + j] = bigImg2.getSubimage(
                            j * width,
                            i * height,
                            width,
                            height
                    ); } }
                    icons=sprites;
            return sprites;*/
return null;
              }
    private  BufferedImage getbufferedImage (String path){
        DDSImage img = null;
        try {
            img = DDSImage.read(path);
            if (img==null)
                return null;
           return getSwingImage(img, img.getMipMap(0));

        } catch (IOException e) {

        }
        return null;
    }


//this function will read the units
    public  ObservableList<Unit> ReadUnits(){
        try {
            File file=new File(PATH+UnitPATH);
            if(file.canRead()) {
                List data = csv2json.Csv2json(file);
                List<Unit> units = new LinkedList<>();
                while (!data.isEmpty()) {
                    String jsonstring = gson.toJson(data.remove(0));
                    Unit unit = gson.fromJson(jsonstring, Unit.class);
                    units.add(unit);

              }
                ReadUnitsText();
                ReadBuildings();

              return FXCollections.observableList(units);
               }

        } catch (Exception e){
                e.printStackTrace();
        }
        System.out.println("cant read file  "+PATH+UnitPATH);
        return FXCollections.observableList(new LinkedList<>());
    }


    public void ReadUnitsText() {
        try {
            unitsText = new HashMap<>();

            File file = new File(PATH + UnitTextPATH);
            if (file.canRead()) {
                List data = csv2json.Csv2json(file);
                while (!data.isEmpty()) {
                    String jsonstring = gson.toJson(data.remove(0));
                    TextWithID text = gson.fromJson(jsonstring, TextWithID.class);
                    StringProperty textpro=new SimpleStringProperty(text.getTranslatedString());
                    unitsText.put(text.getKey(),text.getTranslatedString());

                }
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }




    //this function will read the units
    public  ObservableList<Building> ReadBuildings(){
        try {
            File file=new File(PATH+BuildingPATH);
            if(file.canRead()) {
                List data = csv2json.Csv2json(file);
             //   PrintFile(file);
                List<Building> Buildings = new LinkedList<>();
                while (!data.isEmpty()) {
                    String jsonstring = gson.toJson(data.remove(0));
             //    System.out.println(jsonstring);
                    if (!jsonstring.isEmpty()) {
                        Building building = gson.fromJson(jsonstring, Building.class);
                 //     System.out.println(building.toString());
                        Buildings.add(building);

                    }

                }
               // ReadUnitsText();
                return FXCollections.observableList(Buildings);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("cant read file  "+PATH+BuildingPATH);
        return FXCollections.observableList(new LinkedList<>());
    }













    public ObservableMap<String,Unit> ReadUnitstoMap(){
        try {
            File file=new File(PATH+UnitPATH);
            if(file.canRead()) {
                List data = csv2json.Csv2json(file);
                Map<String,Unit> unitsMap= new HashMap<>();
                List<Unit> units = new LinkedList<>();
                while (!data.isEmpty()) {
                    String jsonstring = gson.toJson(data.remove(0));
                    Unit unit = gson.fromJson(jsonstring, Unit.class);
                    units.add(unit);
                    unitsMap.put(unit.getName(),unit);

                }
                return FXCollections.observableMap(unitsMap);

            } }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("cant read file  "+PATH+UnitPATH);
        return FXCollections.observableMap(new HashMap<String,Unit>());
    }
    public void GamePathSetter(){
        TextInputDialog dialog = new TextInputDialog(PATH);
        dialog.setTitle("GamthPath");
        //dialog.setHeaderText("GamePth");
        dialog.setContentText("Path of Ashes of the Singularity ");

        Optional<String> result = dialog.showAndWait();


// The Java 8 way to get the response value (with lambda expression).
        result.ifPresent(gamePath -> SetGamePath(gamePath));
//        System.out.println(GetGamePath()+"************");

    }
    public void GamePathSetter(String path){
        PATH=path;

    }
    public  void PrintFile(File file){
       try {
            Scanner scanner=new Scanner(file);

            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }
    public  void files() {
        PrintFile(new File(UnitPATH));
    }
    public void SetGamePath(String path){
        PATH=path;
        update();
    }
    private void update() {
       // geticn();
    }
    public String GetGamePath(){
        return PATH;
    }


    public Map<String,String> getTextUsingIDMap() {
        return unitsText;
    }
}
