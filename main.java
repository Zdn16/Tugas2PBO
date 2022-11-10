public class main {
    

    public static void main(String[] args) throws Exception {
        element Fairuz = new asdos("Fairuzikun", 20, 13);
        element Raja = new dosen("Raja OP Damanik", 5);
        element angel = new asdos("Angel-Chan", 18, 10);
        element Firman = new mahasiswa ("Firman", 20);
        element Ned = new mahasiswa("Nid to pass this sem", 23);
        element Nivotko = new dosen("Nivotko", 3);
        Fairuz.cetak();
        Raja.cetak();
        angel.cetak();
        Firman.cetak();
        Ned.cetak();
        Nivotko.cetak();

        float totaljamsibuk=Fairuz.jamsibuk+Raja.jamsibuk+angel.jamsibuk+Firman.jamsibuk+Ned.jamsibuk+Nivotko.jamsibuk;
        System.out.println("Total jam sibuk elemen FASILKOM adalah\s" + totaljamsibuk );
    }
}
