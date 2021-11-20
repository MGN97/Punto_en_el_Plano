package Plano;

/***
 * 
 * @author matt9
 *
 */

public class MiPunto {

	public static void main(String[] args) {
		
		Punto punto1 = new Punto(12, 9);
		Punto punto2 = new Punto(13, 10);
		System.out.println("Distancia al origen del punto 1: " + punto1.distanciaAlOrigen());
		System.out.println("Distancia al origen del punto 2: " + punto2.distanciaAlOrigen());
		System.out.println("La distancia entre ambos puntos es de: " + punto1.distanciaAOtroPunto(punto2));
		System.out.println("Los puntos son iguales: " + punto1.equals(punto2));
		System.out.println("Punto1: " + punto1); // imprime lo retornado por toString()

	}

}
