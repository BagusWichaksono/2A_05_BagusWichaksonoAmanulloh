package Semester3.Jobsheet6.HewanOOP2;

class Kucing extends Hewan {
    String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur); 
        this.ras = ras;
        System.out.println("Konstruktor Kucing Dipanggil.");  
    }
    
    void tampilkanInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Ras  : "+ ras);
    }
}