package AbstractClass;

public class Audi extends LuxuryCar {
    Audi(int mileage)
    {
        super(mileage);
    }

    @Override
    public void pressClutch(){
        //its implementation
    }

    @Override
    public void pressBreak(){
        //its implemetation
    }

    @Override
    public void pressdualbreak(){
        //its implemetation
    }

    //if new Audi() object is creted it reference will be stored in the parent class i.e Luxury Car
}
