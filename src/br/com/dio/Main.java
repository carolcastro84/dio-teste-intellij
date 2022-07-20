package br.com.dio;

import br.com.dio.model.Gato;

public class Main {
    public static void main(String[] args) {



        System.out.println("Hello world!");

        Gato gato = new Gato("Hello","world!",12);
        System.out.println(gato.toString());
    }
}