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
import java.util.Date;

public class pengeluaran {
    private int id_pengeluaran;
    private String nama_user;
    private String nama_pengeluaran;
    private String tanggal;
    private int biaya_pengeluaran;

    // Constructor
    public pengeluaran(int id_pengeluaran, String nama_user, String nama_pengeluaran, String tanggal, int biaya_pengeluaran) {
        this.id_pengeluaran =id_pengeluaran;
        this.nama_user = nama_user;
        this.nama_pengeluaran = nama_pengeluaran;
        this.tanggal = tanggal;
        this.biaya_pengeluaran = biaya_pengeluaran;
    }

    // Getter dan Setter untuk properti
    public int getid_pengeluaran() {
        return id_pengeluaran;
    }

    public void setid_pengeluaran(int id_pengeluaran) {
        this.id_pengeluaran = id_pengeluaran;
    }

    public String getNama_user() {
        return nama_user;
    }

    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }

    public String getNama_pengeluaran() {
        return nama_pengeluaran;
    }

    public void setNama_pengeluaran(String nama_pengeluaran) {
        this.nama_pengeluaran = nama_pengeluaran;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public double getBiaya_pengeluaran() {
        return biaya_pengeluaran;
    }

    public void setBiaya_pengeluaran(int biaya_pengeluaran) {
        this.biaya_pengeluaran = biaya_pengeluaran;
    }
     public void displayInfo (){
        System.out.println("id_pengeluaran: " + id_pengeluaran);
        System.out.println("nama_user: " + nama_user);
        System.out.println("nama_pengeluaran: " + nama_pengeluaran);
        System.out.println("tanggal : " + tanggal);
        System.out.println("biaya_pengeluaran : " + biaya_pengeluaran);
        
        }
}