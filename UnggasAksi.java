/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo01;

/**
 *
 * @author Asus
 */
public class UnggasAksi {
    public static void main(String[] args) {
        unggas Ayam = new unggas();
            Ayam.bentuk_cakar="cakar kecil";
                Ayam.bentuk_paruh="runcing kecil";
                    Ayam.panjang_bulu="2 cm";
                Ayam.ukuran_tubuh="kecil";
            Ayam.warna_bulu="hitam merah";
        
        Ayam.cetakinfo();
   
        unggas Elang = new unggas();      
            Elang.bentuk_cakar="cakar panjang";
                Elang.bentuk_paruh="runcing sedang";
                    Elang.panjang_bulu="3 cm";
                Elang.ukuran_tubuh="sedang";
            Elang.warna_bulu="hitam coklat";
  
         Elang.cetakinfo();
         
        unggas Angsa = new unggas();
            Angsa.bentuk_cakar="cakar kecil";
                Angsa.bentuk_paruh="tumpul besar";
                    Angsa.panjang_bulu="4 cm";
                Angsa.ukuran_tubuh="besar";
            Angsa.warna_bulu="putih";
        Angsa.cetakinfo();
    }
}
