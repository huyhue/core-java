package QLSoThu;
public abstract class Animal {
    String ten;
    int tuoi;
    String moTa;
    
    void xemThongTin(){
        System.out.println("Ten: "+ten);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("Mo Ta: "+moTa);
    }
    
    abstract void tiengKeu();

    public Animal() {
    }
    
    public Animal(String ten) {
		super();
		this.ten = ten;
	}

    public Animal(String ten, int tuoi) {
          super();
          this.ten = ten;
          this.tuoi = tuoi;
    }
    
    public Animal(String ten, int tuoi, String moTa) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.moTa = moTa;
	}
	
	void Add() {
	}
	
	void Add(String ten) {
		this.ten= ten;
	}
	
	void Add(String ten, int tuoi) {
		this.ten= ten;
		this.tuoi = tuoi;
	}
	
	void Add(String ten, int tuoi, String moTa) {
		this.ten= ten;
		this.tuoi = tuoi;
		this.moTa = moTa;
	}
}
