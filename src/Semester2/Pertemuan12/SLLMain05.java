package Semester2.Pertemuan12;

public class SLLMain05 {
    public static void main(String[] args) {
        SingleLinkedList05 sll = new SingleLinkedList05();

        Mahasiswa05 mhs1 = new Mahasiswa05("Alvaro", "24212200", "1A", 4.0);
        Mahasiswa05 mhs2 = new Mahasiswa05("Bimon", "23212201", "2B", 3.8);
        Mahasiswa05 mhs3 = new Mahasiswa05("Cintia", "22212202", "3C", 3.5);
        Mahasiswa05 mhs4 = new Mahasiswa05("Dirga", "21212203", "4D", 3.6);

        sll.addFirst(mhs4);        
        sll.addLast(mhs1);         
        sll.insertAfter("Dirga", mhs3); 
        sll.insertAt(2, mhs2);     

        System.out.println("Data index 1 : ");
        sll.getData(1);

        System.out.println("Data Mahasiswa atas nama Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst(); 
        sll.removeLast();  
        sll.print(); 
        sll.removeAt(0); 
        sll.print();
    }
}
