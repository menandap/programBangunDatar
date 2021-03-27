package projectUts;

// pembuatan subclass(Inheritance)
public class JajarGenjang extends BangunDatar{
    // pembuatan super constructor
    JajarGenjang(String namaBangunDatar, int banyakSudut, int banyakSisi,int simetriLipat, int simetriPutar) {
        super(namaBangunDatar,banyakSudut, banyakSisi,simetriLipat, simetriPutar);
    }

    // pembuatan method overriding(Polymorphism)
    void memilikiSimetriLipat(){
        System.out.println(getNama() + " tidak memiliki simetri lipat");
    }
    void memilikiSimetriPutar() {
        System.out.println(getNama() + " memiliki simetri putar");
    }

    // pembuatan method yang akan di panggil di main
    void display(){
        System.out.println("\tNama bangun\t\t: " + getNama()); //memanggil var enkapsulasi dengan getter
        System.out.println("\tMemiliki sudut\t: " + getSudut()); //memanggil var enkapsulasi dengan getter
        System.out.println("\tMemiliki sisi\t: " + getSisi()); //memanggil var enkapsulasi dengan getter
        System.out.print("\t");
        memilikiSimetriLipat(); //memanggil method yang masih dalam satu classs
        System.out.print("\t");
        memilikiSimetriPutar(); //memanggil method yang masih dalam satu classs
        System.out.println("\tYaitu sebanyak\t: " + getSPutar()); //memanggil var enkapsulasi dengan getter
    }
}
