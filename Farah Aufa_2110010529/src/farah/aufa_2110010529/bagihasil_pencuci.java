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
public class bagihasil_pencuci {
    private int id_bagihasil_pencuci;
    private String nama_pencuci;
    private int penghasilan;
    private String slug;
    private String tanggal;
    private String jenis_kendaraan;

    // Constructor
    public bagihasil_pencuci(int id_bagihasil_pencuci, String nama, int penghasilan, String slug, String tanggal, String jenis_kendaraan) {
        this.id_bagihasil_pencuci = id_bagihasil_pencuci;
        this.nama_pencuci = nama;
        this.penghasilan = penghasilan;
        this.slug = slug;
        this.tanggal = tanggal;
        this.jenis_kendaraan = jenis_kendaraan;
    }

    // Getter dan Setter untuk properti
  public int id_bagihasil_pencuci() {
        return id_bagihasil_pencuci;
    }

    public void setid_bagihasil_pencuci(int id_bagihasil_pencuci) {
        this.id_bagihasil_pencuci = id_bagihasil_pencuci;
    }
    public String getNama_pencuci() {
        return nama_pencuci;
    }

    public void setNama_pencuci(String nama_pencuci) {
        this.nama_pencuci = nama_pencuci;
    }

    public int getPenghasilan() {
        return penghasilan;
    }

    public void setPenghasilan(int penghasilan) {
        this.penghasilan = penghasilan;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJenis_kendaraan() {
        return jenis_kendaraan;
    }

    public void setJenis_kendaraan(String jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }
    public void displayInfo (){
        System.out.println("id_bagihasil_pencuci: " + id_bagihasil_pencuci);
        System.out.println("nama_pencuci: " + nama_pencuci);
        System.out.println("penghasilan : " + penghasilan);
        System.out.println("slug : " + slug);
        System.out.println("tanggal : " + tanggal);
        System.out.println("jenis_kendaraan : " + jenis_kendaraan);
        
        }
}