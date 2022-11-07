public class App {
    public static void main(String[] args) throws Exception {
        int temp=0;

        Asdos assis1 = new Asdos("Fairuzikun",23,4);
        assis1.tampilAsdos();
        temp=temp+assis1.getJamSibuk();
        
        Dosen dosen1 = new Dosen("Raja OP Damanik", 5);
        dosen1.tampilDosen(); 
        temp=temp+dosen1.getJamSibuk();
        
        Asdos assis2 = new Asdos("Angel-chan", 20, 4);
        assis2.tampilAsdos();
        temp=temp+assis2.getJamSibuk();
        
        Mahasiswa mhs1 = new Mahasiswa("Firman", 20); 
        mhs1.tampilMahasiswa(); 
        temp=temp+mhs1.getJamSibuk();
        
        Mahasiswa mhs2 = new Mahasiswa("Nid to Pass This Sem", 23); 
        mhs2.tampilMahasiswa(); 
        temp=temp+mhs2.getJamSibuk();
        
        Dosen dosen2 = new Dosen("Nivotko", 3); 
        dosen2.tampilDosen(); 
        temp=temp+dosen2.getJamSibuk();

        System.out.println("Total jam sibuk elemen Fasilkom adalah "+temp+"\n");
    }
}