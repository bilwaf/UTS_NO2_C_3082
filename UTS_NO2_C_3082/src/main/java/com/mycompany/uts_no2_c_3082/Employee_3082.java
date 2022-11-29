/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3082;

/**
 *
 * @author ASUS ZenBook
 * 21103082
 * NABILA WAFAA' Y
 * S1SI05C
 */

public class Employee_3082 {
    protected String nama_3082;
    protected String nip_3082;
    protected double gaji_3082;

    public Employee_3082() {
    }

    public Employee_3082(String nama_3082, String nip_3082, int gaji_3082) {
        this.nama_3082 = nama_3082;
        this.nip_3082 = nip_3082;
        this.gaji_3082 = gaji_3082;
    }
    
    public void cetakEmployee_3082()
    {
        System.out.println("=== DATA KARYAWAN ===");
        System.out.println("Nama Karyawan           : " + nama_3082);
        System.out.println("NIP Karyawan            : " + nip_3082);
    }
    
}
