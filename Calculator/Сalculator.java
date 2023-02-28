package Calculator;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

class Calculator {
    public static void main(String[] args) {
        System.out.println("Введи строку(число действие число):");
        Scanner Str = new Scanner(System.in);
        String str = Str.nextLine();
        String numbers1[] = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String numbers2[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        Integer num3 = 0, num4 = 0, i = 0;
        if (((str.contains("\s" + "+" + "\s")) | (str.contains("\s" + "-" + "\s")) | (str.contains("\s" + "*" + "\s")) | (str.contains("\s" + "/" + "\s"))) == false) {
            System.out.println("Ошибка ввода выражения");
            return;
        }
        String[] num = str.split("\s");
        String num1 = new String();
        String num2 = new String();
        String znak = new String();
        for (i = 0; i < num.length; i++) {
            num1 = num[0];
            znak = num[1];
            num2 = num[2];
            if (i > 2) {
                System.out.println("Ошибка ввода, превышено количестов действий");
                return;
            }
        }
        if (((Arrays.asList(numbers1).contains(num1))) && (Arrays.asList(numbers1).contains(num2))) {
            switch (num1) {
                case "I":
                    num1.equals("I");
                    num3 = 1;
                    break;
                case "II":
                    num1.equals("II");
                    num3 = 2;
                    break;
                case "III":
                    num1.equals("III");
                    num3 = 3;
                    break;
                case "IV":
                    num1.equals("IV");
                    num3 = 4;
                    break;
                case "V":
                    num1.equals("V");
                    num3 = 5;
                    break;
                case "VI":
                    num1.equals("VI");
                    num3 = 6;
                    break;
                case "VII":
                    num1.equals("VII");
                    num3 = 7;
                    break;
                case "VIII":
                    num1.equals("VIII");
                    num3 = 8;
                    break;
                case "IX":
                    num1.equals("IX");
                    num3 = 9;
                    break;
                case "X":
                    num1.equals("X");
                    num3 = 10;
                    break;
                default:
                    System.out.println("Ошибка ввода первого числа");
            }
            switch (num2) {
                case "I":
                    num2.equals("I");
                    num4 = 1;
                    break;
                case "II":
                    num2.equals("II");
                    num4 = 2;
                    break;
                case "III":
                    num2.equals("III");
                    num4 = 3;
                    break;
                case "IV":
                    num2.equals("IV");
                    num4 = 4;
                    break;
                case "V":
                    num2.equals("V");
                    num4 = 5;
                    break;
                case "VI":
                    num2.equals("VI");
                    num4 = 6;
                    break;
                case "VII":
                    num2.equals("VII");
                    num4 = 7;
                    break;
                case "VIII":
                    num2.equals("VIII");
                    num4 = 8;
                    break;
                case "IX":
                    num2.equals("IX");
                    num4 = 9;
                    break;
                case "X":
                    num2.equals("X");
                    num4 = 10;
                    break;
                default:
                    System.out.println("Ошибка ввода второго числа");
            }
            switch (znak) {
                case "+":
                    znak.equals("+");
                    System.out.println("Результат:" + numbers1[(num3 + num4)]);
                    break;
                case "-":
                    znak.equals("-");
                    if ((num3 - num4) > 1) {
                        System.out.println("Результат:" + numbers1[(num3 - num4)]);
                    } else {
                        System.out.println("результат меньше единицы");
                    }
                    break;
                case "*":
                    znak.equals("*");
                    System.out.println("Результат:" + numbers1[(num3 * num4)]);
                    break;
                case "/":
                    znak.equals("/");
                    System.out.println("Результат:" + numbers1[(num3 / num4)]);
                    break;
                default:
                    System.out.println("Ошибка ввода действия");
            }
        } else {
            if ((Arrays.asList(numbers2).contains(num1)) && (Arrays.asList(numbers2).contains(num2))) {
                num3 = Integer.parseInt(num1);
                num4 = Integer.parseInt(num2);
                switch (znak) {
                    case "+":
                        znak.equals("+");
                        System.out.println("Результат:" + (num3 + num4));
                        break;
                    case "-":
                        znak.equals("-");
                        System.out.println("Результат:" + (num3 - num4));
                        break;
                    case "*":
                        znak.equals("*");
                        System.out.println("Результат:" + (num3 * num4));
                        break;
                    case "/":
                        znak.equals("/");
                        System.out.println("Результат:" + (num3 / num4));
                        break;
                }
            } else {
                System.out.println("Ошибка ввода чисел");
            }
        }
    }
}
