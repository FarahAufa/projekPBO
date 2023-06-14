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
public class DatasetBagihasilPemilik {
    private ArrayList<Integer> id_bagihasilpemilik;
    private ArrayList<String> tanggal;
    private ArrayList<Integer> keuntungan;
    private ArrayList<String> jenis_kendaraan;
    
    //construtor
    public DatasetBagihasilPemilik (){
        id_bagihasilpemilik= new ArrayList<Integer>();
        tanggal= new ArrayList<String>(); 
        keuntungan= new ArrayList<Integer>(); 
        jenis_kendaraan= new ArrayList<String>(); 
        
    }
    public void insertid_bagihasilpemilik(Integer isi){
        this.id_bagihasilpemilik.add(isi);
    }
     public ArrayList<Integer> getdatasetid_bagihasilpemilik(){
        return this.id_bagihasilpemilik;
    }
     
     public void inserttanggal(String isi){
         this.tanggal.add(isi);
    }
     public ArrayList<String> getdatasettanggal(){
        return this.tanggal;
    }
      public void insertkeuntungan(Integer isi){
       this.keuntungan.add(isi);
    }
     public ArrayList<Integer> getdatasetkeuntungan(){
        return this.keuntungan;
    }
     public void insertjenis_kendaraann(String isi){
       this.jenis_kendaraan.add(isi);
    }
     public ArrayList<String> getdatasetjenis_kendaraan(){
        return this.jenis_kendaraan;
    }
     
    
    
}
