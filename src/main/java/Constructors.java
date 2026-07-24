import org.openqa.selenium.chrome.ChromeDriver;

public class Constructors extends BaseClass {

    public Constructors(ChromeDriver driver , String name){
        this.driver = driver;
        this.name = name;

        System.out.println(name);


    }

}
