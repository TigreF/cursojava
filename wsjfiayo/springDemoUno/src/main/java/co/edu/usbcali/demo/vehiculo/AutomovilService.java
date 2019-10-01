package co.edu.usbcali.demo.vehiculo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutomovilService {
  private final static Logger log = LoggerFactory.getLogger(Automovil.class);
  private static AutomovilService automovilService;
  
  private AutomovilService() {
    
  }
  
  public static AutomovilService createIsntance() {
    
    if(automovilService==null) {
      automovilService=new AutomovilService();
    }
    log.info("Creo automovilService");
    return automovilService;
  }

}
