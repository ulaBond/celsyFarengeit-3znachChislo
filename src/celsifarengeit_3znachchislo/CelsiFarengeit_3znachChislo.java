/** Дано значение температуры T в градусах Цельсия.
 * Определить значение этои же температуры по Фаренгейту.
 * 
 * Пользователь вводит трехзначное число.
 * Найдите: Число единиц, десятков. Сумму цифр*/
package celsifarengeit_3znachchislo;

import java.util.Random;
import java.util.Scanner;

/** @author Юлия */
public class CelsiFarengeit_3znachChislo {

    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    System.out.print("Какая температура в Цельсиях. Напиши: ");
    int celsy = scanner.nextInt();
    double far = celsy*1.8+32;
    System.out.println("Температура в Фаренгейт: "+far);
    System.out.println("************************");
    System.out.println("Напиши 3-х значное число: ");
    int chislo = scanner.nextInt();
    int sot = chislo/100;
    int desytki = (chislo-100*sot)/10;
    int jed = chislo-100*sot-10*desytki;
    System.out.println("В твоем числе "+sot+" сотен, "+desytki+" десятков, "+jed+" единиц.");
    }
}
