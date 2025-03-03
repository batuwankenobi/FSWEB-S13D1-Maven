package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Test cases for shouldWakeUp
        System.out.println(shouldWakeUp(true, 1));   // true
        System.out.println(shouldWakeUp(false, 2)); // false
        System.out.println(shouldWakeUp(true, 8));   // false
        System.out.println(shouldWakeUp(true, -1));  // false

        // Test cases for hasTeen
        System.out.println(hasTeen(9, 99, 19)); // true
        System.out.println(hasTeen(23, 15, 42)); // true
        System.out.println(hasTeen(22, 23, 34)); // false

        // Test cases for isCatPlaying
        System.out.println(isCatPlaying(true, 10));  // false
        System.out.println(isCatPlaying(false, 36)); // false
        System.out.println(isCatPlaying(false, 35)); // true

        // Test cases for area (rectangle)
        System.out.println(area(5.0, 4.0));  // 20.0
        System.out.println(area(-1.0, 4.0)); // -1

        // Test cases for area (circle)
        System.out.println(area(5.0));  // 78.53975
        System.out.println(area(-1));    // -1
    }

    // Köpeğin havlamasına göre uyanma durumu
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) { // Geçersiz saat kontrolü
            return false;
        }
        return isBarking && (clock < 8 || clock >= 20); // Gece 8-8 arası havlayınca true
    }

    // 13-19 yaş aralığı kontrolü
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge);
    }

    private static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    // Kedinin oyun oynama durumu
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit = isSummer ? 45 : 35; // Yaz mevsimi ise üst limit 45, değilse 35
        return temp >= 25 && temp <= upperLimit;
    }

    // Dikdörtgen alan hesaplama
    public static double area(double width, double height) {
        if (width < 0 || height < 0) { // Negatif değer kontrolü
            return -1;
        }
        return width * height;
    }

    // Daire alan hesaplama
    public static double area(double radius) {
        if (radius < 0) { // Negatif değer kontrolü
            return -1;
        }
        return radius * radius * Math.PI; // Math.PI kullanarak daire alanı hesaplama
    }
}