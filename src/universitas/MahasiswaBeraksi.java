package universitas;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        //Membuat Objek
        Mahasiswa Han = new Mahasiswa();
        
        Han.setNpm("2110010251");
        Han.setNama("Subhan");
        Han.setProdi("Teknik Informatika");
        
        System.out.println("NPM:"+Han.getNpm());
        System.out.println("NAMA:"+Han.getNama());
        System.out.println("PRODI:"+Han.getProdi());
    }
    
}