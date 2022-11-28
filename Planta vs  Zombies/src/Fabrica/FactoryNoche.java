package Fabrica;

import Plantas.HumoSeta;
import Plantas.Planta;
import Plantas.SetaDesporadora;


public class FactoryNoche extends Factory {

  public Planta createPlantaA() {
    Planta plantaA = new SetaDesporadora();
    return plantaA;
  }

  public Planta createPlantaB() {
    Planta plantaB = new HumoSeta();
    return plantaB;
  }
}
