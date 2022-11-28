package Conversor;

public class Conversor {

  //las dimensiones de cada cuadrado del jardin es 63 x 63
  protected static final int ladoCuadrado = 63;
  private static Conversor conversor = new Conversor();

  public static Conversor getConversor() {
    return conversor;
  }

  public int convertirPantalla(int numero) {
    return numero * ladoCuadrado;
  }

  public int convertirFila(int num) {
    return (int) (Math.floor(num / ladoCuadrado));
  }
  
  /*
   * Convierte el numero recibido por parametro en una coordenada valida para mostrar en pantalla, 
   * de acuerdo a la fila o columna a la que corresponde
   */
  public int convertirXY(int num) {
	  int posicion = 0;
	    if (num >= ladoCuadrado && num < (ladoCuadrado*2)) {
	      posicion = ladoCuadrado;
	    }
	    if (num >= (ladoCuadrado*2) && num < (ladoCuadrado*3)) {
	      posicion = (ladoCuadrado*2);
	    }
	    if (num >= (ladoCuadrado*3) && num < (ladoCuadrado*4)) {
	      posicion = (ladoCuadrado*3);
	    }
	    if (num >= (ladoCuadrado*4) && num < (ladoCuadrado*5)) {
	      posicion = (ladoCuadrado*4);
	    }
	    if (num >= (ladoCuadrado*5) && num < (ladoCuadrado*6)) {
	      posicion = (ladoCuadrado*5);
	    }
	    if (num >= (ladoCuadrado*6) && num < (ladoCuadrado*7)) {
		      posicion = (ladoCuadrado*6);
		}
	    if (num >= (ladoCuadrado*7) && num < (ladoCuadrado*8)) {
		      posicion = (ladoCuadrado*7);
		}
	    if (num >= (ladoCuadrado*8)) {
		      posicion = (ladoCuadrado*8);
		}
	    
	    return posicion;
  }
  /*
  public int convertirY(int y) {
	    int posicion = 63;
	    if (y > 63 && y < 126) {
	      posicion = 63;
	    }
	    if (y > 126 && y < 189) {
	      posicion = 126;
	    }
	    if (y > 189 && y < 252) {
	      posicion = 189;
	    }
	    if (y > 252 && y < 315) {
	      posicion = 252;
	    }
	    if (y > 315 && y < 378) {
	      posicion = 315;
	    }
	    return posicion;
  }*/
}
