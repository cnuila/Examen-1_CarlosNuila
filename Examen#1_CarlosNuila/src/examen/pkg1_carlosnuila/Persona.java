/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_carlosnuila;

import java.util.ArrayList;

/**
 *
 * @author Carlos Nuila
 */
public class Persona {
    
    private String usuario;
    private String contraseña;
    private String fechaNacimiento;
    private String correo;
    private String nombreCompleto;
    private int numeroTelefono;
    private String generoLibros;
    private ArrayList<Libro> listaLibros = new ArrayList();
    private ArrayList<Persona> listaAmigos = new ArrayList();

    public Persona(String usuario, String contraseña, String fechaNacimiento, String correo, String nombreCompleto, String generoLibros) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.nombreCompleto = nombreCompleto;
        this.generoLibros = generoLibros;
    }

    public Persona() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getGeneroLibros() {
        return generoLibros;
    }

    public void setGeneroLibros(String generoLibros) {
        this.generoLibros = generoLibros;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Persona> getListaAmigos() {
        return listaAmigos;
    }

    public void setListaAmigos(ArrayList<Persona> listaAmigos) {
        this.listaAmigos = listaAmigos;
    }

    @Override
    public String toString() {
        return nombreCompleto;
    }
    
    
    
}
