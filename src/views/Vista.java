package views;

import model.Wallet;

public class Vista {
   public static void main(String[] args) {
      Wallet wallet1 = new Wallet();
      System.out.println(wallet1.getSaldo()); 
   } 
}
