
package w04_encapsulation;

/**
 *
 * Arvilanti Devani
 */
public class MainKinetic {
    
    public String kecepatan, massa;

    public String getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(String kecepatan) {
        this.kecepatan = kecepatan;
    }

    public String getMassa() {
        return massa;
    }

    public double HitungMainKinetic(){
        return 20 * 0.5 * Math.pow(2, 2);
    }
    public void setMassa(String massa) {
        this.massa = massa;
    }
    
    public static void main(String[] args) {
        MainKinetic mainkinetic = new MainKinetic();
        mainkinetic.setKecepatan("2");
        mainkinetic.setMassa("20");
        
        System.out.println (mainkinetic.HitungMainKinetic()+ " N");
    
    }
}
