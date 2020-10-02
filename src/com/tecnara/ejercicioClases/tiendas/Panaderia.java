package com.tecnara.ejercicioClases.tiendas;

import com.tecnara.ejercicioClases.ifaces.IHorneable;

public class Panaderia extends Negocio implements IHorneable {

    public Panaderia(String nombre, int facturacion, int empleados) {
        super(nombre, facturacion, empleados);
    }

    @Override
    public String hornedPan() {
        return "Estamos horneando pan";
    }
}
