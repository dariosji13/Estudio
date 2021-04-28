package presentacio;

import domain.*;
import java.util.*;

public class PruebaJuego {

    static MenuJuego menuJuego = new MenuJuego();

    public static void main(String[] args) {

        int numeroJugadores = 0;
        double largoPista = 0;

//        menuJuego.leerNumeroEntero();
        menuJuego.menuDeBienvenidadYOpciones();
        if (menuJuego.leerNumeroEntero() == 1) {
            menuJuego.menuNumeroDeJugadores();
            numeroJugadores = menuJuego.leerNumeroEntero();
            menuJuego.menuLargoPista();
            largoPista = menuJuego.leerNumeroDouble();

            Escuderia[] listaEscuderia = new Escuderia[numeroJugadores];

            for (int i = 0; i < numeroJugadores; i++) {
                Carril carril = new Carril();
                carril.setLargoPistaKilometros(largoPista);
                carril.setIdCarril(i);
                carril.setIdPista(i);

                Conductor conductor = new Conductor();
                menuJuego.mensajeNombreJugador();
                conductor.setNombreJugador(menuJuego.leerString());
                conductor.setIdConductor(i);
                conductor.setIdJugador(i);

                Carro carro = new Carro();
                menuJuego.mansajeColorCarro();
                carro.setColor(menuJuego.leerString());
                carro.setIdCarro(i);

                listaEscuderia[i] = new Escuderia(conductor, carril, carro);

            }
           

            int cantidadDeJugadoresQueTerminaron = 1;

            Podio podio = new Podio();

            while (cantidadDeJugadoresQueTerminaron <= 3) {

                for (int i = 0; i < listaEscuderia.length; i++) {
                    if (listaEscuderia[i].isFinalizo() != true) {
                        menuJuego.mesajeTurnoJugador(listaEscuderia[i].getConductor().getNombreJugador());
                        menuJuego.mensajeValorDados();
                        listaEscuderia[i].getCarril().setDistanciaAvanada(listaEscuderia[i].getCarril().avanceEnMetros(menuJuego.leerNumeroEntero()));
                        System.out.println("El avance de " + listaEscuderia[i].getConductor().getNombreJugador() + " fue de: " + listaEscuderia[i].getCarril().getDistanciaAvanada());
                        listaEscuderia[i].getCarril().setDistanciaFaltante(listaEscuderia[1].getCarril().convetirKilometrosEnMetros(largoPista) - listaEscuderia[i].getCarril().getDistanciaAvanada());
                        System.out.println("A " + listaEscuderia[i].getConductor().getNombreJugador() + " le falta " + listaEscuderia[i].getCarril().getDistanciaFaltante() + " m para terminar la pista ");
                        if (listaEscuderia[i].getCarril().getDistanciaAvanada() >= listaEscuderia[1].getCarril().convetirKilometrosEnMetros(largoPista)) {
                            if (cantidadDeJugadoresQueTerminaron == 1) {
                                cantidadDeJugadoresQueTerminaron++;
                                podio.setPrimero(listaEscuderia[i].getConductor().getNombreJugador());
                                listaEscuderia[i].setFinalizo(true);
                            } else if (cantidadDeJugadoresQueTerminaron == 2) {
                                podio.setSegungo(listaEscuderia[i].getConductor().getNombreJugador());
                                cantidadDeJugadoresQueTerminaron++;
                                listaEscuderia[i].setFinalizo(true);
                            } else if (cantidadDeJugadoresQueTerminaron == 3) {
                                podio.setTercero(listaEscuderia[i].getConductor().getNombreJugador());
                                cantidadDeJugadoresQueTerminaron++;
                                listaEscuderia[i].setFinalizo(true);
                            }
                        }
                    }

                }

            }
            System.out.println("Primer lugar: " + podio.getPrimero());
            System.out.println("Segundo lugar: " +podio.getSegungo());
            System.out.println("Tercer lugar: " + podio.getTercero());

        }

    }

}
