/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

//import static posttest5.posttest5.listMkn;

/**
 *
 * @author User
 */
public class Makanan extends Data{
    private String Rasa;
    private String Jenis;
    
    public Makanan(String name, String tanggalBrg, String StokMasuk, String Jenis, String Rasa) {
        super(name, tanggalBrg, StokMasuk);
        this.Rasa = Rasa;
        this.Jenis = Jenis;
    }

    public Makanan(){}
    
    /**
     * @return the Rasa
     */
    public String getRasa() {
        return Rasa;
    }

    /**
     * @param Rasa the statusPerkawinan to set
     */
    public void setRasa(String Rasa) {
        this.Rasa = Rasa;
    }

    /**
     * @return the Jenis
     */
    public String getJenis() {
        return Jenis;
    }

    /**
     * @param Jenis the Jenis to set
     */
    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
    
    @Override
    public void deskripsi(){
        System.out.println("Ketika perut seseorang penuh, tidak ada bedanya apakah dia kaya atau miskin");
    }
    @Override
    public void deskripsi(int i){
        System.out.println("Data barang hanya ada: "+ i);
    } 

    @Override
    public void tampil(){
        System.out.println("Lokasi Toko               :" + lokasi);
        System.out.println("Nama Makanan              :" + getName());
        System.out.println("Tanggal Masuk Makanan     :" + getTanggalBrg());
        System.out.println("Stok Masuk Makanan        :" + getStokMasuk());
        System.out.println("Rasa Makanan              :" + Rasa);
        System.out.println("Jenis Makanan             :" + Jenis);
    }
}