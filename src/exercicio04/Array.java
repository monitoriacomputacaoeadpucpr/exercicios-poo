package exercicio04;

import java.util.ArrayList;
import java.util.Collections;

public class Array {

    private String elemento;

    public static void main(String[] args) {

        // 1
        int[] dias = {1, 5, 12, 7, 3};
        System.out.println("1) Terceiro elemento do array dias: " + dias[2]);

        // 2
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio"};
        System.out.println("2) Primeiro elemento do array meses: " + meses[0]);

        // 3
        String[] cidades = new String[5];
        cidades[0] = "Curitiba";
        cidades[1] = "Londrina";
        cidades[2] = "Ponta Grossa";
        cidades[3] = "São Paulo";
        cidades[4] = "Rio de Janeiro";
        int tamanhoCidades = cidades.length;
        String ultimoElementoDeCidades = cidades[cidades.length - 1];
        System.out.println("3) Tamanho do array cidades: " + tamanhoCidades);
        System.out.println("3) Último elemento do array cidades: " + ultimoElementoDeCidades);

        // 4
        ArrayList<String> estados = new ArrayList<>();
        estados.add("RS");
        estados.add("SC");
        estados.add("PR");
        estados.remove(0);
        System.out.println("4) Array estados: " + estados);

        // 5
        ArrayList<String> paises = new ArrayList<>();
        paises.add("BR");
        paises.add("US");
        int tamanhoPaises = paises.size();
        System.out.println("5) Tamanho do array paises: " + tamanhoPaises);

        // 6
        ArrayList<String> continentes = new ArrayList<>();
        continentes.add("América");
        continentes.add("Ásia");
        continentes.add("Oceania");
        continentes.add("Europa");
        for (int i = 0; i <= continentes.size() - 1; i++) {
            System.out.println("6) Item " + i + " do array continentes: " + continentes.get(i));
        }

        // 7
        ArrayList<String> regioes = new ArrayList<>();
        regioes.add("norte");
        regioes.add("sul");
        regioes.add("nordeste");
        Collections.sort(regioes);
        System.out.println("7) Array regioes ordenado: " + regioes);

        // 8
        ArrayList<Array> elementos = new ArrayList<>();

        Array objeto1 = new Array();
        objeto1.elemento = "teste1";
        elementos.add(objeto1);

        Array objeto2 = new Array();
        objeto2.elemento = "teste2";
        elementos.add(objeto2);

        Array objeto3 = new Array();
        objeto3.elemento = "teste3";
        elementos.add(objeto3);
        for (int i = 0; i <= elementos.size() - 1; i++) {
            System.out.println("8) Propriedade elemento do objeto" + (i + 1) + " do array elementos: " + elementos.get(i).elemento);
        }
    }

}
