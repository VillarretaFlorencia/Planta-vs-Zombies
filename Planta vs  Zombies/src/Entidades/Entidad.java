package Entidades;

import java.awt.Rectangle;

import Posicion.Posicion;

public abstract class Entidad {

  protected int danio;
  protected int ancho;
  protected int alto;
  protected Posicion posicion;
  protected String imagen;
  protected EntidadGrafica entidadGrafica;

  public void setPosicion(Posicion p) {
    posicion = p;
  }
  
  public int getDanio() {
    return danio;
  }
  
  public Posicion getPosicion() {
    return posicion;
  }
  
  public String getImagen() {
    return imagen;
  }
  
  public EntidadGrafica getEntidadGrafica() {
    return entidadGrafica;
  }
  
  public void inicializarEntidadGrafica(String imagen, Posicion posicion) {
    entidadGrafica.setImagen(imagen);
    entidadGrafica.setPosicion(posicion.getX(), posicion.getY());
  }
    
  public abstract void atacar();
  
  public abstract Rectangle getBounds();
}
