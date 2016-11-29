package br.com.smallbi.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.ForeignKey;

@Entity
public class Endereco {

	@Id
	@SequenceGenerator(name="seq_endereco", sequenceName="seq_endereco_id", allocationSize=1)
	@GeneratedValue(generator="seq_endereco", strategy=GenerationType.SEQUENCE)
	private Integer idEndereco;
	
	private Calendar dataCadastro;

	private Integer usuarioId;
	
	private String endereco;
	
	private String numero;
	
	private String bairro;
	
	@ManyToOne
	@JoinColumn(name="cidade", referencedColumnName="idCidade")
	@ForeignKey(name="fk_cidade")
	private Cidade cidade;

	@ManyToOne
	@JoinColumn(name="tipo", referencedColumnName="idTipo")
	@ForeignKey(name="fk_tipo")
	private Tipo tipo;

	public Integer getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	

	

	
	
}