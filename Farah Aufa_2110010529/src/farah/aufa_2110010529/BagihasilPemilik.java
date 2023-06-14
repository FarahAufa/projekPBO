/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farah.aufa_2110010529;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class BagihasilPemilik {
    private int id_bagihasilpemilik;
    private String tanggal;
    private int keuntungan;
    private String jenis_kendaraan;
    
    // Constructor
    public BagihasilPemilik(int id_bagihasilpemilik, String tgl, int keunt, String jenis) {
        this.id_bagihasilpemilik = id_bagihasilpemilik;
        this.tanggal = tgl;
        this.keuntungan = keunt;
        this.jenis_kendaraan = jenis;
    }
    
    // Getter dan Setter untuk properti
    public int getid_bagihasilpemilik(){
        return  id_bagihasilpemilik;
    }

    public void setid_bagihasilpemilik(int id_bagihasilpemilik) {
        this.id_bagihasilpemilik =  id_bagihasilpemilik;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getKeuntungan() {
        return keuntungan;
    }

    public void setKeuntungan(int keuntungan) {
        this.keuntungan = keuntungan;
    }

    public String getJenis_kendaraan() {
        return jenis_kendaraan;
    }

    public void setJenis_kendaraan(String jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }
    
    public void displayInfo (){
        System.out.println(" id_bagihasilpemilik : " +  id_bagihasilpemilik);
        System.out.println("tanggal : " + tanggal);
        System.out.println("keuntungan : " + keuntungan);
        System.out.println("jenis_kendaraan : " + jenis_kendaraan);
        
    }
}