public class Dosen extends Elemen{
    private int jumlahHariKerja;

    public Dosen(String nama, int jumlahHariKerja){
        super(nama);
        this.jumlahHariKerja=jumlahHariKerja;
    }

    public int getJamSibuk() {
        return jumlahHariKerja*8;
    }

    public void tampilDosen(){
    System.out.println(super.getNama() + " adalah seorang dosen dengan jam sibuk " + getJamSibuk());
    }
}