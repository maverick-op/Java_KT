package AbstractClass;

public abstract class Car {
    int mileage;

    Car(int mileage)
    {
        this.mileage = mileage;
    }

    public abstract void pressBreak();    // No implementation is present in abstract class

    public abstract void pressClutch();

    public int getNumberOfWheels()
    {
        return 4;
    }

    // new Car() object cannot be created in a abstract class

}

