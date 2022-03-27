package com.company;

// Peminjam
class Peminjam{
    String nama;
    String jurusan;
    int angkatan;
    Universitas universitas;


//method
void pengajuan(Universitas universitas ){
    this.universitas = universitas;
}


    //constructor
    Peminjam(String nama,String jurusan, int angkatan){
    this.nama = nama;
    this.jurusan = jurusan;
    this.angkatan = angkatan;
    }

    void detailpeminjam(){
        System.out.println("Nama Peminjam : " + nama);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Angakatan : " + angkatan);
        universitas.detailUniversitas();
        System.out.println("Mengajukan Surat Bebas Perpustakaan");
    }
}

class Universitas{
    String namaUniversitas;

    //constructor
    Universitas(String namaUniversitas) {
        this.namaUniversitas = namaUniversitas;
    }
        //method
       void detailUniversitas(){
            System.out.println("Nama Universitas :" + namaUniversitas);
        }
    }


public class Main {

    public static void main(String[] args) {
	Peminjam Jokoo = new Peminjam("Jokoo","Teknik Informatika",20);
    Universitas Unila = new Universitas("Universitas Lampung");
    Jokoo.pengajuan(Unila);
    Jokoo.detailpeminjam();
    }
}
