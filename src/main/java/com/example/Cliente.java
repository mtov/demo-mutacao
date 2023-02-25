package com.example;

public class Cliente {
    public boolean isVIP (double saldo) {
      if (saldo > 10000) {
         return true;
      }  
      return false;
  }
}
