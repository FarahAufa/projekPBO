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
public class Datasetpencuci {
    private ArrayList<Integer> id_pencuci;
    private ArrayList<String> nama_pencuci;
    private ArrayList<String> alamat_pencuci;
    private ArrayList<String> telp_pencuci;
    
     //construtor
    public Datasetpencuci (){
       id_pencuci= new ArrayList<Integer>();
       nama_pencuci= new ArrayList<String>(); 
       alamat_pencuci= new ArrayList<String>(); 
       telp_pencuci= new ArrayList<String>(); 
       
    }
     public void insertid_pencuci(Integer isi){
      this.id_pencuci.add(isi);
    }
     public ArrayList<Integer> getdatasetid_pencuci(){
        return this.id_pencuci;
    }
    public void insertnama_pencuci(String isi){
        this.nama_pencuci.add(isi);
    }
     public ArrayList<String> getdatasetnama_pencuci(){
        return this. nama_pencuci;
    }
    public void insertalamat_pencuci(String isi){
        this.alamat_pencuci.add(isi);
    }
     public ArrayList<String> getdatasetalamat_pencuci(){
        return this. alamat_pencuci;
    }
      public void inserttelp_pencuci(String isi){
        this.telp_pencuci.add(isi);
    }
     public ArrayList<String> getdatasettelp_pencuci(){
        return this. telp_pencuci;
    }
}
