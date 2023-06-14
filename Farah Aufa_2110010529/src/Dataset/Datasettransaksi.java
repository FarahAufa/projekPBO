/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Datasettransaksi {
    private ArrayList<Integer> id_transaksi;
    private ArrayList<String> nama_user;
    private ArrayList<String> nama_pencuci;
    private ArrayList<String> nama_pelanggan;
    private ArrayList<String> no_plat;
    private ArrayList<String> nama_paket;
    private ArrayList<Integer> tanggal;
    
     //construtor
    public Datasettransaksi (){
       id_transaksi= new ArrayList<Integer>();
       nama_user= new ArrayList<String>();
       nama_pencuci= new ArrayList<String>();
       nama_pelanggan= new ArrayList<String>(); 
       no_plat= new ArrayList<String>(); 
       nama_paket= new ArrayList<String>(); 
       tanggal= new ArrayList<Integer>(); 
       
    }
     public void insertid_transaksi(Integer isi){
     this.id_transaksi.add(isi);
    }
     public ArrayList<Integer> getdatasetid_transaksi(){
        return this.id_transaksi;
    }
      public void insertnama_user(String isi){
     this.nama_user.add(isi);
    }
     public ArrayList<String> getdatasetnama_user(){
        return this.nama_user;
    }
     public void insertnama_pencuci(String isi){
     this.nama_pencuci.add(isi);
    }
     public ArrayList<String> getdatasetnama_pencuci(){
        return this.nama_pencuci;
    }
    public void insertnama_pelanggan(String isi){
     this.nama_pelanggan.add(isi);
    }
     public ArrayList<String> getdatasetnama_pelanggan(){
        return this.nama_pelanggan;
    }
      public void insertno_plat(String isi){
     this.no_plat.add(isi);
    }
     public ArrayList<String> getdatasetno_plat(){
        return this.no_plat;
    }
     public void insertnama_paket(String isi){
    this.nama_paket.add(isi);
    }
     public ArrayList<String> getdatasetnama_paket(){
        return this.nama_paket;
    }
     public void inserttanggal(Integer isi){
    this.tanggal.add(isi);
    }
     public ArrayList<Integer> getdatasettanggal(){
        return this.tanggal;
    }
       
    
}
