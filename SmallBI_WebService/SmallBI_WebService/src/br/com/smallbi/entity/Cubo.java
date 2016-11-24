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
public class Cubo {

	@Id
	@SequenceGenerator(name="seq_cubo", sequenceName="seq_cubo_id", allocationSize=1)
	@GeneratedValue(generator="seq_cubo", strategy=GenerationType.SEQUENCE)
	private Integer idCubo;
	
	@Column(name="dataCadastro", nullable=false)
	private Calendar dataCadastro;
	
	@Column(name="usuarioId", nullable=false)
	private Integer usuarioId;
	
	@Column(name="nomeCubo", nullable=false, length=30)
	private String nomeCubo;
	
	@ManyToOne
	@JoinColumn(name="empresa", referencedColumnName="idEmpresa", nullable=false)
	@ForeignKey(name="fk_empresa")
	private Empresa empresa;
	
	@Column(name="mdx", nullable=false)
	private String mdx;
	
	@Column(name="tabelaFato", nullable=false)
	private String tabelaFato;
	
	@Column(name="tamanho", nullable=false)
	private int tamanho;

	public Integer getIdCubo() {
		return idCubo;
	}

	public void setIdCubo(Integer idCubo) {
		this.idCubo = idCubo;
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

	public String getNomeCubo() {
		return nomeCubo;
	}

	public void setNomeCubo(String nomeCubo) {
		this.nomeCubo = nomeCubo;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getMdx() {
		return mdx;
	}

	public void setMdx(String mdx) {
		this.mdx = mdx;
	}

	public String getTabelaFato() {
		return tabelaFato;
	}

	public void setTabelaFato(String tabelaFato) {
		this.tabelaFato = tabelaFato;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	
	
	
}
