/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan46.tandanyakamu;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author asus
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : IF-2
 * NIM      : 10118069
 * Deskripsi Program : tandanya kamu
 */
public class PBO2_10118069_Latihan46_TandanyaKamu {
    private static int yearNow;
    public static int umur;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        yearNow = Calendar.getInstance().get(Calendar.YEAR);
        Age age = new Age(yearNow);
        System.out.print("Masukan Tahun Lahir Anda : ");
        age.setYearBirth(scanner.nextInt());
        umur = age.hitungUmur();
        System.out.println("\n===== Hasil Perhitungan Umur =====");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth());
        System.out.println("Hari ini Tahun   : " + age.getYearNow());
        System.out.println("Umur kamu sampai saat ini adalah " + umur + " tahun");
        System.out.println("Tandanya Kamu    : " + age.tandanyaKamu(umur));   
        
        
    }
}
