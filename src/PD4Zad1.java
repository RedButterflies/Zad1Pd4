
public class PD4Zad1 {

    static void UmieszczanieWFunkcji()
    {
        int [] dane = new int[100];

        int suma=0;
        int i;
        int liczba;
        
        for(i=0;i<100;i++)
        {
            liczba=1+i;
            dane[i]=liczba;
        }

        for (int j : dane) {
            System.out.println(j);
            suma+=j;
        }

        System.out.println("Suma liczb w tablicy: "+suma);
    }
}
