package Semester3.Jobsheet6.HewanOOP4;

public class Anjing extends Hewan{
    private String jenisBulu;  
    
    public Anjing(String nama, int umur, String jenisBulu){
        super(nama, umur);
        this.jenisBulu = jenisBulu;
    }

    public void setJenisBulu(String jenisBulu){
        this.jenisBulu = jenisBulu;
    }

    public String getJenisBulu(){
        return jenisBulu;
    }

    public void info(){
        super.info();
        System.out.println("Jenis bulu  : " + jenisBulu);
    }
}
