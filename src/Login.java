import java.util.Scanner;
/**
 *
 * @author Alberto Fernandez
 */
public class Login {

    public void usuarios(){
        // TODO code application logic here

        String Usuario1 = "administrador";
        String Usuario2 = "lector";
        String Usuario3 = "almacenista";

        String Contra = "12345";

        System.out.println("Bienvenido a la Tienda");

        System.out.println("Ingrese Nombre de Usuario: ");
        Scanner scanner1 = new Scanner(System.in);
        String usuario = scanner1.nextLine();

        System.out.println("Ingrese Clave de Acceso: ");
        Scanner scanner2 = new Scanner(System.in);
        String clave = scanner2.nextLine();

        switch(usuario){
            case "administrador":
                System.out.println("Privilegio de Administrador");
                break;
            case "lector":
                System.out.println("Privilegio de Lector");
                break;
            case "almacenista":
                System.out.println("Privilegio de Administrador");
                break;

            default:
                System.out.println("El usuario es Incorrecto");
                break;
        }
    }
}
