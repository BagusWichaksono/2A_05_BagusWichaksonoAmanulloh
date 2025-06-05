package Semester2.Pertemuan15;

public class BinaryTreeMain05 {
    public static void main(String[] args) {
        BinaryTree05 bst = new BinaryTree05();
        bst.add(new Mahasiswa05("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa05("244160220", "Dewi", "B", 3.54));
        bst.add(new Mahasiswa05("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa05("244160221", "Badar", "B", 3.85));
        System.out.println("Daftar semua mahasiswa (in oder traversal):");
        bst.traverseInOrder(bst.root);
        System.out.println("\n\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 = ");
        System.out.println(bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan");
        System.out.print("Cari mahasiswa dengan ipk: 3.22 = ");
        System.out.println(bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan");
        bst.addRekursif(new Mahasiswa05("244160205", "Ehsan", "D", 3.37));
        bst.addRekursif(new Mahasiswa05("244160210", "Fizi", "B", 3.46));
        bst.addRekursif(new Mahasiswa05("244160213", "Devi", "A", 3.72));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);
        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57); 
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);
        System.out.println();
        bst.cariMaxIPK();
        System.out.println();
        bst.cariMinIPK();
        System.out.println();
        bst.tampilMahasiswaIPKdiAtas(3.5);
    }
}
