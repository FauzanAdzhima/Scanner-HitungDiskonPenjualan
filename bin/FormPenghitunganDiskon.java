/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerdaspro;

//import Scanner ke dalam program
import java.util.Scanner;

/**
 *
 * @author Can't_Change
 */
public class FormPenghitunganDiskon {
    public static void main(String[] args) {
        //deklarasi variabel
        String nama;
        int harga, jumlah, total, bayar;
        
        //membuat Scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        //Menampilkan output ke user
        System.out.println("~~~ Toko Tukang Coding ~~~");
        System.out.println("Nama Barang : ");
        
        //menggunakan Scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        
        //Menampilkan output kembali
        System.out.print("Harga per satuan : Rp. ");
        
        //Kembali menggunakan Scanner
        harga = keyboard.nextInt();
        
        System.out.print("Jumlah barang : ");
        jumlah = keyboard.nextInt();
        
        total = harga*jumlah;
        
        if((total >= 100000)&&(total <= 199999)){
            bayar = total - 20000;
        }else if((total >= 200000)&&(total <= 499999)){
            bayar = total - 50000;
        }else if(total >= 500000){
            bayar = total - 90000; 
        }else{
            bayar = total;
        }
        
        //Menampilkan semua yang sudah disimpan di variabel 
        System.out.println("--------------------------------");
        System.out.println("Nama Barang : " + nama);
        System.out.println("Harga Per Satuan : Rp. " + harga);
        System.out.println("Jumlah Barang : " + jumlah);
        System.out.println("Total Harga : Rp. " + total);
        System.out.println("Potongan Harga / Diskon : Rp. " + (bayar-total));
        System.out.println("Total Bayar : Rp. " + bayar);
    }
    
}
