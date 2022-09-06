class Car {
    public void accelerate(double speed) {
        // you can give certain parameters to your methods, like this double speed.
        System.out.println("Accelarating "+ speed);
    }
}

    class MMain{
    public static void main(String[] args) {
        // guess we want to create a new object for my car inside the class Car.
        Car myCar = new Car();
        myCar.accelerate(100); // if you gave parameters to methods, in here you must give values to your methods.

        // create new object for your friend's car.
        Car friendCar = new Car();
        friendCar.accelerate(80);
    }
}


