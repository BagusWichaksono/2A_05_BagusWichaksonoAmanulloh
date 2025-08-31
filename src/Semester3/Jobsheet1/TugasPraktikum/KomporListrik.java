package Semester3.Jobsheet1.TugasPraktikum;

public class KomporListrik extends Kompor {
    private int daya;
    private String merek;

    public KomporListrik(String merek, int jumlahTungku, int daya) {
        super(merek, jumlahTungku);
        this.merek = merek;
        this.daya = daya;
    }

    public void aturSuhu(int suhu) {
        System.out.println("Kompor Listrik " + merek + " diatur ke suhu " + suhu + " derajat");
    }
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Daya: " + daya + " Watt");
    }
}
