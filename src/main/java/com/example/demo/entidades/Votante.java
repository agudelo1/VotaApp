package com.example.demo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Votante {
	
	@Id
	private int codVotante;
	private int identificacion;
	private String nombres;
	private String apellidos;
	private int sexo;
	private String fechaNac;
	private String fechaExp;
	private int lugarNac;
	private int lugarRec;
	private int telefono;
	private String correo;
	
	public int getCodVotante() {
		return codVotante;
	}
	public void setCodVotante(int codVotante) {
		this.codVotante = codVotante;
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
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
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getFechaExp() {
		return fechaExp;
	}
	public void setFechaExp(String fechaExp) {
		this.fechaExp = fechaExp;
	}
	public int getLugarNac() {
		return lugarNac;
	}
	public void setLugarNac(int lugarNac) {
		this.lugarNac = lugarNac;
	}
	public int getLugarRec() {
		return lugarRec;
	}
	public void setLugarRec(int lugarRec) {
		this.lugarRec = lugarRec;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}


}
