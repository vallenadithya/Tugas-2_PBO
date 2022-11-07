public class App {
    public static void main(String[] args) throws Exception {
        int temp=0;

        Asdos asdos1 = new Asdos("Fairuzikun",23,4);
        asdos1.tampilAsdos();
        temp=temp+asdos1.getJamSibuk();
        
        Dosen dosen1 = new Dosen("Raja OP Damanik", 5);
        dosen1.tampilDosen(); 
        temp=temp+dosen1.getJamSibuk();
        
        Asdos asdos2 = new Asdos("Angel-chan", 20, 4);
        asdos2.tampilAsdos();
        temp=temp+asdos2.getJamSibuk();
        
        Mahasiswa mahasiswa1 = new Mahasiswa("Firman", 20); 
        mahasiswa1.tampilMahasiswa(); 
        temp=temp+mahasiswa1.getJamSibuk();
        
        Mahasiswa mahasiswa2 = new Mahasiswa("Nid to Pass This Sem", 23); 
        mahasiswa2.tampilMahasiswa(); 
        temp=temp+mahasiswa2.getJamSibuk();
        
        Dosen dosen2 = new Dosen("Nivotko", 3); 
        dosen2.tampilDosen(); 
        temp=temp+dosen2.getJamSibuk();

        System.out.println("Total jam sibuk elemen Fasilkom adalah "+temp+"\n\n");
    }
}