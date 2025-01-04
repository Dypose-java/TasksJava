package testAll;

public class Test {
}

class Pidor  implements WhoPidor{
    NamePidor namePidor;
    LiveIN liveIN;

    public Pidor(NamePidor namePidor, LiveIN liveIN) {
        this.namePidor = namePidor;
        this.liveIN = liveIN;
    }

    @Override
    public String toString() {
        return "Pidor{" +
                "namePidor=" + namePidor +
                ", liveIN=" + liveIN +
                '}';
    }


    @Override
    public void hePidor() {
            if (namePidor.equals(NamePidor.Dypose))
                System.out.println("Не пидор");
            else if(namePidor.equals(NamePidor.Kuzma))
                System.out.println("Пидор");
        }
    }

enum NamePidor{
    Dypose,Kuzma;
}
enum LiveIN{
    MIT,TEKST
}

interface WhoPidor{
      void hePidor();
}


class Main{
    public static void main(String[] args) {
        Pidor pidor = new Pidor(NamePidor.Dypose,LiveIN.MIT);
        System.out.println(pidor);
        pidor.hePidor();
    }
}