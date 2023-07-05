package paquete001;
import paquete002.Ciudad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author reroes
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private Ciudad ciudad;

    public Persona(String nom, String ap, int e, String c, Ciudad ciu) {
        nombre = nom;
        apellido = ap;
        edad = e;
        cedula = c;
        ciudad = ciu;

    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public void establecerpAellido(String n) {
        apellido = n;
    }

    public void establecerpEdad(int n) {
        edad = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerApellido() {
        return apellido;
    }
    public int obtenerEdad() {
        return edad;
    }

}