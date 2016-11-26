package br.com.smallbi.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class RamoAtividade {

	@Id
	@SequenceGenerator(name="seq_ramoAtividade", sequenceName="seq_ramoAtividade_id", allocationSize=1)
	@GeneratedValue(generator="seq_ramoAtividade", strategy=GenerationType.SEQUENCE)
	private Integer idRamoAtividade;
	
	@Column(name="dataCadastro", nullable=false)
	private Calendar dataCadastro;
	
	@Column(name="usuarioId", nullable=false)
	private Integer usuarioId;
	
	@Column(name="ramoAtividade", nullable=false, length=10)
	private String ramoAtividade;

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
