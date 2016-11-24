package br.com.smallbi.test;

import java.util.Calendar;

import javax.persistence.RollbackException;

import org.junit.Test;

import br.com.smallbi.business.EstadoBusiness;
import br.com.smallbi.business.exception.BusinessException;
import br.com.smallbi.entity.Estado;

public class TestEstado {

	@Test
	public void testCreateEstado(){
		Estado estado = new Estado();
		estado.setNomeEstado("Paraná");
		estado.setSiglaEstado("PR");
		estado.setUsuarioId(null);
		estado.setDataCadastro(Calendar.getInstance());
		
		try {
			new EstadoBusiness().create(estado);
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (RollbackException ex) {
			ex.printStackTrace();
		}
	}
}
