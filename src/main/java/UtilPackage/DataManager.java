package UtilPackage;

import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class DataManager {
    public static String getJsonFileToString(String path){

        JSONParser parser = new JSONParser();
        String stringJson ="";
        try{
            stringJson = parser.parse(new FileReader ("./src/main/resources/data/"+path)).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringJson;
    }

    public static String getJsonToString(){
        //TODO
        return "";
    }

    public static String getStringJson(String path){
     //TODO
        return "";
    }

    public static String returnTypeOfJson(String jsonString){
        //TODO
        return "";
    }

}
