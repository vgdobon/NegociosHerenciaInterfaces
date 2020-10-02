package com.tecnara.ejercicioClases.tiendas;

import com.tecnara.ejercicioClases.ifaces.IPropagable;

public class Taller extends Negocio implements IPropagable {

    public Taller(String nombre, int facturacion, int empleados) {
        super(nombre, facturacion, empleados);
    }

    @Override
    public String hacerPropaganda() {
        return "Venga a visitar+" + this.getNombre()+", es un estupendo negocio";
    }
}
