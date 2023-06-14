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
public class Datasetpengeluaran {
    private ArrayList<Integer> id_pengeluaran;
    private ArrayList<String> nama_user;
    private ArrayList<String> nama_pengeluaran;
    private ArrayList<String> tanggal;
    private ArrayList<Integer> biaya_pengeluaran;
    
     //construtor
    public Datasetpengeluaran (){
       id_pengeluaran= new ArrayList<Integer>();
       nama_user= new ArrayList<String>(); 
       nama_pengeluaran= new ArrayList<String>(); 
       tanggal= new ArrayList<String>(); 
       biaya_pengeluaran= new ArrayList<Integer>(); 
       
    }
     public void insertid_pengeluaran(Integer isi){
     this.id_pengeluaran.add(isi);
    }
     public ArrayList<Integer> getdatasetid_pengeluaran(){
        return this.id_pengeluaran;
    }
     public void insertnama_user(String isi){
     this.nama_user.add(isi);
    }
     public ArrayList<String> getdatasetnama_user(){
        return this.nama_user;
    }
    public void insertnama_pengeluaran(String isi){
    this.nama_pengeluaran.add(isi);
    }
     public ArrayList<String> getdatasetnama_pengeluaran(){
        return this.nama_pengeluaran;
    }
      public void inserttanggal(String isi){
    this.tanggal.add(isi);
    }
     public ArrayList<String> getdatasettanggal(){
        return this. tanggal;
    }
     public void insertbiaya_pengeluaran(Integer isi){
    this.biaya_pengeluaran.add(isi);
    }
     public ArrayList<Integer> getdatasetbiaya_pengeluaran(){
        return this.biaya_pengeluaran;
    }
       
    
    
}
