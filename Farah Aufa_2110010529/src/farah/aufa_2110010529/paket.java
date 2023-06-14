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
public class paket {
    private int id_paket;
    private String nama_paket;
    private String jenis_kendaraan;
    private int harga;

    // Constructor
    public paket(int id_paket,String nama_paket, String jenis_kendaraan, int harga) {
        this.id_paket =id_paket;
        this.nama_paket = nama_paket;
        this.jenis_kendaraan = jenis_kendaraan;
        this.harga = harga;
    }

    // Getter dan Setter untuk properti
     public int getid_paket() {
        return id_paket;
    }

    public void setid_paket(int id_paket) {
        this.id_paket = id_paket;
    }

    public String getNama_paket() {
        return nama_paket;
    }

    public void setNama_paket(String nama_paket) {
        this.nama_paket = nama_paket;
    }

    public String getJenis_kendaraan() {
        return jenis_kendaraan;
    }

    public void setJenis_kendaraan(String jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void displayInfo (){
        System.out.println("id_paket: " + id_paket);
        System.out.println("nama_paket: " + nama_paket);
        System.out.println("jenis_kendaraan : " + jenis_kendaraan);
        System.out.println("harga : " + harga);
        }
}