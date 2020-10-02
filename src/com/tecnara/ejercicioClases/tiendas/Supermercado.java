package com.tecnara.ejercicioClases.tiendas;

import com.tecnara.ejercicioClases.ifaces.IHorneable;
import com.tecnara.ejercicioClases.ifaces.IPropagable;

public class Supermercado extends Negocio implements IHorneable , IPropagable {

    public Supermercado(String nombre, int facturacion, int empleados) {
        super(nombre, facturacion, empleados);
    }

    public void reponerEstantes(){
        System.out.println("Estoy reponiendo el/la " + this.getClass().getSimpleName());
    }

    @Override
    public String hornedPan() {
        return "Estamos horneando pan";
    }

    @Override
    public String hacerPropaganda() {
        return "Venga a visitar "+ this.getNombre()+", es un estupendo negocio";
    }
}
