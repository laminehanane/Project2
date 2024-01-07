package Class22;

import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;
import org.openqa.selenium.json.JsonOutput;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void MaximazeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("open .......");
    }

    @Override
    public void closeBrowser() {
        System.out.println(" close......");
    }

    @Override
    public void MaximazeWindow() {
        System.out.println("max........");
    }

    @Override
    public void findElement() {
        System.out.println("find.........");
    }
}
class FirefoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("open fire.....");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close fire ....");
    }

    @Override
    public void MaximazeWindow() {
        System.out.println("find fire......");
    }

    @Override
    public void findElement() {

    }
}