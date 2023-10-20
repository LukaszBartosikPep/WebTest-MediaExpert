package com.example.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

@Component

public class TxtInfo {
//    LoginAccess loginAccess;
    public String data;
    public List<LoginAccess> loginAccessList=new ArrayList<>();


//    private static final Logger logger = LoggerFactory.getLogger(TxtInfo.class);

    public List<LoginAccess> ReturnAccessListP() {


//        logger.info("set");

        try {
//            String pathData=System.getProperty("src/main/resources/Data.txt");
            FileInputStream fis = new FileInputStream("src/main/resources/Data.txt"); //Sciezka podawana przez konfiguracje
            //Tak jakby przez konsole, podawanie argumentów do Javy przez konsole?
            data = IOUtils.toString(fis, "UTF-8");

            fis.close();

            String[] loginArray = data.split(",");

//            for (int i = 0; i < loginArray.length; i++) {
//                System.out.println(loginArray[i]);
//            }
            for (int i = 0; i < loginArray.length; i += 4) {
                String username = loginArray[i].trim();
                String password = loginArray[i + 1].trim();
                String proUsername=loginArray[i+2].trim();
                String proPassword=loginArray[i+3].trim();

                LoginAccess loginAccess = new LoginAccess(username, password);
                LoginAccess loginAccessProblemUser = new LoginAccess(proUsername, proPassword);
                loginAccessList.add(loginAccess);
                loginAccessList.add(loginAccessProblemUser);

            }
            for(LoginAccess element: loginAccessList) {
            System.out.println(element);
            }
//            System.out.println(loginList);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return loginAccessList;


    }
}