package br.com.smallbi.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RamoAtividade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRamoAtividade;
	
	private Calendar dataCadastro;
	
	private Integer usuarioId;
	
	@Column(name = "descricao",length=30)
	private String ramoAtividade;
	
	private boolean status;
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Integer getIdRamoAtividade() {
		return idRamoAtividade;
	}

	public void setIdRamoAtividade(Integer idRamoAtividade) {
		this.idRamoAtividade = idRamoAtividade;
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

	public String getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	
	
	
}
