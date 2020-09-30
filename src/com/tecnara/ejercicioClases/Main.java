package com.tecnara.ejercicioClases;

import com.tecnara.ejercicioClases.tiendas.Panaderia;
import com.tecnara.ejercicioClases.tiendas.Supermercado;
import com.tecnara.ejercicioClases.tiendas.Taller;

// Ejercicio: Tengo 3 tipos de negocio. Panadería, Taller y Supermercado.
// Todos ellos tienen un nombre, una cifra de facturación anual y un número de empleados.
// Todos tienen un método que es abrir() y que muestra por pantalla "He abierto, soy nombre de negocio".
// Además, el supermercado tiene un método que es reponer estantes y que dice "reponer estantes".
// Se pide realizar el diagrama de clases del enunciado e implementar las clases definidas.
// En una clase main aparte, instanciar todas las clases y ejecutar abrir para cada una,
// de manera que veamos su nombre.
// Hay que implementar los constructores de todas las clases y sus getters/setters.
public class Main {

    public static void main(String[] args) {
        Taller taller = new Taller("Talleres Paco",105000,3);
        Panaderia panaderia = new Panaderia("Panaderia delicias del Norte",90000,2);
        Supermercado supermercado = new Supermercado("Merca Zaragoza",450000,25);

        taller.abrir();
        taller.reponerEstantes();

        panaderia.abrir();
        panaderia.reponerEstantes();

        supermercado.abrir();
        supermercado.reponerEstantes();
    }


}
