package challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Sanchez Muñoz Oscar Roberto
 */
public class Challenge {

    public static void main(String[] args) {

        String WDriver = "webdriver.chrome.driver"; //En caso se desee cambiar el driver por el de otro navegador
        String WebDriver_Direc = "C:\\Users\\Personal\\Documents\\Netbeans\\Challenge\\src\\chromedriver_win32\\chromedriver.exe"; //En caso el driver este en otro directorio

        System.setProperty(WDriver, WebDriver_Direc);

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://apprater.net/add/");//URL de la página Web

        driver.manage().window().maximize();//Maximiza la ventana

        driver.findElement(By.name("user-submitted-name")).sendKeys("Fulano"); //Nombre
        driver.findElement(By.name("user-submitted-email")).sendKeys("Fulano123@gmail.com"); //Correo
        driver.findElement(By.name("user-submitted-title")).sendKeys("Producto Fulano"); //Titulo del Producto
        driver.findElement(By.name("user-submitted-url[]")).sendKeys("https://Fulanitos.pe"); //URL del Producto
        driver.findElement(By.name("user-submitted-content")).sendKeys("Descripcion del Producto"); //Descripcion Producto

    }

}
