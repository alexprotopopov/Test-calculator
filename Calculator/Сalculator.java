package Calculator;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введи строку(число действие число):");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        calc(input);
    }

    public static String calc(String input) throws Exception {

        String numbers1[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        Integer num3 = 0, num4 = 0, i = 0;
        String[] num = input.split("\s");
        String num1 = new String();
        String num2 = new String();
        String znak = new String();
        for (i = 0; i < num.length; i++) {
            try {
                num1 = num[0];
                znak = num[1];
                num2 = num[2];
            } catch (Exception e) {
                throw new Exception("формат математической операции не удовлетворяет заданию");
            }
            if (i > 2) {
                throw new Exception("формат математической операции не удовлетворяет заданию");
            }
        }
        try {
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
                        throw new Exception("введены значения больше X");
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
                        throw new Exception("введены значения больше X");
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
                            throw new Exception("в римской системе нет отрицательных чисел");
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
                }
            } else {
                if (Integer.parseInt(num1) < 11 && Integer.parseInt(num2) < 11) {
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
                    throw new Exception("введены значения больше 10");
                }
            }
        } catch (NumberFormatException e) {
            throw new Exception("используются одновременно разные системы счисления");
        }
        return input;
    }
}
