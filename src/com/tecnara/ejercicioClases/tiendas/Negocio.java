package com.tecnara.ejercicioClases.tiendas;

public class Negocio {
    private String nombre;
    private int facturacion;
    private int empleados;


    public Negocio(String nombre, int facturacion, int empleados) {
        this.nombre = nombre;
        this.facturacion = facturacion;
        this.empleados = empleados;
    }

    public void abrir(){
        System.out.println("He abierto, soy " +  this.nombre);
    }

    public void reponerEstantes(){
        System.out.println("Estoy reponiendo el/la " + this.getClass().getSimpleName());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(int facturacion) {
        this.facturacion = facturacion;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }
}
