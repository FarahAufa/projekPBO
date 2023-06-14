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
public class pencuci {
    private int id_pencuci;
    private String nama_pencuci;
    private String alamat_pencuci;
    private String telp_pencuci;

    // Constructor
    public pencuci(int id_pencuci, String nama_pencuci, String alamat_pencuci, String telp_pencuci) {
        this.id_pencuci = id_pencuci;
        this.nama_pencuci = nama_pencuci;
        this.alamat_pencuci = alamat_pencuci;
        this.telp_pencuci = telp_pencuci;
    }

    // Getter dan Setter untuk properti
    public int getid_pencuci() {
        return id_pencuci;
    }

    public void setid_pencuci(int id_pencuci) {
        this.id_pencuci = id_pencuci;
    }

    public String getNama_pencuci() {
        return nama_pencuci;
    }

    public void setNama_pencuci(String nama_pencuci) {
        this.nama_pencuci = nama_pencuci;
    }

    public String getAlamat_pencuci() {
        return alamat_pencuci;
    }

    public void setAlamat_pencuci(String alamat_pencuci) {
        this.alamat_pencuci = alamat_pencuci;
    }

    public String getTelp_pencuci() {
        return telp_pencuci;
    }

    public void setTelp_pencuci(String telp_pencuci) {
        this.telp_pencuci = telp_pencuci;
    }
     public void displayInfo (){
        System.out.println("id_pencuci: " + id_pencuci);
        System.out.println("nama_pencuci: " + nama_pencuci);
        System.out.println("alamat_pencuci: " + alamat_pencuci);
        System.out.println("telp_pencuci : " + telp_pencuci);
        }
}
