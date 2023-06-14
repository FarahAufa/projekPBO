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
public class Datasetuser {
    private ArrayList<Integer> id_user;
    private ArrayList<String> username;
    private ArrayList<String> nama_user;
    private ArrayList<String> password;
    private ArrayList<String> foto;
    private ArrayList<String>hak_akses;
     

 //construtor
    public Datasetuser (){
       id_user= new ArrayList<Integer>();
       username= new ArrayList<String>(); 
       nama_user= new ArrayList<String>(); 
       password= new ArrayList<String>(); 
       foto= new ArrayList<String>(); 
       hak_akses= new ArrayList<String>();
       
    }
     public void insertid_user(Integer isi){
     this.id_user.add(isi);
    }
     public ArrayList<Integer> getdatasetid_user(){
        return this. id_user;
    }
     public void insertusername(String isi){
     this.username.add(isi);
    }
     public ArrayList<String> getdatasetusername(){
        return this.username;
    }
    public void insertnama_user(String isi){
    this.nama_user.add(isi);
    }
     public ArrayList<String> getdatasetnama_user(){
        return this.nama_user;
    }
      public void insertpassword(String isi){
    this.password.add(isi);
    }
     public ArrayList<String> getdatasetpassword(){
        return this.password;
    }
    public void insertfoto(String isi){
    this.foto.add(isi);
    }
     public ArrayList<String> getdatasetfoto(){
        return this.foto;
    }
     public void inserthak_akses(String isi){
    this.hak_akses.add(isi);
    }
     public ArrayList<String> getdatasethak_akses(){
        return this.hak_akses;
    }
    
       
    
}
