package UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {

    /* BOTONES DE SECCIONES */
    public static final Target SECCION_EMPLOYEES = Target.the("BOTÓN_SECCION_EMPLOYEES")
                                                             .located(By.cssSelector("a:nth-child(2)")
                                                             );

    /* BOTONES PARA LA SECCIÓN EMPLOYEES, DEADS Y EXTRAS */
    public static final Target BOTON_ADD_ITEM = Target.the("BOTÓN_AGREGAR_ITEM")
                                                          .located(By.cssSelector(".green:nth-child(2)")),
                               BOTON_EDIT_ITEM = Target.the("BOTON_EDITAR_ITEM")
                                                          .located(By.cssSelector("tr:nth-child(1) .button:nth-child(1)")),
                               BOTON_DELETE_ITEM = Target.the("BOTÓN_ELIMINAR_ITEM")
                                                          .located(By.cssSelector("tr:nth-child(1) .button:nth-child(2)")),
                               BOTON_SUBMIT = Target.the("BOTÓN_GUARDAR_NUEVO_ITEM")
                                                          .located(By.cssSelector("div.popup.form-popup button.button.green"));

    public static final Target ALERT_SUCCESS = Target.the("ALERT_SUCCESS")
                                                          .located(By.cssSelector("div.Toastify__toast.Toastify__toast--success"));
}
