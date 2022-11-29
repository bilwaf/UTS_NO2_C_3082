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

public class SalariedEmployee_3082 extends Employee_3082 {
    private double upahMingguan_3082;

    public SalariedEmployee_3082(String nama_3082, String nip_3082, int gaji_3082) {
        super(nama_3082, nip_3082, gaji_3082);
        this.upahMingguan_3082 = super.gaji_3082;
    }
    
    public void cetakSalaried_3082()
    {
        System.out.println("Upah Mingguan           : " + upahMingguan_3082); 
    }
}
