package factory;

public class CalculateFactory {
    public Calculate getCalculation(String type)
    {
        Calculate obj = null;

        if(type.toLowerCase().equals("add"))
            obj = new Add();
        else if(type.toLowerCase().equals("substract"))
            obj = new Add();
        else if(type.toLowerCase().equals("divide"))
            obj = new Add();
        else
            System.out.println("calculation not found");

        return obj;
    }
}
