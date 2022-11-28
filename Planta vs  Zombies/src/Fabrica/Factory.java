package Fabrica;

import Plantas.Girasol;
import Plantas.Nuez;
import Plantas.Planta;
import Zombies.Zombie;
import Zombies.ZombieBalde;
import Zombies.ZombieBandera;
import Zombies.ZombieCono;
import Zombies.ZombieNormal;
import Zombies.ZombiePeriodico;
import Zombies.ZombiePuerta;
import Zombies.ZombieVolador;

public abstract class Factory {

public Girasol createPlantaGirasol() {
    Girasol girasol = new Girasol();
    return girasol;
  }

  public Nuez createPlantaNuez() {
    Nuez nuez = new Nuez();
    return nuez;
  }

  public abstract Planta createPlantaA();

  public abstract Planta createPlantaB();

  public Zombie createZombieBandera() {
    Zombie zombieBandera = new ZombieBandera();
    return zombieBandera;
  }
  
  public Zombie createZombieNormal() {
    Zombie zombieNormal = new ZombieNormal();
    return zombieNormal;
  }

  public Zombie createZombiePeriodico() {
    Zombie zombiePeriodico = new ZombiePeriodico();
    return zombiePeriodico;
  }
  
  public Zombie createZombieCono() {
    Zombie zombieCono = new ZombieCono();
    return zombieCono;
  }

  public Zombie createZombieBalde() {
    Zombie zombieBalde = new ZombieBalde();
    return zombieBalde;
  }

  public Zombie createZombiePuerta() {
    Zombie zombiePuerta = new ZombiePuerta();
    return zombiePuerta;
  }

  public Zombie createZombieVolador() {
    Zombie zombieVolador = new ZombieVolador();
    return zombieVolador;
  }

}
