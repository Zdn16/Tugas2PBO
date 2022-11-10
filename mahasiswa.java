class mahasiswa extends element{
    private int sks;

    public mahasiswa(String nama, int sks){
        super (nama);
        jamsibuk = sks * 3;
    }

    public float getJamSibuk(){
        return jamsibuk;
    }

    public void cetak(){
        System.out.println(nama + "\sadalah seorang mahasiswa dengan jam sibuk\s" + jamsibuk);
    }
}