package Estados;

import Posicion.Posicion;
import Zombies.Zombie;
/**
 * Esta clase describe parte del comportamiento del zombie mientras ataca
 * 
 *
 */
public class EstadoZombieNormal extends EstadoZombie {

  public EstadoZombieNormal(Zombie z) {
    zombie = z;
    zombie.setImagen(zombie.getImagenNormal());
    zombie.getEntidadGrafica().setImagen(zombie.getImagen());
  }

  public void accionar() {
    //mover al zombie
    Posicion posicion = zombie.getPosicion();
    posicion.setX(posicion.getX() - zombie.getVelocidad());
    zombie.getEntidadGrafica().setPosicion(posicion.getX(), posicion.getY());
  }
}
