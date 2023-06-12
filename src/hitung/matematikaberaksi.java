/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung;

public class matematikaberaksi {
    public static void main(String[] args){
        //membuat objek
        matematika bila = new matematika(0,9);
        
        System.out.println("Hasil Penjumlahan  :"  +bila.setpenjumlahan());
        System.out.println("Hasil Pengurangan  :"  +bila.setpengurangan());
        System.out.println("Hasil Perkalian  :"  +bila.setperkalian());
        System.out.println("Hasil Pembagian  :"  +bila.setpembagian());
         
    }
}
