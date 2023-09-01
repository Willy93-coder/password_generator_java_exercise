package com.example;

public class PasswordGenerator {
    // Atributos
    private int passwordLenght;
    private int passwordQuantity;
    private String[] passwordArr;

    // Constructores
    public PasswordGenerator(String passwordLenght, String passwordQuantity) {
        this.passwordLenght = Integer.parseInt(passwordLenght);
        this.passwordQuantity = Integer.parseInt(passwordQuantity);
        this.passwordArr = new String[this.passwordQuantity];
    }

    public void getPasswordGenerated() {
        System.out.println("Passwords generadas:");
        for (String password : passwordArr) {
            System.out.println(password);
        }
    }

    public void getPasswordLenght() {
        System.out.println("Passwords longitud:");
        for (String password : passwordArr) {
            System.out.println(password.length());
        }
    }

    public void showPasswords() {
        insertArray();
        for (String password : passwordArr) {
            System.out.println(password);
        }
    }

    // Metodos
    public String passwordGeneration() {

        String password = "";

        for (int j = 0; j < passwordLenght; j++) {
            int mayusMinus = ((int) (Math.random() * 3 + 1));
            if (mayusMinus == 1) {
                char minus = (char) (Math.random() * (123 - 97) + 97);
                password += minus;
            } else if (mayusMinus == 2) {
                char minus = (char) (Math.random() * (91 - 65) + 65);
                password += minus;
            } else {
                char minus = (char) (Math.random() * (58 - 48) + 48);
                password += minus;
            }
        }

        return password;
    }

    public void isSecureOrWeak() {
        int numMayus = 0;
        int numMinus = 0;
        int numNums = 0;
        for (String password : passwordArr) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(i)) {
                    numMayus += 1;
                } else if (Character.isLowerCase(i)) {
                    numMinus += 1;
                } else {
                    numNums += 1;
                }
            }
            if (numMayus >=2 && numMinus >= 1 && numNums >= 5) {
                System.out.println("La contraseña es segura!!");
            } else {
                System.out.println("La contraseña es debil...");
            }
        }
    }

    @Override
    public String toString() {
        return "PasswordGenerator:\npasswordLenght: " + passwordLenght + "\npasswordQuantity: " + passwordQuantity
                + "\npasswordArrLenght: " + passwordArr.length;
    }

    private void insertArray() {
        for (int i = 0; i < passwordArr.length; i++) {
            passwordArr[i] = passwordGeneration();
        }
    }
}
