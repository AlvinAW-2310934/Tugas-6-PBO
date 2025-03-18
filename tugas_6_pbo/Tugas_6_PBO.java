package com.mycompany.tugas_6_pbo;

/**
 *
 * @author alvin
 */
public class Tugas_6_PBO {
    public static void main(String[] args) {
        
        
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        
        System.out.println("Luas persegiPanjang1: " + persegiPanjang1.getLuas());
        System.out.println("Keliling persegiPanjang1: " + persegiPanjang1.getKeliling());

        
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);
        
        System.out.println("\nLuas persegiPanjang2: " + persegiPanjang2.getLuas());
        System.out.println("Keliling persegiPanjang2: " + persegiPanjang2.getKeliling());

        
        PersegiPanjang persegiPanjang3 = new PersegiPanjang();
        
        persegiPanjang3.setPanjang(25);
        persegiPanjang3.setLebar(35);
        
        System.out.println("\nLuas persegiPanjang3: " + persegiPanjang3.getLuas());
        System.out.println("Keliling persegiPanjang3: " + persegiPanjang3.getKeliling());
    }
}