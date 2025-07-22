package controllers;

import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.zip.ZipEntry;

import models.Maquina;

public class MaquinaController {

    public Stack<Maquina> filtrarPorSubred(List<Maquina> maquinas, int umbral) {

        Stack<Maquina> maquinasFiltradas = new Stack<>();

        for (Maquina maquina : maquinas) {
            int subred = maquina.getSubred();

            if (subred > umbral) {
                maquinasFiltradas.push(maquina);
            }
        }

        return maquinasFiltradas;
    }

    public TreeSet<Maquina> ordenarPorSubred(Stack<Maquina> pila) {
    
        TreeSet<Maquina> maquinasOrdenadas = new TreeSet<>();

        while (!pila.isEmpty()) {
            maquinasOrdenadas.add(pila.pop());
        }

        return maquinasOrdenadas;
    }

    
    public TreeSet<Maquina> agruparPorRiesgo (List<Maquina> maquinas) {

        

        return null;
    }
    
    
}
