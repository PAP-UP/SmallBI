package br.com.smallbi.business;

import java.util.ArrayList;
import java.util.List;

import br.com.smallbi.business.interfaceBusiness.InterfaceBusiness;
import br.com.smallbi.dal.factory.FactoryDao;
import br.com.smallbi.dal.interfaceDal.InterfaceDao;
import br.com.smallbi.entity.FormaPagamento;
import br.com.smallbi.util.Util;

public class FormaPagamentoBusiness implements InterfaceBusiness<FormaPagamento>{

	InterfaceDao<FormaPagamento> formaPagamentoDao = FactoryDao.createFormaPagamentoDao();
	
	@Override
	public String create(FormaPagamento t){
		
		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdFormaPagamento() != null){
			return "A variavel ID não pode ser informada na criação de um novo objeto!";
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getFormaPagamento().equals(null) || t.getFormaPagamento().equals("")){
//			throw new BusinessException("A variável 'formaPagamento' deve ser informada!");
			return "A variável 'formaPagamento' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		formaPagamentoDao.create(t);
		return "Forma de Pagamento cadastrada com sucesso!";
	}

	@Override
	public List<FormaPagamento> list() {
		List<FormaPagamento> formas = new ArrayList<>();
		for(FormaPagamento f : formaPagamentoDao.list()){
			if(f.isStatus() == true){
				formas.add(f);
			}
		}
		return formas;
	}

	@Override
	public String update(FormaPagamento t){
		
		if(t == null){
//			throw new BusinessException("O objeto não pode ser null!");
			return "O objeto não pode ser null!";
		}
		
		if(t.getIdFormaPagamento() == null){
//			throw new BusinessException("A variável 'idFormaPagamento' deve ser informada!");
			return "A variável 'idFormaPagamento' deve ser informada!";
		}else{
			FormaPagamento formaPagamento = formaPagamentoDao.getObjById(t.getIdFormaPagamento());
			if(formaPagamento == null){
//				throw new BusinessException("Nenhum resultado para a variável 'formaPagamento' foi encontrado!");
				return "Nenhum resultado para a variável 'formaPagamento' foi encontrado!";
			}
		}
		
/*		if(t.getDataCadastro() == null){
			throw new BusinessException("A variável 'dataCadastro' deve ser informada!");
		}*/
		
		if(t.getFormaPagamento().equals(null) || t.getFormaPagamento().equals("")){
//			throw new BusinessException("A variável 'formaPagamento' deve ser informada!");
			return "A variável 'formaPagamento' deve ser informada!";
		}
		
		if(t.getUsuarioId() == null){
//			throw new BusinessException("A variável 'usuarioId' deve ser informada!");
			return "A variável 'usuarioId' deve ser informada!";
		}
		
		t.setDataCadastro(Util.getDate());
		t.setStatus(true);
		
		formaPagamentoDao.update(t);
		return "Forma de Pagamento alterada com sucesso!";
	}

	@Override
	public String delete(Integer id){
		FormaPagamento formaPagamento = getObjById(id);
		if(formaPagamento == null){
			return "Nenhum resultado foi encontrado na tabela FormaPagamento com o id {"+id+"}";
		}
		formaPagamentoDao.delete(formaPagamento);
		return "Forma de Pagamento deletada com sucesso!";
	}

	@Override
	public FormaPagamento getObjById(Integer id){
		FormaPagamento formaPagamento = formaPagamentoDao.getObjById(id);
		if(formaPagamento != null && formaPagamento.isStatus() != false){
			return formaPagamento;
		}
		return null;
	}

}
