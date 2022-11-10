public class asdos extends mahasiswa{
    private int jamNgasdos;

    public asdos (String nama, int sks, int jamNgasdos){
        super (nama,sks);
        jamsibuk = jamsibuk + jamNgasdos;
    }

    public float getJamSibuk(){
        return jamsibuk;
    }

    public void cetak (){
        System.out.println(nama + "\sadalah seorang asdos dengan jam sibuk\s" + jamsibuk);
    }
}
