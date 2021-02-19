/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if10k.pkg10119902.muhammadnurkholiq.no1;

import java.util.Scanner;

/**
 *
 * @author korik
 * Nama = Muhammad Nurkholiq
 * Kelas = IF10K    
 * Tanggal = 19-Februari-2021
 * Nomer Soal = 1
 * 
 */
public class UASIF10K10119902MUHAMMADNURKHOLIQNO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        char grade ;
        final double n_akhir;
        float nilai;
        System.out.println("===== Menghitung Nilai Mahasiswa=====\n");
        System.out.print("Masukkan Nilai Akhir Anda : ");
        nilai = input.nextFloat();
        n_akhir = (nilai);
        if (n_akhir >= 80 && n_akhir <=100){
            grade = 'A';
        }
        else if (n_akhir > 68 && n_akhir < 80){
            grade = 'B';
        }
        else if (n_akhir > 56 && n_akhir < 68){
            grade = 'C';
        }
        else if (n_akhir > 45 && n_akhir < 56){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        String total;
            System.out.println("Masukkan Nilai Akhir Anda : "+nilai);
            System.out.println("Index Anda adalah "+grade);
       

    }
}

