package SingletonClass;

//Lazy + thread safe + no explicit synchronized keyword
//commonly prefeered traditionbal singelton implemenmtation
public class BillPugh {

    private BillPugh(){
        System.out.println("Bill Pugh is crerated");
    }

    //The inner class is loaded only when getinstance is called
    private static class SingletonHelper{
        
        //object is created when singelton helper is initialized
        private static final BillPugh instance = new BillPugh();
    }

    public static BillPugh getInstance(){
        
        //Accessing instance initializes singleton helper
        //safely and only once
        return SingletonHelper.instance;
    }
}
