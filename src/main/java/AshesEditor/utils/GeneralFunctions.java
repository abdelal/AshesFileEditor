package AshesEditor.utils;

import AshesEditor.Objects.Unit;
import com.google.common.collect.ArrayListMultimap;
import javafx.collections.ObservableList;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Aki on 6/5/2017.
 */
 public class GeneralFunctions {


    public static ArrayListMultimap generateMap(ObservableList<Unit> list){
        int sum=0;
        ArrayListMultimap<String,Unit> multimap= ArrayListMultimap.create();
        List<String> substrings;
        String substring;

        for (int i = 0; i < list.size(); i++) {
            Unit item=list.get(i);
            String name=item.getName();
            substrings=generateSubStrings(name);
            for (int j = 0; j <substrings.size(); j++) {
                substring=substrings.get(j);
                sum++;
                substring=substring.toLowerCase();
                multimap.put(substring,item);
                  }
        }
         return multimap;
    }


    public static List<String> generateSubStrings(String string){
         String sub;
        List<String> substrings=new LinkedList<>();
        int i, c, length;
         length = string.length();
          for( c = 0 ; c < length ; c++ )
        {
            for( i = 1 ; i <= length - c ; i++ )
            {
                sub = string.substring(c, c+i);
                substrings.add(sub);
            }}
        return substrings;
    }}
