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
public class Usuario {

	@Id
	@SequenceGenerator(name="seq_usuario", sequenceName="seq_usuario_id", allocationSize=1)
	@GeneratedValue(generator="seq_usuario", strategy=GenerationType.SEQUENCE)
	private Integer idUsuario;
	
	private Calendar dataCadastro;
	
	private Integer usuarioId;
	
	private String login;
	
	private String senha;
	
	@ManyToOne
	@JoinColumn(name="perfil", referencedColumnName="idPerfil")
	@ForeignKey(name="fk_perfil")
	private Perfil perfil;
	
	@OneToOne
	@JoinColumn(name="pessoa", referencedColumnName="idPessoa")
	@ForeignKey(name="fk_pessoa")
	private Pessoa pessoa;
	
	@ManyToOne
	@JoinColumn(name="empresa", referencedColumnName="idEmpresa")
	@ForeignKey(name="fk_empresa")
	private Empresa empresa;
	
	private String usuarioSaiku;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getUsuarioSaiku() {
		return usuarioSaiku;
	}

	public void setUsuarioSaiku(String usuarioSaiku) {
		this.usuarioSaiku = usuarioSaiku;
	}

	
	
	
}