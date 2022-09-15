import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Documento {

    public void altaProducto(int id, String descripcion, String cantidad, String precio, String talla,
                             String color, String observaciones){
        try {
            String path = "C:\\Files\\inventario.txt";
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(id+","+descripcion+","+cantidad+","+precio+","+talla+","+color+","+observaciones);
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void bajaProducto(int id){
        List<String> archivo = new ArrayList<String>();
        archivo = leerArchivo("inventario");
        archivo.remove(id-1);
        vaciarArchivo();
        for(int x=0; x<archivo.size();x++){
            String[] split = archivo.get(x).split(",");
            altaProducto(x+1, split[1], split[2],split[3],split[4],split[5],split[6]);
        }
    }
    public void modificacionProducto(int id, String campoModificar, String nuevoValor){
        List<String> archivo = new ArrayList<String>();
        archivo = leerArchivo("inventario");
        String[] split = archivo.get(id-1).split(",");
        switch(campoModificar){
            case "nombre":
                split[1] = nuevoValor;
                archivo.remove(id);
                archivo.add(archivo.size()+","+split[1]+","+split[2]+","+split[3]+","+split[4]+","+split[5]+","+split[6]);
                vaciarArchivo();
                for(int x=0; x<archivo.size();x++){
                    split = archivo.get(x).split(",");
                    altaProducto(x+1, split[1], split[2],split[3],split[4],split[5],split[6]);
                }
                break;
            case "cantidad":
                split[2] = nuevoValor;
                archivo.remove(id);
                archivo.add(archivo.size()+","+split[1]+","+split[2]+","+split[3]+","+split[4]+","+split[5]+","+split[6]);
                vaciarArchivo();
                for(int x=0; x<archivo.size();x++){
                    split = archivo.get(x).split(",");
                    altaProducto(x+1, split[1], split[2],split[3],split[4],split[5],split[6]);
                }
                break;
            case "precio":
                split[3] = nuevoValor;
                archivo.remove(id);
                archivo.add(archivo.size()+","+split[1]+","+split[2]+","+split[3]+","+split[4]+","+split[5]+","+split[6]);
                vaciarArchivo();
                for(int x=0; x<archivo.size();x++){
                    split = archivo.get(x).split(",");
                    altaProducto(x+1, split[1], split[2],split[3],split[4],split[5],split[6]);
                }
                break;
            case "talla":
                split[4] = nuevoValor;
                archivo.remove(id);
                archivo.add(archivo.size()+","+split[1]+","+split[2]+","+split[3]+","+split[4]+","+split[5]+","+split[6]);
                vaciarArchivo();
                for(int x=0; x<archivo.size();x++){
                    split = archivo.get(x).split(",");
                    altaProducto(x+1, split[1], split[2],split[3],split[4],split[5],split[6]);
                }
                break;
            case "color":
                split[5] = nuevoValor;
                archivo.remove(id);
                archivo.add(archivo.size()+","+split[1]+","+split[2]+","+split[3]+","+split[4]+","+split[5]+","+split[6]);
                vaciarArchivo();
                for(int x=0; x<archivo.size();x++){
                    split = archivo.get(x).split(",");
                    altaProducto(x+1, split[1], split[2],split[3],split[4],split[5],split[6]);
                }
                break;
            case "observaciones":
                split[6] = nuevoValor;
                archivo.remove(id);
                archivo.add(archivo.size()+","+split[1]+","+split[2]+","+split[3]+","+split[4]+","+split[5]+","+split[6]);
                vaciarArchivo();
                for(int x=0; x<archivo.size();x++){
                    split = archivo.get(x).split(",");
                    altaProducto(x+1, split[1], split[2],split[3],split[4],split[5],split[6]);
                }
                break;
            default:
                System.out.println("Opcion no valida");

        }
    }

    public static List<String> leerArchivo(String nombre){
        String path = "C:\\Files\\inventario.txt";
        File file = new File(path);
        List<String> texto = new ArrayList<String>();
        try{
            if (!file.exists()) {
                file.createNewFile();
            }
            File rec = new File(path);
            FileReader lector = new FileReader(rec);
            BufferedReader buffer = new BufferedReader(lector);
            String temporal = "";
            while((temporal = buffer.readLine()) != null){
                texto.add(temporal);
            }
            return texto;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return texto;
    }

    public void vaciarArchivo(){
        String path = "C:\\Files\\inventario.txt";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter rec = new FileWriter(file);
            BufferedWriter buffer = new BufferedWriter(rec);
            buffer.write("");
            buffer.close();
        }catch (FileNotFoundException ex) {
            Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
