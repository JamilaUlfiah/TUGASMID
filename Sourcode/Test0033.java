/*Nama : Jamila Ulfiah*/
/*NIM  : 13020210033*/

public class Test0033 {
    public static void main(String[] args) {
        // (a)
        Balok balok1 = new Balok();
        
        // (b)
        Balok balok2 = new Balok(20, 35, 15);
        
        // (c)
        balok1.setL(5);
        
        // (d)
        balok1.setP(25);
        
        // (e)
        balok1.setT(10);
        
        // (f)
        balok1.info();
        
        // (g)
        balok2.info();
    }
}

// class Balok
class Balok extends PersegiPanjang {
    private int t;
    
    // (h)
    public Balok() {
        super(); // memanggil constructor superclass
        
        // inisialisasi variabel t dengan nilai 15
        this.t = 15;
    }
    
    // (i)
    public Balok(int p, int l, int t) {
        super(p, l); // memanggil constructor superclass
        
        // inisialisasi variabel t dengan nilai yang diberikan
        this.t = t;
    }
    
    // (j) buat getter setter class balok
    public int getT() {
        return t;
    }
    
    public void setT(int t) {
        this.t = t;
    }
    
    public int volume() {
        // (k) fungsi untuk menghitung volume balok : p x l x t
        return this.getP() * this.getL() * this.t;
    }
    
    public void info() {
        // (l) fungsi untuk tampil nilai panjang, lebar, tinggi, Luas, dan volume balok
        System.out.println("Panjang Balok: " + this.getP());
        System.out.println("Lebar Balok: " + this.getL());
        System.out.println("Tinggi Balok: " + this.t);
        System.out.println("Luas Permukaan Balok: " + this.luas());
        System.out.println("Volume Balok: " + this.volume());
    }
}

// class PersegiPanjang
class PersegiPanjang {
    private int p, l;
    
    // (m)
    public PersegiPanjang() {
        // inisialisasi variabel p dan l dengan nilai 30 dan 20
        this.p = 30;
        this.l = 20;
    }
    
    // (n)
    public PersegiPanjang(int p, int l) {
        // inisialisasi variabel p dan l dengan nilai yang diberikan
        this.p = p;
        this.l = l;
    }
    
    // (o) buat getter setter class Persegi Panjang
    public int getP() {
        return p;
    }
    
    public void setP(int p) {
        this.p = p;
    }
    
    public int getL() {
        return l;
    }
    
    public void setL(int l) {
        this.l = l;
    }
    
    public int luas() {
        // (q) fungsi untuk menghitung luas persegi panjang : p x l
        return this.p * this.l;
    }
    
    public int keliling() {
        // (r) fungsi untuk menghitung keliling persegi panjang : 2x (p+l)
        return 2 *
