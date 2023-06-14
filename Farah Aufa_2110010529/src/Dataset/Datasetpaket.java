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
public class Datasetpaket {
    private ArrayList<Integer> id_paket;
    private ArrayList<String> nama_paket;
    private ArrayList<String> jenis_kendaraan;
    private ArrayList<Integer> harga;
    
    //construtor
    public Datasetpaket (){
       id_paket= new ArrayList<Integer>();
       nama_paket= new ArrayList<String>(); 
       jenis_kendaraan= new ArrayList<String>(); 
       harga= new ArrayList<Integer>(); 
       
    }
     public void insertid_paket(Integer isi){
      this.id_paket.add(isi);
    }
     public ArrayList<Integer> getdatasetid_paket(){
        return this.id_paket;
    }
      public void insertnama_paket(String isi){
       this. nama_paket.add(isi);
    }
     public ArrayList<String> getdatasetnama_paket(){
        return this. nama_paket;
    }
      public void insertjenis_kendaraan(String isi){
      this.jenis_kendaraan.add(isi);
    }
     public ArrayList<String> getdatasetjenis_kendaraan(){
        return this.jenis_kendaraan;
    }
     public void insertharga(Integer isi){
       this.harga.add(isi);
    }
     public ArrayList<Integer> getdatasetharga(){
        return this.harga;
    }
        
     
    
}
