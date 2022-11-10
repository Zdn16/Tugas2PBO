public class dosen extends element{
    private int jumlahHariKerja;

    public dosen (String nama, int jumlahHariKerja){
    super(nama);
    jamsibuk = jumlahHariKerja * 8;
    }
    
    public float getJamSibuk(){
        return jamsibuk;
    }
    
    public void cetak(){
        System.out.println(nama + "\sadalah seorang dosen dengan jam sibuk\s" + jamsibuk);

    }
}
