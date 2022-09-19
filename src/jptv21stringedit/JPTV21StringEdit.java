/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21stringedit;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV21StringEdit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- StringEdit---");
        System.out.println("Введите текст (English only) :");
        String str = scanner.nextLine();
        int repeat = 1;
        do {
            System.out.println("Выберите номер функций: ");
            System.out.println("0. Выход из программы");
            System.out.println("1. Количество симболов в тексте");
            System.out.println("2. Количество слов в тексте");
            System.out.println("3. Находит указанную подстроку в тексте");
            System.out.println("4. Заменяет указанную подстроку на другоую подстроку");
            int numberFunction = scanner.nextInt();
            scanner.nextLine();
            switch (numberFunction) {
                case 0:
                    System.out.println("Пока пока!");
                    repeat = 0;
                    break;
                case 1:
                    System.out.println("Вы выбрали функцию номер \"1. Количество симболов в тексте\"");
                    char[] strChar = str.toCharArray();
                    System.out.println("Посчитано: " +strChar.length + " Симболов.");
                    break;
                case 2:
                    System.out.println("Вы выбрали функцию номер \"2. Количество слов в тексте\"");
                    String[] wordArray = str.split (" ");
                    System.out.println("Посчитано: "+wordArray.length+ " симболов");
                    
                    break;
                case 3:
                    System.out.println("Вы выбрали функцию номер \"3. Находит указанную подстроку в тексте\"");
                    System.out.println("Выберите подстроку для поиска: ");
                    String subStr = scanner.nextLine();
                    int indexSubStr = str.indexOf(subStr);
                    if(indexSubStr  < 0) {
                        System.out.println("Такой подстроки в строке нет");
                    }else{
                        indexSubStr++;
                        System.out.println("Подстрока находится на "+indexSubStr +" позиции в строке");
                    }
                    break;
                case 4:
                    System.out.println("Вы выбрали функцию номер 4");
                    break;
                default:
                    break;
            }
            System.out.println("-----------------------------");
            if(repeat == 0)break;
        } while (true);
    }
}
