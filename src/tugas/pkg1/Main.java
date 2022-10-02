/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg1;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author willi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        SingleObject object = SingleObject.getInstance();
        AccountView view = new AccountView();
        Account model = data();
        NameDaompl nameDao = new NameDaompl();
        AccountController control = new AccountController(model,view);
        int balance=500000;
        int tarik_tunai;
        int saldo_minim;
        int setor_tunai;
        saldo_minim=100000;
        char ulang;
        while(true){
        
        System.out.println("Selamat Datang Di ATM Apa Adanya");
        Name id1 = nameDao.getName(0);
        Name id2 = nameDao.getName(1);
        System.out.println("Nama \t\t: " +id1.getName());
        System.out.println("No Rekening \t: " +id2.getName());
        System.out.println("Menu Utama \t:");
        System.out.println("\t 1. Cek Saldo");
        System.out.println("\t 2. Tarik Tunai");
        System.out.println("\t 3. Setor Tunai");
        System.out.println("\t 4. Keluar");
        System.out.println("Silahkan Masukan Pilihan :");
        int main_menu = input.nextInt();
        
        switch(main_menu)
        {
            case 1 :
              System.out.println("Cek Saldo Rekening");
              object.show(balance);         
              System.out.println("Silahkan Tekan Enter Untuk Melanjutkan");
              break;
            case 2 :
                System.out.println("Tarik Tunai");
                System.out.println("Silahkan Masukan Nominal Yang Diinginkan :");
                tarik_tunai = input.nextInt();
             
                if(tarik_tunai>=balance || balance-tarik_tunai <saldo_minim)
                {
                    Name id5 = nameDao.getName(4);
                    System.out.println("" +id5.getName());
                    object.show(balance);
                    System.out.println("Silahkan Tekan Enter Untuk Melanjutkan");
                }
                else if (tarik_tunai%50000==0 && balance-tarik_tunai>=saldo_minim)
                {
                    Name id4 = nameDao.getName(3);
                    System.out.println("" +id4.getName());
                    System.out.println("Saldo Terpotong Rp." +tarik_tunai);
                    balance= balance-tarik_tunai;
                    control.setAccountBalance(balance);
                    control.updateView();
                    System.out.println("Silahkan Tekan Enter Untuk Melanjutkan");
                }
                else if (tarik_tunai%100000==0 && balance-tarik_tunai>=saldo_minim)
                {
                    Name id4 = nameDao.getName(3);
                    System.out.println("" +id4.getName());
                    System.out.println("Saldo Terpotong Rp." +tarik_tunai);
                    balance= balance-tarik_tunai;
                    control.setAccountBalance(balance);
                    control.updateView();
                    System.out.println("Silahkan Tekan Enter Untuk Melanjutkan");
                }
                else if(tarik_tunai%100000 != 0 && tarik_tunai%50000 != 0)
                {
                    Name id3 = nameDao.getName(2);
                    System.out.println("" +id3.getName());
                    Name id7 = nameDao.getName(6);
                    System.out.println("" +id7.getName());
                    object.show(balance);
                    System.out.println("Silahkan Tekan Enter Untuk Melanjutkan");
                }
                else
                {
                    System.out.println("Error!");
                    
                }
                break;
            case 3 :
                System.out.println("Tarik Tunai");
                System.out.println("Silahkan Masukan Nominal Yang Diinginkan :");
                setor_tunai = input.nextInt();
               
                 if (setor_tunai%50000==0)
                {
                    Name id4 = nameDao.getName(3);
                    System.out.println("" +id4.getName());
                    System.out.println("Saldo Bertambah Rp." +setor_tunai);
                    balance= balance+setor_tunai;
                    control.setAccountBalance(balance);
                    control.updateView();
                    System.out.println("Silahkan Tekan Enter Untuk Melanjutkan");
             
                }
                else if (setor_tunai%100000==0)
                {
                    Name id4 = nameDao.getName(3);
                    System.out.println("" +id4.getName());
                    System.out.println("Saldo Bertambah Rp." +setor_tunai);
                    balance= balance+setor_tunai;
                    control.setAccountBalance(balance);
                    control.updateView();
                    System.out.println("Silahkan Tekan Enter Untuk Melanjutkan");
                }
                else
                {
                    Name id3 = nameDao.getName(2);
                    Name id7 = nameDao.getName(6);
                    System.out.println("" +id3.getName());
                    System.out.println("" +id7.getName());
                    object.show(balance);
                    System.out.println("Silahkan Tekan Enter Untuk Melanjutkan");
                }
                break;
            case 4 :
            {
               System.exit(0);
            }
             
        }
         
        char ch = (char) System.in.read();
        
        }
        
    }   
    private static Account data()
        {
            
            Account acc = new Account();
            acc.setNominal(0);
            return acc;
        }
}
