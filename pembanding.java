/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekpertama;

/**
 *
 * @author user
 */
public class pembanding {
    public static void main(String[] args){
        
        //latihan menggunakan pembanding interger
        
           int age = 36;
           
            boolean hasilBandingSatu = age < 21;
            boolean hasilBandingDua = age != 22;
            
            System.out.println("age == 22");
            System.out.println("Hasil Banding age < 21 : \" + hasilBandingSatu");
            System.out.println("Hasil Banding age != 22 : \" + hasilBandingDua");
            
            //latihan menggunakan pembanding String
            
        String kata1, kata2;
        kata1 = "Cahyo";
        kata2 = "cahyo";
         System.out.println("equals; apakah kataSatu =Cahyo  sama dengan kataDua = cahyo?");
        
    }
    
}
