package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
//@ResponseBody
@Controller
@ResponseBody
public class Testing{
    private static final String CORRECT_USERNAME = "standard_user";
    private static final String CORRECT_PASSWORD = "secret_sauce";
    private WebDriver driver;
    public Testing(){
        System.setProperty("webdriver.ie.driver", "C:/Users/lbartosik/OneDrive - PEPCO/Pulpit/IEDriverServer.exe");
        this.driver = new InternetExplorerDriver();
    }
//    @Bean
//    public void testing(String username, String password){
//        driver.get("https://www.saucedemo.com/");
////        driver.findElement(By.id("login-button")).click();
//
//    }

    @GetMapping("/test")
    public boolean testLogin(String name, String password) {

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys(name);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        return CORRECT_USERNAME.equals(name) && CORRECT_PASSWORD.equals(password);
    }
    public String tesAddProd(){
        driver.findElement(By.id("login-button")).click();
       WebElement button= driver.findElement(By.id("login-button"));
       String buttonText= button.getText();
       return buttonText;

        //If the button is 'Remove" than return true




    }

}
