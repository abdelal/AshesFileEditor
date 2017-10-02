package AshesEditor.utils;

/**
 * Created by Aki on 6/1/2017.
 */
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.util.List;
import java.util.Map;

public class csv2json {
    public static List Csv2json(File csvfile) throws Exception {

            CsvSchema bootstrap = CsvSchema.emptySchema().withHeader();
            CsvMapper csvMapper = new CsvMapper();
            List data = csvMapper.reader(Map.class).with(bootstrap).readValues(csvfile).readAll();
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(SerializationFeature.INDENT_OUTPUT, true);


        System.out.println("");
        System.out.println("Done");
          return data;
    }

}