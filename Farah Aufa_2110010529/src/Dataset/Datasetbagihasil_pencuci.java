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
public class Datasetbagihasil_pencuci {
    private ArrayList<Integer> id_bagihasil_pencuci;
    private ArrayList<String> nama_pencuci;
    private ArrayList<Integer> penghasilan;
    private ArrayList<String> slug;
    private ArrayList<String> tanggal;
    private ArrayList<String>  jenis_kendaraan;
    
    //construtor
    public Datasetbagihasil_pencuci (){
        id_bagihasil_pencuci= new ArrayList<Integer>();
        nama_pencuci= new ArrayList<String>(); 
        penghasilan= new ArrayList<Integer>(); 
        slug= new ArrayList<String>(); 
        tanggal= new ArrayList<String>();
        jenis_kendaraan= new ArrayList<String>();
       
     }
     public void insertid_bagihasil_pencuci(Integer isi){
       id_bagihasil_pencuci.add(isi);
    }
     public ArrayList<Integer> getdatasetid_bagihasil_pencuci(){
        return this.id_bagihasil_pencuci;
    }
     public void insertnama_pencuci(String isi){
        this.nama_pencuci.add(isi);
    }
     public ArrayList<String> getdatasetnama_pencuci(){
        return this.nama_pencuci;
    }
      public void insertpenghasilan(Integer isi){
       this.penghasilan.add(isi);
    }
     public ArrayList<Integer> getdatasetpenghasilan(){
        return this.penghasilan;
    }
     public void insertslug(String isi){
       this.slug.add(isi);
    }
     public ArrayList<String> getdatasetslug(){
        return this.slug;
    }
     public void inserttanggal(String isi){
       this.tanggal.add(isi);
    }
     public ArrayList<String> getdatasettanggal(){
        return this.tanggal;
    }
      public void insertjenis_kendaraan(String isi){
       this.jenis_kendaraan.add(isi);
    }
     public ArrayList<String> getdatasetjenis_kendaraan(){
        return this.jenis_kendaraan;
    }
     
     
    
    
    
}
