package com.meliW3.oo.lesson1;

public class MainArray {

    public static void main(String[] args) {

        Roupa[] roupas;
        roupas = new Roupa[5];

//        Vamos realizar um laco para não precisarmos instanciar em cada posicao o o objeto.

        for (int i = 0; i < 5; i++) {
            roupas[i] = new Roupa();
        }

        //roupas[0] = new Roupa();
        roupas[0].colecao = "Outono/inverno";
        roupas[0].cor = "Preta";
        roupas[0].modelo = "Slim";
        roupas[0].tamanho = "P";
        roupas[0].descricao = "casaco";

//        roupas[1] = new Roupa();
        roupas[1].colecao = "primavera/verao";
        roupas[1].cor = "branca";
        roupas[1].modelo = "despojada";
        roupas[1].tamanho = "P";
        roupas[1].descricao = "camiseta";

//        roupas[2] = new Roupa();
        roupas[2].colecao = "Outono/inverno";
        roupas[2].cor = "Preta";
        roupas[2].modelo = "Slim";
        roupas[2].tamanho = "P";
        roupas[2].descricao = "casaco";

//        roupas[3] = new Roupa();
        roupas[3].colecao = "Verao";
        roupas[3].cor = "jeans";
        roupas[3].modelo = "curta";
        roupas[3].tamanho = "P";
        roupas[3].descricao = "bermuda";

//        roupas[4] = new Roupa();
        roupas[4].colecao = "Outono/inverno";
        roupas[4].cor = "laranja";
        roupas[4].modelo = "larga";
        roupas[4].tamanho = "g";
        roupas[4].descricao = "calca";

//      Para cada posição do indice da Array devemos instanciar a posição referente ao indice.

        System.out.println(roupas[0].descricao);
        System.out.println(roupas[1].descricao);
        System.out.println(roupas[2].descricao);
        System.out.println(roupas[3].descricao);
        System.out.println(roupas[4].descricao);

    }



}
