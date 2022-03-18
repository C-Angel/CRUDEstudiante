package com.educacion.web.entidad;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pais")
public class pais implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idpais;
	
	private String nompais;
	public Integer getIdpais() {
		return idpais;
	}
	public void setIdpais(Integer idpais) {
		this.idpais = idpais;
	}
	public String getNompais() {
		return nompais;
	}
	public void setNompais(String nompais) {
		this.nompais = nompais;
	}
	@Override
	public String toString() {
		return "Pais [idpais=" + idpais + ", nompais=" + nompais + "]";
	}
}
