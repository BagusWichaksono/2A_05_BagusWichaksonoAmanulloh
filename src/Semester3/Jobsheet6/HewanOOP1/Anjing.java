package Semester3.Jobsheet6.HewanOOP1;

class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    void bersuara() {
        System.out.println("Guk... Guk!");
    }

    void menggonggong() {
        System.out.println("Guk... Guk!");
    }
}