package com.example.demo;


import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;

@Component
public class DataAccess {

    public String postalCode;
    public String data;
    public String[] dataArray;


//    public DataAccess(String postalCode){
//        this.postalCode=postalCode;
//    }
    public DataAccess() {
        try {
//            String pathData=System.getProperty("src/main/resources/Data.txt");
            FileInputStream fis = new FileInputStream("src/main/resources/Data.txt"); //Sciezka podawana przez konfiguracje
            //Tak jakby przez konsole, podawanie argumentów do Javy przez konsole?
            data = IOUtils.toString(fis, "UTF-8");

            fis.close();
            dataArray=data.split(",");





        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String returnPostalCode() {
        for(int i=0;i< dataArray.length;i+=2){
            postalCode=dataArray[i];
        }
        return postalCode;
    }

    //Now do access to the data from a file.
}