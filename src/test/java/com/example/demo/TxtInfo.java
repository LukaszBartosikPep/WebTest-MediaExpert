package com.example.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class TxtInfo {
    @Autowired
    LoginAccess loginAccess;
    public String data;
    public List<LoginAccess> loginAccessList=new ArrayList<>();


//    private static final Logger logger = LoggerFactory.getLogger(TxtInfo.class);

    public List<LoginAccess> ReturnAccessList(int i) {


//        logger.info("set");

        try {
            FileInputStream fis = new FileInputStream("src/main/resources/data.txt");
            data = IOUtils.toString(fis, "UTF-8");


            String[] loginArray = data.split(",");
            for (i = 0; i < loginArray.length; i += 2) {
                String username = loginArray[i].trim();
                String password = loginArray[i + 1].trim();
                LoginAccess loginAccess = new LoginAccess(username, password);
                loginAccessList.add(loginAccess);

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