package br.com.smallbi.entity;

import java.util.Calendar;

import javax.persistence.Column;
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
public class Empresa {

	@Id
	@SequenceGenerator(name="seq_empresa", sequenceName="seq_empresa_id", allocationSize=1)
	@GeneratedValue(generator="seq_empresa", strategy=GenerationType.SEQUENCE)
	private Integer idEmpresa;
	
	@Column(name="dataCadastro", nullable=false)
	private Calendar dataCadastro;
	
	@Column(name="usuarioId", nullable=false)
	private Integer usuarioId;
	
	@Column(name="razaoSocial", nullable=false, length=30)
	private String razaoSocial;
	
	@Column(name="nomeFantasia", nullable=false, length=30)
	private String nomeFantasia;
	
	@Column(name="cnpj", nullable=false)
	private String cnpj;
	
	@Column(name="ie", nullable=false, length=30)
	private String ie;
	
	@OneToOne
	@JoinColumn(name="endereco", referencedColumnName="idEndereco", nullable=false)
	@ForeignKey(name="fk_endereco")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name="ramoAtividade", referencedColumnName="idRamoAtividade", nullable=false)
	@ForeignKey(name="fk_ramoAtividade")
	private RamoAtividade ramoAtividade;
	
	@Column(name="tamanhoTotal", nullable=false)
	private int tamanhoTotal;
	
	@ManyToOne
	@JoinColumn(name="formaPagamento", referencedColumnName="idFormaPagamento", nullable=false)
	@ForeignKey(name="fk_formaPagamento")
	private FormaPagamento formaPagamento;
	
	@ManyToOne
	@JoinColumn(name="plano", referencedColumnName="idPlano", nullable=false)
	@ForeignKey(name="fk_plano")
	private Plano plano;

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public RamoAtividade getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(RamoAtividade ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	public int getTamanhoTotal() {
		return tamanhoTotal;
	}

	public void setTamanhoTotal(int tamanhoTotal) {
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
