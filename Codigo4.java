package mx.Generation;

import java.util.Scanner;

public class Codigo4 {
	public static void main(String[] args) { //colocar todo dentro de main
		Scanner s = new Scanner(System.in); //scanner con System.in
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");//Cambiar num jugador
	    Scanner s2 = new Scanner(System.in); //Scanner con System.in
	    String j2 = s2.nextLine(); //cambiar s por s2
	    
	    if (j1 == j2) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) { //colocar un equals por el =
	            g = 1;
	          }
	          break;
	        case "papel":
	          if (j2.equals("piedra")) { //colocar un equals por el =
	            g = 1;
	          }
	          break;
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	    //cerrar los scanner 
	    s.close(); //
	    s2.close();
	}
}
