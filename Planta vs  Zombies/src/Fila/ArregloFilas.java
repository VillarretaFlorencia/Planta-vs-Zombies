package Fila;

import Conversor.Conversor;
import Plantas.Planta;
import Proyectil.Proyectil;
import Zombies.Zombie;
import java.util.LinkedList;

public class ArregloFilas {

  protected Fila[] arregloFilas;
  Conversor conversor = Conversor.getConversor();

  public ArregloFilas() {
    arregloFilas = new Fila[6];
    for (int i = 0; i < arregloFilas.length; i++) {
      arregloFilas[i] = new Fila();
    }
  }

  public void setPlanta(Planta planta) {
    int fila = planta.getPosicion().getY();
    arregloFilas[conversor.convertirFila(fila)].setPlanta(planta);
  }
  
  public void setZombie(Zombie zombie) {
    int fila = zombie.getPosicion().getY();
    arregloFilas[conversor.convertirFila(fila)].setZombie(zombie);
  }

  public void setProyectil(Proyectil proyectil) {
    int fila = proyectil.getPosicion().getY();
    arregloFilas[conversor.convertirFila(fila)].setProyectil(proyectil);
  }
  
  public Fila getFila(int i) {
    return arregloFilas[i];
  }
  
  public LinkedList<Zombie> getTodosLosZombies() {
    LinkedList<Zombie> zombies = new LinkedList<Zombie>();
    for (int i = 0; i < arregloFilas.length; i++) {
      for (Zombie zombie : arregloFilas[i].getZombies()) {
        zombies.add(zombie);
      }
    }
    return zombies;
  }
}
