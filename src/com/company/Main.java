package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

            Pelicula marte = new Pelicula(1l,"Marte", 2015, "Cuando la tripulación del Ares 3...","Acción",7.5,700);
            Pelicula eli = new Pelicula(2l,"El libro de Eli", 2010, "A post-apocalyptic tale...","Thriller",3.5,350);
            Pelicula inception = new Pelicula(3l,"Inception", 2010, "Un ladrón...","Thriller",3.5,400);

            List<Pelicula> peliculaList = new ArrayList<>();

            peliculaList.add(marte);
            peliculaList.add(eli);
            peliculaList.add(inception);

            for (Pelicula pelicula : peliculaList) {

                if (pelicula.getrecaudacion()<2000){
                    System.out.println(pelicula);
                }

            }
        }
}
