package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ClienteTest {
    
    @Test
    public void teste() {
      Cliente cliente = new Cliente();
      assertTrue(cliente.isVIP(15000));
    }
}
