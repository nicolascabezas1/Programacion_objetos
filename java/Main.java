class Main {
  public static void main(String[] args) {
    Uberx uberx = new Uberx("ASLDLS123", new Account("Nicolas", "213212", "nicolas611230@gmail.com", "La buena vida"), "Ford", "Fiesta");
    uberx.setPassenger(4);
    uberx.printDataCar();
  }
}