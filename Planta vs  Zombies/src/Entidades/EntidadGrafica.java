package Entidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.Nivel;
import Posicion.Posicion;

/**
 * Esta clase describe el comportamiento de las entidades dentro de la entidad grafica
 * 
 *
 */
public class EntidadGrafica {

  protected int alto;
  protected int ancho;
  protected JLabel label;
  protected Posicion posicion;
  
  Nivel nivel = Nivel.getNivel();
  
  public EntidadGrafica(int ancho, int alto) {
    this.alto = alto;
    this.ancho = ancho;
    label = new JLabel();
  }

  public void setImagen(String imagen) {
    label.setIcon(new ImageIcon(this.getClass().getResource(imagen)));
  }
  
  public void setPosicion(int x, int y) {
	  posicion = new Posicion (x,y);
	  label.setBounds(x,y, ancho, alto);
	  label.setLocation(x, y);
  }
  
  public int getAncho() {
	    return ancho;
  }

  public int getAlto() {
    return alto;
  }

  public JLabel getLabel() {
    return label;
  }

  public Posicion getPosicion () {return posicion;}

  
}
