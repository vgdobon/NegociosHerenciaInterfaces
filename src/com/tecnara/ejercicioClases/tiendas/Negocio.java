package com.tecnara.ejercicioClases.tiendas;

public abstract class Negocio {

    private String nombre;
    private float facturacion;
    private int empleados;


    public Negocio(String nombre, int facturacion, int empleados) {
        this.setNombre(nombre);
        this.setFacturacion(facturacion);
        this.setEmpleados(empleados);
    }

    public void abrir(){
        System.out.println("He abierto, soy " +  this.nombre);
    }

    public float conseguirRatioNegocio(){
        return this.getEmpleados()/this.getFacturacion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getFacturacion() {
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
