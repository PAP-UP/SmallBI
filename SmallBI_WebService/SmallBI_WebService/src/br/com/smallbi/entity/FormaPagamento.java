package br.com.smallbi.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class FormaPagamento {

	@Id
	@SequenceGenerator(name="seq_formaPagamento", sequenceName="seq_formaPagamento_id", allocationSize=1)
	@GeneratedValue(generator="seq_formaPagamento", strategy=GenerationType.SEQUENCE)
	private Integer idFormaPagamento;
	
	private Calendar dataCadastro;
	
	private Integer usuarioId;
	
	private String formaPagamento;

	public Integer getIdFormaPagamento() {
		return idFormaPagamento;
	}

	public void setIdFormaPagamento(Integer idFormaPagamento) {
		this.idFormaPagamento = idFormaPagamento;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	
	
	
	
}
