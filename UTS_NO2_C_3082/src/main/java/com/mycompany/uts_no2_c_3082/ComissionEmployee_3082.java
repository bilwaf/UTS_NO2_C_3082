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

public class ComissionEmployee_3082 extends Employee_3082 {
    private double gajiPokok_3082, komisi_3082, totalPenjualan_3082;

    public ComissionEmployee_3082(double gajiPokok_3082, double komisi_3082, double totalPenjualan_3082, String nama_3082, String nip_3082, int gaji_3082) {
        super(nama_3082, nip_3082, gaji_3082);
        this.gajiPokok_3082 = gajiPokok_3082;
        this.komisi_3082 = komisi_3082;
        this.totalPenjualan_3082 = totalPenjualan_3082;
    }
    
    public double hitungGaji()
    {
        gaji_3082 = (gajiPokok_3082 + (komisi_3082 * totalPenjualan_3082));
        return gaji_3082;
    }
    
    public void cetakComission_3082()
    {
        super.cetakEmployee_3082();
        System.out.println("Total Gaji          : " + gaji_3082);
    }
    
    
}
