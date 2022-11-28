package Entidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.Nivel;
import Posicion.Posicion;

public class EntidadGrafica {

 // protected String imagen;
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
	//nivel.actualizarEntidadGrafica(this);
  }
  
  public void setPosicion(int x, int y) {
	  posicion = new Posicion (x,y);
	  label.setBounds(x,y, ancho, alto);
	  label.setLocation(x, y);
	  //nivel.actualizarEntidadGrafica(this);
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
