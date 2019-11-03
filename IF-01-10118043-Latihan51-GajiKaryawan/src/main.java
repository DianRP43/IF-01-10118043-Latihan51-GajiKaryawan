
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager m = new Manager();
        Scanner input = new Scanner(System.in);
        // TODO code application logic here        
        String nik, nama,jabatan;
        int  golongan,kehadiran;
        System.out.println("Program Perhitungan Gaji Karyawan");
        System.out.print("Masukan NIK\t\t\t: ");
            nik = input.nextLine(); m.setNik(nik);
        System.out.print("Masukan Jabatan (Manager/Kabag) : ");    
            jabatan = input.nextLine(); m.setJabatan(jabatan);
        System.out.print("Masukan Nama\t\t\t: ");
            nama = input.nextLine(); m.setNama(nama);
        System.out.print("Masukan Golongan (1/2/3)\t: ");
            golongan = input.nextInt(); m.setGolongan(golongan);        
        System.out.print("Masukan Jumlah kehadiran\t: ");
            kehadiran = input.nextInt(); m.setKehadiran(kehadiran);
        System.out.println("");
            
        System.out.println("Hasil");
        System.out.println("NIK\t: "+m.getNik());
        System.out.println("NAMA\t: "+m.getNama());
        System.out.println("GOLONGAN: "+m.getGolongan());
        System.out.println("JABATAN\t: "+m.getJabatan());
        
        System.out.println("TUNJANGAN GOLONGAN\t\t: "+m.tunjanganGolongan(golongan));
        System.out.println("TUNJANGAN JABATAN\t\t: "+m.tunjanganJabatan(jabatan));
        System.out.println("TUNJANGAN KEHADIRAN\t\t: "+m.tunjanganKehadiran(kehadiran)+"\n");
        
        System.out.println("GAJI TOTAL\t\t\t: "+m.gajiTotal());
        
    }
    
}
