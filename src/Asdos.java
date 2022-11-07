public class Asdos extends Mahasiswa {
    private int jamNgasdos;

    public Asdos(String nama, int SKS, int jamNgasdos){
        super(nama, SKS);
        this.jamNgasdos=jamNgasdos;
    }

    public int getJamSibuk() {
        return jamNgasdos+super.getJamSibuk();
    }

    public void tampilAsdos(){
        System.out.println(super.getNama() + " adalah seorang asdos dengan jam sibuk " + getJamSibuk());
    }
}
