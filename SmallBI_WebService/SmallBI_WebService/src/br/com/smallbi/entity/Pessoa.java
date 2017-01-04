package br.com.smallbi.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ForeignKey;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPessoa;
	
	private Calendar dataCadastro;
	
	private Integer usuarioId;
	
	@Column (length=60)
	private String nome;
	
	@Column (length=20)
	private String cpf;
	
	@Column (length=20)
	private String rg;
	
	@ManyToOne
	@JoinColumn(name="funcaoId", referencedColumnName="idFuncao")
	@ForeignKey(name="fk_funcao")
	private Funcao funcao;
	
	@ManyToOne
	@JoinColumn(name="clienteId", referencedColumnName="idCliente")
	@ForeignKey(name="fk_cliente")
	private Cliente cliente;
	
//	Retirado o endereço da pessoa, pois estava invertido, uma pessoa tem vários endereços, um endereço tem uma pessoa.
//	@ManyToOne
//	@JoinColumn(name="enderecoId", referencedColumnName="idEndereco")
//	@ForeignKey(name="fk_endereco")
//	private Endereco endereco;
	
	private boolean status;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

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

//	public Endereco getEndereco() {
//		return endereco;
//	}
//
//	public void setEndereco(Endereco endereco) {
//		this.endereco = endereco;
//	}

	

	
	
}
