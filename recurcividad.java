/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawilliamilm;

/**
 *
 * @author HP
 */
public class recurcividad{
        public static int busquedaBinariaConWhile(int[] arreglo, int busqueda){
    int izquierda = 0, derecha = arreglo.length - 1;
 
    while(izquierda <= derecha){
        // Calculamos las mitades...
        int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
        int elementoDelMedio = arreglo[indiceDelElementoDelMedio];
 
        // Ver si está en la mitad y romper aquí el ciclo
        if(elementoDelMedio == busqueda){
            return indiceDelElementoDelMedio;
        }
        // Si no, entonces vemos si está a la izquierda o derecha
 
        if(busqueda < elementoDelMedio){
            derecha = indiceDelElementoDelMedio - 1;
        }else{
            izquierda = indiceDelElementoDelMedio + 1;
        }
    }
    // Si no se rompió el ciclo ni se regresó el índice, entonces el elemento no existe
    return -1;
}
        public static void main(String[] args) {
        int[] arreglo = {5,11, 20, 21, 25, 80, 85, 90, 95, 97, 98, 115, 500, 510, 512, 1024};
 
int busqueda = 500;
// Ahora con la que usa el ciclo while
int indiceDelElementoBuscado = busquedaBinariaConWhile(arreglo, busqueda);
System.out.println("[Con ciclo While] -- El elemento buscado (" + String.valueOf(busqueda) + ") se encuentra en el index " + indiceDelElementoBuscado);
    }
}
