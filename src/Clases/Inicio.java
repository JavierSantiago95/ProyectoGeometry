/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import static Clases.Grafo.pila2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author javie
 */
public class Inicio {

    public static void main(String[] args) {
        // TODO code application logic here

        Grafo g = new Grafo("abcdefghijklmnopqrstuvwxyz");
        g.agregarRuta('a', 'b', 33);
        g.agregarRuta('c', 'b', 60);
        g.agregarRuta('c', 'd', 12);
        g.agregarRuta('d', 'e', 64);
        g.agregarRuta('g', 'e', 17);
        g.agregarRuta('g', 'f', 8);
        g.agregarRuta('g', 'h', 10);
        g.agregarRuta('i', 'j', 12);
        g.agregarRuta('k', 'j', 8);
        g.agregarRuta('l', 'j', 20);
        g.agregarRuta('l', 'm', 8);
        g.agregarRuta('h', 'u', 9);
        g.agregarRuta('t', 'u', 6);
        g.agregarRuta('t', 'v', 5);
        g.agregarRuta('u', 'v', 7);
        g.agregarRuta('p', 's', 11);
        g.agregarRuta('v', 'q', 10);
        g.agregarRuta('t', 's', 10);
        g.agregarRuta('t', 'q', 8);
        g.agregarRuta('r', 's', 8);
        g.agregarRuta('p', 'q', 7);
        g.agregarRuta('x', 'w', 11);
        g.agregarRuta('r', 'w', 20);
        g.agregarRuta('p', 'o', 25);
        g.agregarRuta('n', 'o', 20);
        g.agregarRuta('v', 'y', 6);

//        char inicio = 'a';
//        char fin = 'y';
//        String respuesta = g.encontrarRutaMinimaDijkstra(inicio, fin);
//        System.out.println(respuesta);
//
//        pila2 = g.Lista(inicio, fin);
//
//        while (!pila2.isEmpty()) {
//            System.out.println(pila2.pop().id);
//        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
}
