/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Menu;
import data.user;
import java.util.Scanner;

/**
 *
 * @author dr. Yoe
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        user saya = new user();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan User Name :");
        user.inputUser_name(input.nextLine());
        System.out.print("Masukan Id user :");
        saya.inputId_user(input.nextLine());
        System.out.print("Masukan Password :");
        saya.inputPassword(input.nextLine());
        System.out.print("Masukan Nama_lengkap :");
        saya.inputNama_lengkap(input.nextLine());
        System.out.print("Masukan jenis kelamin :");
        saya.inputjk(input.nextLine());
        System.out.print("Masukan alamat :");
        saya.inputAlamat(input.nextLine());
        System.out.print("Masukan telepon :");
        saya.inputTelp(input.nextLine());
        System.out.print("Masukan tanggal lahir :");
        saya.inputtgl_lahir(input.nextLine());
             
        
       if(saya.getStatus().equals("Menikah")){
           System.out.print("Masukan Jumlah Anak Pegawai :");
           saya.inputJumlahAnak(input.nextInt());
       }else{
           saya.inputJumlahAnak(0);
       }
       
       System.out.print("Masukan Masa Kerja Pegawai :");
       saya.inputMasaKerja(input.nextInt());
       System.out.println("======================================");
       System.out.println("Gaji Total Diterima : "+saya.gajiTotal());
    }

    
}
