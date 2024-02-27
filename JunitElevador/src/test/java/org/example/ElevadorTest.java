package org.example;

import static org.junit.Assert.*;

public class ElevadorTest {

    Elevador elevador;

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.Test
    public void entrarNoElevador() {
        Elevador elevador = new Elevador();
        elevador.setCargaAtual(100);
        double result = elevador.entrarNoElevador(100);
        assertEquals(result, 200, 0);
    }

    @org.junit.Test
    public void sairDoElevador() {
        Elevador elevador = new Elevador();
        elevador.setCargaAtual(150);
        elevador.sairDoElevador(50);
        assertEquals(elevador.getCargaAtual(), 100, 0);
    }

    @org.junit.Test
    public void avaliarPeso() {
        Elevador elevador = new Elevador();
        elevador.setCargaMaxima(200);
        elevador.setCargaAtual(150);
        boolean result = elevador.avaliarPeso(elevador.getCargaAtual());
        assertEquals(false, result);

    }
}