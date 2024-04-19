package mx.utng.s23.Factory;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileLogger implements Logger {
    
    @Override
    public void log ( String msg){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"));
        writer.write(msg);
        writer.close ();
            
        } catch (Exception e) {
            
                System.out.println("Error de I/O" + e.getMessage());
        }
      

    }
  
    }
    

