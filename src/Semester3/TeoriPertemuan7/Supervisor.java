package Semester3.TeoriPertemuan7;

public class Supervisor extends Manager {
    public Supervisor(String nama, int gaji) {
        super(nama, gaji);
    }

    @Override
    public void naikkanGaji() {
        gaji += 1500000;
    }
}
