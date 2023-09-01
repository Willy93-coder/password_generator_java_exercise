package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String passwordLenght = JOptionPane.showInputDialog("Introduce el tamanio de los passwords:");
        String passwordQuantity = JOptionPane.showInputDialog("Introduce la cantidad de passwords:");

        PasswordGenerator myPasswordGenerator = new PasswordGenerator(passwordLenght, passwordQuantity);
        System.out.println(myPasswordGenerator);

        myPasswordGenerator.passwordGeneration();
        myPasswordGenerator.showPasswords();
        myPasswordGenerator.isSecureOrWeak();
    }
}