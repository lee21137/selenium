package com.crawling;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

/*
 * 크롬 드라이버: https://sites.google.com/chromium.org/driver/
 */
public class IndexController {
    
    private static WebDriver driver = null;
    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static final String WEB_DRIVER_PATH = "E:\\devtool\\chromedriver_win32\\chromedriver.exe";
    public static String base_url = "https://google.com";
    
    
       
    
    public void crawl() throws Exception {
        driver.get(base_url); // url을 가져온다.
        // 이하 크롤링 코드 작성 ...
    }
    
    public static void main(String[] args) throws Exception {
        try {
            System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            
            driver =  (WebDriver) new ChromeDriver(options);
            driver.get(base_url);
       
//            driver = (WebDriver) new ChromeDriver();
        
//            base_url = "https://google.com";
            
            //driver.("//input[@name='q']").click();
            //driver.findElement("//input[@name='q']").send_keys("id");
            
           
            driver.findElement(By.name("q")).sendKeys("asdassa");
            driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
 
        
        
    }
    
    
//    //WebDriver
//    private static WebDriver driver;
//    //Properties
//    //크롤링 할 URL
//    private static String base_url = "https://www.naver.com/";
//    
//    public static void main(String[] args) {
//        System.out.println("ddd");
//        
//        //System Property SetUp
//        System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
//        
//        //Driver SetUp
//        driver = new ChromeDriver();
//        //base_url = "https://www.naver.com";
////        selTest.crawl();
//        
//        //get page (= 브라우저에서 url을 주소창에 넣은 후 request 한 것과 같다)
//        driver.get(base_url);
//        System.out.println(driver.getPageSource());
//        
//    }
    
  
//    public void crawl() {
//        try {

//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            driver.close();
//        }
//    }

}
