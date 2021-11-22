package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public  static final Target BUTTON_COURSE=Target.the("seleccionar curos y certificaciones").located(By.xpath("//div[@id='certificaciones']//strong"));
    public  static final Target INPUT_COURSE=Target.the("buscar curso").located(By.id("coursesearchbox"));
    public  static final Target BUTTON_GO=Target.the("da click para buscar el curso").located(By.xpath("//button[@class='btn btn-secondary']"));
    public  static final Target SELECT_COURSE=Target.the("da click para seleccionar el curso").located(By.partialLinkText("Patrones de "));
    public  static final Target COURSE_NAME=Target.the("extrae el nombre del curso").located(By.className("aalink"));
}
