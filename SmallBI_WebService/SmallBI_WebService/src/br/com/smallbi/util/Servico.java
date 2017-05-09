package br.com.smallbi.util;

import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import br.com.smallbi.business.UsuarioLogadoBusiness;
import br.com.smallbi.entity.UsuarioLogado;

import javax.servlet.ServletContextEvent;

public class Servico implements javax.servlet.ServletContextListener{

	private UsuarioLogadoBusiness business = new UsuarioLogadoBusiness();
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		//System.out.println("Inicializando Tomcat!!!");
		
		Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
            	
            	Date dataAtual = Data.getDate();
            	//System.out.println("-------------------------------------------------------");
            	//System.out.println("Checando as: " + dataAtual);
            	
                List<UsuarioLogado> uls = business.list();
                for(UsuarioLogado ul : uls){
                	long differenceInMillis = dataAtual.getTime() - ul.getData().getTime();
                	long diffMinutes = differenceInMillis / (60 * 1000) % 60;
                	//System.out.println("Diferença: " + diffMinutes);
                	if(diffMinutes >= 15){
                	//	System.out.println("Passou mais de 15 minuto: " + ul.getData() + 
                	//			" Usuário: " + ul.getIdUsuarioLogado());
                		business.delete(ul.getId());
                	//	System.out.println("Token deletado...");
                	}else{
                	//	System.out.println("Não passou um minuto: " + ul.getData() + " Usuário: " + ul.getIdUsuarioLogado());
                	}
                }
                //System.out.println("-------------------------------------------------------");
            }
        };        
            
        //A cada segundo
        //timer.schedule(timerTask, 01, 1 * 1000);

//        A cada 10 seg
        timer.schedule(timerTask, 01, 5 * 1000);
        
        //A cada 10 seg
        //timer.schedule(timerTask, 01, 10 * 1000);
        
        //A cada 1 min
        //timer.schedule(timerTask, 01, 1 * 60 * 1000);
        
        //A cada 30 min
        //timer.schedule(timerTask, 01, 30 * 60 * 1000); 
    }
}

