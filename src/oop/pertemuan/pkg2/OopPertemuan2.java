/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.pertemuan.pkg2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class OopPertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama = "Wahyu Putra";
        String nim = "12345678";
        double ipk = 4.00;
        String input;
        
        BufferedReader NamaInput = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader NIMInput = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader IPKInput = new BufferedReader(new InputStreamReader(System.in));

        
        
        System.out.print("Input nama anda: ");
        try{
            nama = NamaInput.readLine();
        }catch(IOException e){
            System.out.println("error");
        }
        
        
        System.out.print("Input NIM anda: ");
        try{
            nim = NIMInput.readLine();
        }catch(IOException e){
            System.out.println("error");
        }
        
        System.out.print("Input IPK anda: ");
        try{
            ipk = Double.parseDouble(IPKInput.readLine());
        }catch(IOException e){
            System.out.println("error");
        }
        
        
        System.out.println("Nama saya: "+nama);
        System.out.println("NIM : "+nim);
        
        System.out.printf("Nama saya %s dengan NM %s dengan IPK %.2f", nama, nim, ipk);
        
    }
    
}
