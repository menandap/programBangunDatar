package projectUts;

// pembuatan abstract class(Abstract)
abstract class BangunDatar {
    // private pada var untuk mengenkapsulasi(Encapsulation)
    private String namaBangunDatar;
    private int banyakSudut;
    private int banyakSisi;
    private int simetriLipat;
    private int simetriPutar;

    // pembuatan constructor
    BangunDatar(String namaBangunDatar, int banyakSudut, int banyakSisi,int simetriLipat, int simetriPutar){
        this.namaBangunDatar = namaBangunDatar;
        this.banyakSudut = banyakSudut;
        this.banyakSisi = banyakSisi;
        this.simetriLipat = simetriLipat;
        this.simetriPutar = simetriPutar;
    }

    // pembuatan setter dan getter agar var namaBangunDatar bisa diakses di subclass(Encapsulation)
    public String getNama(){
        return this.namaBangunDatar;
    }
    public void setNama(String namaBangunDatar){
        this.namaBangunDatar = namaBangunDatar;
    }

    // pembuatan setter dan getter agar var banyakSudut bisa diakses di subclass(Encapsulation)
    public int getSudut(){
        return this.banyakSudut;
    }
    public void setSudut(int banyakSudut){
        this.banyakSudut = banyakSudut;
    }

    // pembuatan setter dan getter agar var banyakSisi bisa diakses di subclass(Encapsulation)
    public int getSisi(){
        return this.banyakSisi;
    }
    public void setSisi(int banyakSisi){
        this.banyakSisi = banyakSisi;
    }

    // pembuatan setter dan getter agar var simetriLipat bisa diakses di subclass(Encapsulation)
    public int getSLipat(){
        return this.simetriLipat;
    }
    public void setSLipat(int simetriLipat){
        this.simetriLipat = simetriLipat;
    }

    // pembuatan setter dan getter agar var simetriPutar bisa diakses di subclass(Encapsulation)
    public int getSPutar(){
        return this.simetriPutar;
    }
    public void setSPutar(int simetriPutar){
        this.simetriPutar = simetriPutar;
    }

    // pembuatan abstract method(Abstract)
    abstract void memilikiSimetriLipat();
    abstract void memilikiSimetriPutar();

}


