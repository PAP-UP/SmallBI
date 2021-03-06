package br.com.smallbi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ForeignKey;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	private Date dataCadastro;
	
	private Integer usuarioId;
	
	@Column (length=80)
	private String razaoSocial;
	
	@Column (length=80)
	private String nomeFantasia;
	
	@Column (length=25)
	private String cnpj;
	
	@Column (length=25)
	private String ie;
	
	@ManyToOne
	@JoinColumn(name="ramoAtividadeId", referencedColumnName="idRamoAtividade")
	@ForeignKey(name="fk_ramoAtividade")
	private RamoAtividade ramoAtividade;
	
	private float tamanhoTotal;
	
	@ManyToOne
	@JoinColumn(name="formaPagamentoId", referencedColumnName="idFormaPagamento")
	@ForeignKey(name="fk_formaPagamento")
	private FormaPagamento formaPagamento;
	
	@ManyToOne
	@JoinColumn(name="planoId", referencedColumnName="idPlano")
	@ForeignKey(name="fk_plano")
	private Plano plano;
	
	private boolean status;
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public RamoAtividade getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(RamoAtividade ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	public float getTamanhoTotal() {
		return tamanhoTotal;
	}

	public void setTamanhoTotal(float tamanhoTotal) {
		this.tamanhoTotal = tamanhoTotal;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	

	
	
	
}
