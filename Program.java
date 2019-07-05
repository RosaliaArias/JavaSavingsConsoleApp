import java.util.Scanner;

import src.Money;
import src.Person;

public class Program {
    public static void main(String[] args) {
        String personName;
        Scanner scanner = new Scanner(System.in);
        Person[] people = new Person[3];
        Money[] savings = new Money[5];

        for (int i = 0; i < people.length; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            personName = scanner.next();

            people[i] = new Person(personName, savings);

            for (int a = 0; a < savings.length; a++) {
                savings[a] = new Money(1);
                System.out.print("Ingrese el ahorro " + (a + 1) + " de " + personName + " ");
                savings[a].setMoney(scanner.nextInt());
            }

            people[i].setSavings(savings);
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].toString());
        }
    }
}