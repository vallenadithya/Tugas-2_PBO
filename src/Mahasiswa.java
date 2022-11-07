public class Mahasiswa extends Elemen {
    private int SKS;

    public Mahasiswa(String nama, int SKS){
        super(nama);
        this.SKS=SKS;
    }

    public int getJamSibuk() {
        return SKS*3;
    }

    public void tampilMahasiswa(){
        System.out.println(super.getNama()+"adalah seorang mahasiswa dengan jam sibuk "+getJamSibuk());
    }
}