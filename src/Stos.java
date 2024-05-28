public class Stos {
    private double[] tablica;
    private int pierwszyElement;

    public Stos(int rozmiar){
        tablica = new double[rozmiar];
        pierwszyElement = 0;
    }

    public void Push(double liczba){
        if(pierwszyElement < tablica.length){
            tablica[pierwszyElement] = liczba;
            pierwszyElement++;
        }
    }
    public double Pop(){
        double element = tablica[pierwszyElement];
        pierwszyElement--;
        return element;
    }
    public double Top(){
        return tablica[pierwszyElement];
    }

    public String isEmpty(){
        if(pierwszyElement == 0){
            return "Stos jest pust";
        }else{
            return "Stos nie jest pusty";
        }
    }
}