
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class HTML {
    public void prueba() throws IOException{
        javax.swing.JFileChooser jf1 = new javax.swing.JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo HTML", "html");
        jf1.setFileFilter(filtro);
        String ruta = "";
        
       try{
           if(jf1.showSaveDialog(null) == jf1.APPROVE_OPTION){
               ruta = jf1.getSelectedFile().getAbsolutePath() + ".html";
               FileOutputStream listado;
           }
           
       }catch(Exception e){
           e.printStackTrace();
       }
       try{
           FileWriter archivo = new FileWriter(ruta);
       PrintWriter escritura = new PrintWriter(archivo);
       escritura.println("<html>");
       escritura.println("<head>" + "<title>PruebaHTML1</title></head>");
       escritura.print("<body>");
       escritura.print("<p>HOLAAAAAAAAAAA</p>");
       escritura.print("</body>");
       escritura.print("</html>");
       archivo.close();  
       }catch(Exception ex){
           ex.printStackTrace();
       }
       Desktop abrir;
       File file = new File(ruta);
       if(Desktop.isDesktopSupported()){
           abrir = Desktop.getDesktop();
           try{
               abrir.open(file);
               
           }catch(IOException exx){
               exx.getStackTrace();
           }
       }else{
           JOptionPane.showMessageDialog(null, "No se pudo abrir el archivo");
       }
     
    }
}
