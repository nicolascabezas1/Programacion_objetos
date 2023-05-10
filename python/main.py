from car import Car
from account import Account

if __name__ == "__main__":
  print("hello world2")
  car = Car("aads12", Account("Nicolas", "2132113"))
  print(vars(car))
  print(vars(car.driver))