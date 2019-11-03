/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan ;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    public float tunjanganKehadiran(int hadir){
        return hadir * 10000;
    }
    public float tunjanganJabatan(String jabatan){
        switch (jabatan.toUpperCase()) {
            case "MANAGER":
                return 2000000;
            case "KARYAWAN":
                return 1000000;
            default:
                return 0;
        }
    }
    public float tunjanganGolongan(int golongab){
        switch (golongab) {
            case 1:
                return 500000;
            case 2:
                return 1000000;
            case 3:
                return 1500000;
            default:
                return 0;
        }
    }
    public float gajiTotal(){
        return tunjanganGolongan(golongan)+tunjanganJabatan(jabatan)+tunjanganKehadiran(kehadiran);
    }

    void setNik(int nik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
