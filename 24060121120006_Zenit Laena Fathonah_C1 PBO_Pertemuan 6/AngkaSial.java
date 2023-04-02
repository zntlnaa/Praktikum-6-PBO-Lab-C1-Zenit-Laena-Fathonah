/**
* File : AngkaSial.java
* Tanggal : 30/03/2023
* Nama : Zenit Laena Fathonah
* Deskripsi : Program penggunaan exception buatan sendiri
*	      Pengenalan klause 'throw' dan 'throws'
**/

public class AngkaSial{
	public void cobaAngka(int angka) throws AngkaSialException{
		if (angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka !!!");
		}		
	}	
}

//Pertanyaan :
//*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
//*Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
//Jawaban :
//*Ketika eksepsi terjadi pada angka 13, maka baris 12 tidak akan dieksekusi dan langsung beralih ke baris 21 untuk mengatasi AngkaSialException
//*Baris 21 akan dieksekusi ketika terjadi AngkaSialException pada baris 17. catch berfungsi mengambil program yang akan melemparkan kesalahaan ke AngkaSialException