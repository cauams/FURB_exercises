package unidade06.exerciciosSala.vetoresDefinidosNoCodigo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        List<Person> list = new ArrayList<Person>();
        int totalM = 0;
        int totalF = 0;
        int total = 0;
        for(int value = 0; value < 30; value++)
        {
            System.out.println("Escreva seu sexo");
            String sexo = sc.next();
            boolean s;
            if(sexo.toUpperCase().equals("M"))
                s = true;
            else
                s = false;
            
            System.out.println("Escreva sua nota");
            int n = sc.nextInt();
            System.out.println("Escreva sua idade");
            int i = sc.nextInt();
            Person p = new Person(s, n, i);
            list.add(p);
           
        }
        int youngerAge = 120;
        Person youngerPerson = new Person();
        List<Person> allMan = list.stream().filter(person ->person.getSexo() == true).toList();
        List<Person> AllWomen = list.stream().filter(person ->person.getSexo() == false).toList();
        for (Person person2 : AllWomen) {
            if(youngerAge > person2.getIdade() && person2.getSexo() == false)
            {
                youngerAge = person2.getIdade();
                youngerPerson = person2; 
            }
        }
        for (Person men : allMan) {
            totalM += men.getNota();
        }

        totalM = totalM / allMan.size();

        for (Person woman : AllWomen) {
            totalF += woman.getNota();
        }

        totalF = totalF / AllWomen.size();

        for (Person people : list) {
            total += people.getNota();
        }
        total = total / 30;
         final int totalFinal = total;
        int cinquentonas =  Integer.parseInt(String.valueOf(list.stream().filter(person -> person.getIdade()>50).filter(person -> person.sexo == false).filter(person -> person.getNota() > totalFinal).count()));
        
        System.out.println("media nota homens: " + totalM);
        System.out.println("media nota mulheres: " + totalF);
        System.out.println("mulheres com mais de cinquenta: " + cinquentonas);
        System.out.println("mulher mais nova: "  +  youngerPerson.getIdade());

    }
    
    
}