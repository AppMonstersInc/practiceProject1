package PractiseBegin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        System.out.println("change");
        System.out.println("practice stash");
    }
}
