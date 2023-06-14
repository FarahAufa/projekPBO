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
public class user {
    private int id_user;
    private String username;
    private String nama_user;
    private String password;
    private String foto;
    private String hak_akses;

    // Constructor
    public user(int id_user, String username, String nama_user, String password, String foto, String hak_akses) {
        this.id_user = id_user;
        this.username = username;
        this.nama_user = nama_user;
        this.password = password;
        this.foto = foto;
        this.hak_akses = hak_akses;
    }

    // Getter dan Setter untuk properti
    public int getid_user() {
        return id_user;
    }

    public void setid_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama_user() {
        return nama_user;
    }

    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getHak_akses() {
        return hak_akses;
    }

    public void setHak_akses(String hak_akses) {
        this.hak_akses = hak_akses;
    }
    public void displayInfo (){
        System.out.println("username: " + username);
        System.out.println("nama_user: " + nama_user);
        System.out.println("password: " + password);
        System.out.println("foto : " + foto);
        System.out.println("hak_akses : " + hak_akses);
        
        
        }
}
