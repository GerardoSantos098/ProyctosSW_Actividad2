import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args){

        //Inicio de sesion
        Login login = new Login();
        login.usuarios();

        //Lectura del documento
        Documento documento = new Documento();

        //METODO PARA ALTA DE PRPODUCTOS
        /*documento.altaProducto(1,"Camisa","1","200.00","S","Rosa","Sin observaciones");
        documento.altaProducto(2,"Camisa","1","200.00","S","Azul","Sin observaciones");
        documento.altaProducto(3,"Camisa","1","200.00","S","Rosa","Sin observaciones");
        documento.altaProducto(4,"Camisa","1","200.00","S","Azul","Sin observaciones");*/

        //FORMA DE LEER EL TXT ANTES DE LOS CAMBIOS
        List<String> archivo = new ArrayList<String>();
        archivo = documento.leerArchivo("inventario");
        for(int x=0; x<archivo.size();x++) {
            System.out.println(archivo.get(x));
        }

        //METODO PARA BAJA
        //documento.bajaProducto(1);
        /*documento.bajaProducto(3);*/
        //documento.bajaProducto(4);

        //METODO PARA MODIFICACION
        //documento.modificacionProducto(1, "nombre","Pantalon");


        //FORMA DE LEER EL TXT DESPUES DE LOS CAMBIOS
        System.out.println("----------------------------------------------------------------");
        archivo = documento.leerArchivo("inventario");
        for(int x=0; x<archivo.size();x++){
            System.out.println(archivo.get(x));
        }
    }
}
