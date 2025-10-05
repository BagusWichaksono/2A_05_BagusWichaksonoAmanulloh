package Semester3.Jobsheet6.HewanOOP1;

class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    void bersuara() {
        System.out.println("Meong!");
    }
    
    void mengeong() {
        System.out.println("Meong!");
    }
}