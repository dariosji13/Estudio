package presentacion;

import domain.*;
import java.util.*;

public class Juego {

//    private static final int NUMERO_JUGADORES = 4;
//
//    private static float dineroApostado;
//
//    private static int cantidadDeGanadores;
//
//    private static int numeroGanador;
//
//    private static String resultadoJuego;
//
//    private static String caballoWin;
//
//    public static void main(String[] args) {
//
//        Random random = new Random();
//
//        HashMap<String, Caballo> mapaCaballos = new HashMap<>();
//        mapaCaballos.put("Mafusia", new Caballo("Mafusia", 1));
//        mapaCaballos.put("Mira", new Caballo("Mira", 2));
//        mapaCaballos.put("Blanco", new Caballo("Blanco", 3));
//        mapaCaballos.put("trueno", new Caballo("trueno", 4));
//
//        Jugador[] jugadores = new Jugador[NUMERO_JUGADORES];
//
//        jugadores[0] = new Jugador("juan");
//        jugadores[1] = new Jugador("daniel");
//        jugadores[2] = new Jugador("cesar");
//        jugadores[3] = new Jugador("felipe");
//
//        int numeroDeJugadoreSinDinero = 0;
//        int cantidadDeGanadores = 0;
//
//        while (numeroDeJugadoreSinDinero < 4) {
//            ingresarApuestas(jugadores, mapaCaballos, 10000);
//            dineroApostado = getDineroApostado(jugadores);
//            numeroGanador = getRandomNumber();
//            cantidadDeGanadores = cantidadDeGanadores(jugadores, numeroGanador);
//            caballoGanador(numeroGanador, mapaCaballos);
//            actualizarDineroGanadores(jugadores, cantidadDeGanadores, dineroApostado, numeroGanador);
//            numeroDeJugadoreSinDinero = cantidadDeJugadoresSinDinero(jugadores);
//            System.out.println(caballoWin + numeroGanador + resultadoJuego);
//
//        }

    }

//    public static float getDineroApostado(Jugador[] jugadores) {
//        float resultado = 0;
//        for (int i = 0; i < jugadores.length; i++) {
//            resultado += jugadores[i].getDineroApostado();
//        }
//        return resultado;
//    }
//
//    public static int getRandomNumber() {
//        int max = 5;
//        int min = 1;
//        return (int) ((Math.random() * (max - min)) + min);
//    }
//
//    public static void ingresarApuestas(Jugador[] jugadores, HashMap<String, Caballo> mapaCaballos, float cantidadApostada) {
//        for (int i = 0; i < jugadores.length; i++) {
//            if (jugadores[i].isTieneDinero()) {
//                jugadores[i].setCaballo(mapaCaballos.get("Mafusia"));
//                jugadores[i].setDineroApostado(cantidadApostada);
//                jugadores[i].actulizarDineroActual();
//
//            } else {
//                jugadores[i].getCaballo().setIdCaballo(-1);
//            }
//        }
//
//    }
//
//    public static int cantidadDeGanadores(Jugador[] jugadores, int numeroGanador) {
//        int cantidadGanadores = 0;
//        for (Jugador jugador : jugadores) {
//            if (jugador.getCaballo().getIdCaballo() == numeroGanador) {
//                cantidadGanadores++;
//            }
//
//        }
//        return cantidadGanadores;
//    }
//
//    public static void caballoGanador(int numeroGanador, HashMap<String, Caballo> mapaCaballos) {
//        caballoWin = "";
//        for (Map.Entry<String, Caballo> entry : mapaCaballos.entrySet()) {
//            if (entry.getValue().getIdCaballo() == numeroGanador) {
//                caballoWin = entry.getValue().getNombreCaballo();
//            }
//        }
//    }
//
//    public static void actualizarDineroGanadores(Jugador[] jugadores, int cantidadDeGanadores, float dineroApostado, int numeroGanador) {
//        float gananciaApuesta = 0;
//        resultadoJuego = "";
//        if (cantidadDeGanadores > 0) {
//            gananciaApuesta = dineroApostado / cantidadDeGanadores;
//            for (Jugador jugador : jugadores) {
//                if (jugador.getCaballo().getIdCaballo() == numeroGanador) {
//                    jugador.setDineroActual(jugador.getDineroActual() + gananciaApuesta);
//                    resultadoJuego += jugador.getNombre() + "\n";
//                }
//
//            }
//        }
//
//    }
//
//    public static int cantidadDeJugadoresSinDinero(Jugador[] jugadores) {
//        int numeroDeJugadoreSinDinero = 0;
//        for (Jugador jugador : jugadores) {
//            if (jugador.getDineroActual() <= 0) {
//                numeroDeJugadoreSinDinero++;
//                jugador.setTieneDinero(false);
//            }
//        }
//        return numeroDeJugadoreSinDinero;
//    }

//}
