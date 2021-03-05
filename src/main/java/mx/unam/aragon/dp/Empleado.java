/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.dp;

/**
 *
 * @author Abraham
 */
public class  Empleado extends Persona { 
    private int numero;
    private String departamento;
    private float sueldo;
    private int horasExtra;

    public Empleado() {
    }

    public Empleado(int numero, String departamento, float sueldo, int horasExtra) {
        this.numero = numero;
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.horasExtra = horasExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numero=" + numero + ", departamento=" + departamento + ", sueldo=" + sueldo + ", horasExtra=" + horasExtra + '}';
    }
    
}
