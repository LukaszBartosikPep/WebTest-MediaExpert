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
    public String shopAddress;


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
        for(int i=0;i< dataArray.length;i+=dataArray.length){
            postalCode=dataArray[i];
        }
        return postalCode;
    }
    public String returnShopAddress(){
        for(int i=0;i< dataArray.length;i+=dataArray.length){
            shopAddress=dataArray[i+2].trim();
        }
        return shopAddress;
    }
    public String returnShopPostalCode(){
        for(int i=0;i< dataArray.length;i+= dataArray.length){
            shopAddress=dataArray[i+3].trim();
        }
        return shopAddress;
    }

    //Now do access to the data from a file.
}