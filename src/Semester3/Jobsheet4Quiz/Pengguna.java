package Semester3.Jobsheet4Quiz;

public class Pengguna {
    private int idPengguna;
    private String namaLengkap;
    private String email;

    public Pengguna(int id, String nama, String email) {
        this.idPengguna = id;
        this.namaLengkap = nama;
        this.email = email;
    }

    public int getIdPengguna() { return idPengguna; }
    public void setIdPengguna(int id) { this.idPengguna = id; }
    public String getNamaLengkap() { return namaLengkap; }
    public void setNamaLengkap(String nama) { this.namaLengkap = nama; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}