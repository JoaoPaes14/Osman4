package Negocio;

import Modelo.Modelo;
import View.View;

public class Negocio {
    private Modelo modelo;
    private View view;

    public void BuscaController(Modelo modelo, View view) {
        this.modelo = modelo;
        this.view = view;
    }

    public void realizarBusca(int[] arr, int elementoParaEncontrar) {
        int resultado = modelo.buscaSequencial(elementoParaEncontrar);
        view.mostrarResultado(resultado);
    }
}