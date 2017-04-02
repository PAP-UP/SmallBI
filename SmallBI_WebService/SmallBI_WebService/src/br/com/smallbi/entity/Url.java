package br.com.smallbi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ForeignKey;

@Entity
public class Url {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUrl;
	
	@Column(length = 50)
	private String url;
	
	@ManyToOne
	@JoinColumn(name="perfilId", referencedColumnName="idPerfil")
	@ForeignKey(name="fk_perfil")	
	private Perfil perfilId;
	
	public Url(){
	}

	public Integer getIdUrl() {
		return idUrl;
	}

	public void setIdUrl(Integer idUrl) {
		this.idUrl = idUrl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getPerfilId() {
		return perfilId;
	}

	public void setPerfilId(Integer perfilId) {
		this.perfilId = perfilId;
	}
}
