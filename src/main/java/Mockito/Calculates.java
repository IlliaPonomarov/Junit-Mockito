package Mockito;

public class Calculates{

    private BasicCalucalte basicCalucalte;

    public Calculates(BasicCalucalte basicCalucalte) {
        this.basicCalucalte = basicCalucalte;
    }

    public int moduleTestBy2(int number){

        if (number % 2 == 0)
            return number;

        return -1;
    }

    public double add(double first, double second){
        return first + second;
    }



}
