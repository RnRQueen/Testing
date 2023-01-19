import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();;
        driver.get("https://passport.yandex.ru/auth?retpath=https%3A%2F%2Fsso.passport.yandex.ru%2Fpush%3Fretpath%3Dhttps%253A%252F%252Fya.ru%252F%253Fnr%253D1%2526redirect_ts%253D1674156529.47085%26uuid%3D42bb7a9a-b95a-4e3e-b8e9-bb739502da10&msid=1674156529896408-10609279518747126964-vla1-4611-vla-l7-balancer-8080-BAL-7675&origin=home_yaru_desktop_new");
        driver.findElement(By.id("passp-field-login")).sendKeys("test1");
        driver.findElement(By.id("passp:sign-in")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("passp-field-passwd")).sendKeys("password");
        Thread.sleep(2000);
        driver.findElement(By.id("passp:sign-in")).click();
        Thread.sleep(2000);
        boolean result;
        result = driver.findElement(By.id("field:input-passwd:hint")).isDisplayed();
        driver.close();
        System.out.println(result);



    }
}