/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_c_3082;

/**
 *
 * @author ASUS ZenBook
 * 21103082
 * NABILA WAFAA' Y
 * S1SI05C
 */

public class UTS_NO2_C_3082 {

    public static void main(String[] args) {
        SalariedEmployee_3082 salaried = new SalariedEmployee_3082("Langit", "21090", 8000000);
        ComissionEmployee_3082 commission = new ComissionEmployee_3082(10000000, 500000, 2000000, "Laut", "3408308", 0);
        ProjectPlanner_3082 projectplanner = new ProjectPlanner_3082(10000000, 2000000, 25000000, "Sungai", "100289", 0);
        
        salaried.cetakSalaried_3082();
        commission.hitungGaji();
        commission.cetakComission_3082();
        projectplanner.hitungGajiProjectPlanner_3082();
        projectplanner.cetakProjectPlanner_3082();
    }
}
