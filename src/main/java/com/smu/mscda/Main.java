package com.smu.mscda;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("This program will capitalize the input string and generate MD5 hex");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string in lower case:");
        String inputString = scanner.nextLine();

        // Capitalize the first letter and keep the rest in lowercase
        String capitalizedString = StringUtils.capitalize(inputString);

        // Generate MD5 hex for the entire string
        String md5Hex = DigestUtils.md5Hex(inputString);

        System.out.println("Capitalized String: " + capitalizedString);
        System.out.println("MD5 Hex: " + md5Hex);

    }
}