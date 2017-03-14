package br.com.smallbi.util;

import javax.servlet.ServletContextEvent;

import br.com.smallbi.business.UsuarioBusiness;

public class Servico implements javax.servlet.ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Inicializando Tomcat!!!");
		//UsuarioBusiness business = new UsuarioBusiness();
		//business.criarToken();
		//Consultar tokens no banco
		
		/*Timer timer = new Timer();
	        TimerTask timerTask = new TimerTask() {
	            @Override
	            public void run() {
	                
	                Calendar calendar = Calendar.getInstance();
	                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	                String data = sdf.format(calendar.getTime());
	                
	                System.out.println("Hello World!" + data);
	                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	            }
	        };        
	                                    //1*1000 == cada segundo
	                                    //10*1000 == cada 10 seg
	                                    //1 * 60 * 1000 cada min
	                                    //2 * 60 * 1000 cada 2 min
	        timer.schedule(timerTask, 01, 30 * 60 * 1000); 
	    }*/
	}

}
