package Class22;

import org.checkerframework.checker.units.qual.C;

public class WebDriverTester {
    public static void main(String[] args) {

        /*ChromeDriver c=new ChromeDriver();
        c.openBrowser();
        c.openBrowser();
        c.findElement();
        c.MaximazeWindow();
        FirefoxDriver f=new FirefoxDriver();
        f.openBrowser();
        f.closeBrowser();
        f.findElement();
        f.MaximazeWindow();*/


WebDriver [] arr={new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver webDr : arr) {
            webDr.openBrowser();
            webDr.closeBrowser();
            webDr.findElement();
            webDr.MaximazeWindow();
            System.out.println("**************");
        }



    }


}
