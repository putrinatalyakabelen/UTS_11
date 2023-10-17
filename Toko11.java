import java.util.Scanner;

public class Toko11 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nama Anda : ");
    String nama = input.nextLine();
    System.out.print("Apakah pelanggan member? (y/t): ");
    String member = input.nextLine();

    boolean isContinue = true;
    double totalHarga = 0;
    double totalDiskon = 0;
    int totalItem = 0;

    while (isContinue) {
      System.out.print("Masukkan produk yang anda beli : ");
      String produk = input.nextLine();
      System.out.print("Banyaknya : ");
      int kuantitas = Integer.parseInt(input.nextLine());
      System.out.print("Harga: ");
      double harga = Double.parseDouble(input.nextLine());
      System.out.print("Diskon : ");
      double diskon = Double.parseDouble(input.nextLine());

      
      
      double hargaProduk = harga * kuantitas * (1 - diskon / 100);

      
      totalHarga += hargaProduk;

    
      totalDiskon += hargaProduk * diskon / 100;

     
      totalItem += kuantitas;

     
      System.out.print("Apakah anda mau menambahkan produk? (y/t): ");
      isContinue = input.nextLine().equals("y");
    }

  
    double diskonMember = 0;
    if (member.equals("y") && totalHarga >= 200000) {
      diskonMember = 0.1;
    } else if (member.equals("y")) {
      diskonMember = 0.05;
    }


    double totalDiskonMember = totalHarga * diskonMember / 100;

    
    double totalAkhir = totalHarga - totalDiskon - totalDiskonMember;


    System.out.println("Nama pelanggan: " + nama);
    System.out.println("Tipe: " + (member.equals("y") ? "Member" : "Non-member"));
    System.out.println("Total item: " + totalItem);
    System.out.println("Total harga sebelum diskon: " + totalHarga);
    System.out.println("Total diskon: " + totalDiskon);
    System.out.println("Total diskon member: " + totalDiskonMember);
    System.out.println("Total akhir yang harus dibayar: " + totalAkhir);
}
}
