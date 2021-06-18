import java.util.Arrays;

public class Buy {
    private String Fam;
    private int kolPoc;
    int[] Pokupki = new int[10];

    public Buy(String aFam) {
        Fam = aFam;
        kolPoc = 0;
    }

    public String getFam() {
        return Fam;
    }

    public void setFam(String NewFam) {
        Fam = NewFam;
    }

    public int getKolPoc() {
        return kolPoc;
    }

    public int getPocupka(int nom) {
        return Pokupki[nom];
    }

    public boolean setPocupka(int nom, int newPoc) {
        Pokupki[nom] = newPoc;
        return true;
    }

    public boolean addPocupka(int newPoc) {
        Pokupki[kolPoc] = newPoc;
        kolPoc++;
        return true;
    }

    public int sumPoc() {
        int sum = 0;
        for (int num : Pokupki) {
            sum = sum + num;
        }
        return sum;
    }

    public float SredBall() {
        int sum = 0;
        float SredBall;
        for (int num : Pokupki) {
            sum = sum + num;
        }
        SredBall = sum / kolPoc;
        return SredBall;
    }

    public String getData() {
        String PokupkiString = Arrays.toString(Pokupki);
        String text1;
        text1 = ("Фамилия покупателя: " + getFam() + "\n" +
                "Цены покупок покупателя: " + " \n " + PokupkiString + "\n" +
                "Сумма покупок: " + sumPoc()) + "\n";
        return text1;
    }

}

