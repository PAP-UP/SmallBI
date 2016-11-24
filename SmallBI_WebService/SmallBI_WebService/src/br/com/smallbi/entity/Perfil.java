package br.com.smallbi.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Perfil {

	@Id
	@SequenceGenerator(name="seq_perfil", sequenceName="seq_perfil_id", allocationSize=1)
	@GeneratedValue(generator="seq_perfil", strategy=GenerationType.SEQUENCE)
	private Integer idPerfil;
	
	@Column(name="dataCadastro", nullable=false)
	private Calendar dataCadastro;
	
	@Column(name="usuarioId", nullable=false)
	private Integer usuarioId;
	
	@Column(name="nomePerfil", nullable=false, length=10)
	private String nomePerfil;

	public Integer getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
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

	public String getNomePerfil() {
		return nomePerfil;
	}

	public void setNomePerfil(String nomePerfil) {
		this.nomePerfil = nomePerfil;
	}

	
}
