package Semester3.Jobsheet1.TugasPraktikum;

public class MainDemo {
    public static void main(String[] args) {
        Laptop lp1 = new Laptop("Asus", "Gaming V16", 16);
        Handphone hp1 = new Handphone("Apple", "Iphone 13 Mini", 2406);
        KomporListrik kl1 = new KomporListrik("Modena", 1, 1500);
        KomporGas kg1 = new KomporGas("Rinnai", 2, "LPG 12 Kg");

        lp1.cetakInfo();
        lp1.nyalakan();
        lp1.matikan();
        System.out.println();

        hp1.cetakInfo();
        hp1.telepon("081233334567");
        hp1.kirimPesan("082212345566");
        System.out.println();

        kl1.cetakInfo();
        kl1.nyalakan();
        kl1.aturSuhu(200);
        kl1.matikan();
        System.out.println();

        kg1.cetakInfo();
        kg1.nyalakan();
        kg1.matikan();
    }
}
