/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Rini Melani R
 */
public class MyPhone {
  static boolean isclosed = false;
  static String answer;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    PhoneUser rudi;

    System.out.println("Pilih Handphone : [samsung/xiaomi]");
    String a = in.next();

    if(a.equalsIgnoreCase("samsung")) {
      Phone Note9 = new Samsung();
      rudi = new PhoneUser(Note9);
    } else {
      Phone redmi = new Xiaomi();
      rudi = new PhoneUser(redmi);
    }
    
    while (!isclosed) {
      System.out.println("--- Main Menu ---");
      System.out.println("1. Nyalakan Handphone");
      System.out.println("2. Matikan Handphone");
      System.out.println("3. Perbesar Volume");
      System.out.println("4. Kecilkan Volume");
      System.out.println("5. Keluar Program");
      System.out.println("-------------------------------");
      System.out.print(" Pilih Menu ");
      answer = in.next();
      switch (answer) {
      case "1":
        rudi.turnOn();
        break;
      case "2":
        rudi.turnOff();
        break;
      case "3":
        rudi.makeFullVolume();
        break;
      case "4":
        rudi.makeSilentVolume();
        break;
      case "5":
        isclosed = true;
        break;
      default:
        System.out.println("Wrong Input Number");
      }
    }
  }
}