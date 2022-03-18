package com.educacion.web.entidad;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="estudiante")
public class Estudiante {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer idestudiante;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String email;
	
	// NOtacion que permite definir una relacion de muchos a uno
	// Nombre del atributo que define la relacion
	@ManyToOne
	@JoinColumn(name = "idpais")
	private pais pais;

	public Integer getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(Integer idestudiante) {
		this.idestudiante = idestudiante;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public pais getPais() {
		return pais;
	}

	public void setPais(pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Estudiante [idestudiante=" + idestudiante + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", telefono=" + telefono + ", email=" + email + ", pais=" + pais + "]";
	}
	
	
	
}
