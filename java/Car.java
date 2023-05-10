class Car {
  private Integer id;
  private String license;
  private Account driver;
  private Integer passenger;

  public Car(String license, Account driver) {
    this.license = license;
    this.driver = driver;
  }

  void printDataCar() {
    if (passenger != null) {
      System.out.println("License: " + license);
      System.out.println("Driver: " + driver.name);
      System.out.println("Passenger: " + passenger); 
    }else {
      System.out.println("error en los inputs");
    }
    
  }

  public Integer getPassenger() {
    return passenger;
  }

  public void setPassenger(Integer passenger) {
    if (passenger == 4) {
      this.passenger = passenger;
    }else {
      System.out.println("numero de plasas no requeridas");
    }
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public Account getDriver() {
    return driver;
  }

  public void setDriver(Account driver) {
    this.driver = driver;
  }

  
}
