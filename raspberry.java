import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;
import java.io.*;
import java.net.*;
 
public class i2c {
    
     public static void main(String[] args) throws Exception {
         final I2CBus bus = I2CFactory.getInstance(I2CBus.BUS_1);
         
         String miURL = "http://1-dot-mioproyectoprueba.appspot.com/projectofinal?temperatura=";
       
         
         
         
           
            I2CDevice arduino = bus.getDevice(0x04); 

        // get I2C bus instance
        while(true){
            
                int leido;
                
                leido=arduino.read();
                String dato = String.valueOf(leido);
          
                
                try{
               URL  url = new URL(miURL.concat(dato));
               BufferedReader res= new BufferedReader(new InputStreamReader(url.openStream()));
               String line;
               while((line = res.readLine()) != null)
                System.out.println("Response: "+line);
            }catch(Exception ex){
                System.out.println(ex);
            }
             
                   
   
                
               
                
                
                System.out.println("Recibido: "+leido);
                
                try{
                    Thread.sleep(5005);
                }catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }
                    
    
            }
    
        }
}