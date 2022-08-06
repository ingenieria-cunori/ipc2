/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cunori.models;

/**
 *
 * @author hendrick
 */
public class ColeccionMap {
    /**
     * La interfaz Map asocia claves a valores. Esta interfaz no puede contener
     * claves duplicadas y; cada una de dichas claves, sólo puede tener asociado
     * un valor como máximo
     */

    /**
     * HashMap: este implementación almacena las claves en una tabla hash. Es la
     * implementación con mejor rendimiento de todas pero no garantiza ningún
     * orden a la hora de realizar iteraciones. Esta implementación proporciona
     * tiempos constantes en las operaciones básicas siempre y cuando la función
     * hash disperse de forma correcta los elementos dentro de la tabla hash. Es
     * importante definir el tamaño inicial de la tabla ya que este tamaño
     * marcará el rendimiento de esta implementación.
     */
    /**
     * TreeMap: esta implementación almacena las claves ordenándolas en función
     * de sus valores. Es bastante más lento que HashMap. Las claves almacenadas
     * deben implementar la interfaz Comparable. Esta implementación garantiza,
     * siempre, un rendimiento de log(N) en las operaciones básicas, debido a la
     * estructura de árbol empleada para almacenar los elementos
     */
    /**
     * LinkedHashMap: esta implementación almacena las claves en función del
     * orden de inserción. Es, simplemente, un poco más costosa que HashMap.
     */
}
