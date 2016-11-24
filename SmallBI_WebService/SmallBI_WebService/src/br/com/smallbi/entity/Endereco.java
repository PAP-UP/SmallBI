package br.com.smallbi.entity;

import java.util.Calendar;

import javax.persistence.Column;
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
	
	@Column(name="dataCadastro", nullable=false)
	private Calendar dataCadastro;

	@Column(name="usuarioId", nullable=false)
	private Integer usuarioId;
	
	@Column(name="endereco", nullable=false, length=30)
	private String endereco;
	
	@Column(name="numero", nullable=false, length=10)
	private String numero;
	
	@Column(name="bairro", nullable=false, length=30)
	private String bairro;
	
	@ManyToOne
	@JoinColumn(name="cidade", referencedColumnName="idCidade", nullable=false)
	@ForeignKey(name="fk_cidade")
	private Cidade cidade;

	@ManyToOne
	@JoinColumn(name="tipo", referencedColumnName="idTipo", nullable=false)
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
