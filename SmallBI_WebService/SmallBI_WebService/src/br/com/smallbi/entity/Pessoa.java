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
public class Pessoa {

	@Id
	@SequenceGenerator(name="seq_pessoa", sequenceName="seq_pessoa_id", allocationSize=1)
	@GeneratedValue(generator="seq_pessoa", strategy=GenerationType.SEQUENCE)
	private Integer idPessoa;
	
	@Column(name="dataCadastro", nullable=false)
	private Calendar dataCadastro;
	
	@Column(name="usuarioId", nullable=false)
	private Integer usuarioId;
	
	@Column(name="nome", nullable=false, length=30)
	private String nome;
	
	@Column(name="cpf", nullable=false)
	private String cpf;
	
	@Column(name="rg", nullable=false, length=12)
	private String rg;
	
	@ManyToOne
	@JoinColumn(name="funcao", referencedColumnName="idFuncao", nullable=false)
	@ForeignKey(name="fk_funcao")
	private Funcao funcao;
	
	@ManyToOne
	@JoinColumn(name="endereco", referencedColumnName="idEndereco", nullable=false)
	@ForeignKey(name="fk_endereco")
	private Endereco endereco;

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	

	
	
}
