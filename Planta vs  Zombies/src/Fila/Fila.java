package Fila;

import Plantas.Planta;
import Proyectil.Proyectil;
import Zombies.Zombie;
import java.util.Iterator;
import java.util.LinkedList;

public class Fila {

  protected LinkedList<Zombie> listaZombies;
  protected LinkedList<Planta> listaPlantas;
  protected Planta[] plantas;
  protected LinkedList<Proyectil> listaProyectiles;

  public Fila() {
    listaZombies = new LinkedList<Zombie>();
    listaPlantas = new LinkedList<Planta>();
    listaProyectiles = new LinkedList<Proyectil>();
  }

  public void setPlanta(Planta planta) {
    listaPlantas.add(planta);
  }
  
  public void setZombie(Zombie zombie) {
    listaZombies.add(zombie);
  }

  public void setProyectil(Proyectil planta) {
    listaProyectiles.add(planta);
  }

  public LinkedList<Planta> getPlantas() {
    return listaPlantas;
  }
  
  public LinkedList<Zombie> getZombies() {
    return listaZombies;
  }

  public LinkedList<Proyectil> getProyectiles() {
    return listaProyectiles;
  }

  public void sacarPlanta(Planta planta) {	 
	  int indice = listaPlantas.indexOf(planta);
	  if (indice >= 0)
			listaPlantas.remove(listaPlantas.indexOf(planta));
  }

  public void sacarZombie(Zombie zombie) {
	  int indice = listaZombies.indexOf(zombie);
	  if (indice >= 0)
			listaZombies.remove(indice);
  }

  public void sacarProyectil(Proyectil proyectil) {
	int indice = listaProyectiles.indexOf(proyectil);
	if (indice >= 0)
		listaProyectiles.remove(indice);
  }

  public boolean hayZombies() {
	  LinkedList<Zombie> copiaZombies = (LinkedList<Zombie>) listaZombies.clone();
	  return !copiaZombies.isEmpty();
  }
  
  public void colisiones() {
	LinkedList<Planta> copiaPlantas = (LinkedList<Planta>) listaPlantas.clone();
    LinkedList<Zombie> copiaZombies = (LinkedList<Zombie>) listaZombies.clone();
    for (Zombie zombie : copiaZombies) {
      boolean colisionPlanta = false;
      
      LinkedList<Proyectil> copiaProyectil = (LinkedList<Proyectil>) listaProyectiles.clone();
      for (Proyectil proyectil : copiaProyectil) {
        if (zombie.getBounds().intersects(proyectil.getBounds())) {
          proyectil.accept(zombie.getVisitor());
        }
      }
      
      Iterator<Planta> it = copiaPlantas.iterator();
      while (it.hasNext() && !colisionPlanta) {
        Planta planta = it.next();
        if (zombie.getBounds().intersects(planta.getBounds())) {
          colisionPlanta = true;
          planta.accept(zombie.getVisitor());

          copiaPlantas.remove(copiaPlantas.indexOf(planta));
          it = copiaPlantas.iterator();
        }
      }
    }
  } 
  
  public void limpiarFila() {
    listaZombies.clear();
    listaPlantas.clear();
    listaProyectiles.clear();
  }
  
}
