package Plano;

/***
 * 
 * @author matt9
 *
 */

public class Punto {

		private float x =(float)0;
		private float y =(float)0;
		
		
		// Constructores
		public Punto() {
			
		}

		public Punto(float x, float y) {
			this.x = x;
			this.y = y;
		}
		
		
		// Metodos
		public float distanciaAlOrigen(){
			float distancia = 0;
			distancia = (float)(Math.sqrt(x * x + y * y));
			return distancia;
		}
		
		public float distanciaAOtroPunto(Punto p) {
			float distancia = 0;
			distancia = (float)(Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(),2)));
			return distancia;
		}

		
		// Metodo de comparacion de puntos
		public boolean equals(Punto p) {
			return x == p.getX() && y == p.getY();
		}
		
		
		@Override
		// Metodo toString
		public String toString() {
			return "(" + x + ", " + y + ")";
		}
			
		
		// Getters y Setters
		public float getX() {
			return x;
		}

		public float getY() {
			return y;
		}
	}

