package com.campusdual.classroom;

public class FuelTank {

  private int actualFuel = 10;

  public void setActualFuel(int actualFuel) {
    if (actualFuel<0){
      System.out.println("El valor del combustible no puede ser negativo");
    } else{
      this.actualFuel = actualFuel;
    }
  }

  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.getActualFuel() + " litros.");
  }

  public int getActualFuel() {
    return this.actualFuel;
  }
}
