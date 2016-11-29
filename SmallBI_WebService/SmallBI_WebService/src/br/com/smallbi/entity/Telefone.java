package br.com.smallbi.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.ForeignKey;

@Entity
public class Telefone {
	
	@Id
	@SequenceGenerator(name="seq_telefone", sequenceName="seq_telefone_id", allocationSize=1)
	@GeneratedValue(generator="seq_telefone", strategy=GenerationType.SEQUENCE)
	private Integer idTelefone;
	
	private Calendar dataCadastro;
	
	private Integer usuarioId;
	
	@ManyToOne
	@JoinColumn(name="tipo", referencedColumnName="idTipo")
	@ForeignKey(name="fk_tipo")
	private Tipo tipo;
	
	private String ddd;
	
	private String telefone;
	
	@OneToOne
	@JoinColumn(name="empresa", referencedColumnName="idEmpresa")
	@ForeignKey(name="fk_empresa")
	private Empresa empresa;
	
	@ManyToOne
	@JoinColumn(name="pessoa", referencedColumnName="idPessoa")
	@ForeignKey(name="fk_pessoa")
	private Pessoa pessoa;

	public Integer getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
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

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	
	
}