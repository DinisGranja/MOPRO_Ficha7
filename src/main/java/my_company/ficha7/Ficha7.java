/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package my_company.ficha7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author dinis
 */
public class Ficha7 {

    public static void main(String[] args) {
        ArrayList<Funcionario> vecFuncs = new ArrayList<Funcionario>();
        Funcionario f1 = new Funcionario("Pedro Silva", 2000);
        Funcionario f1b = new Funcionario("Pedro Silva", 2000);
        Funcionario f2 = new Funcionario("Ana Gomes", 3500);
        Funcionario f3 = new Funcionario("Paulo Barros", 900);
        Funcionario f4 = new Funcionario("Catarina Machado", 1500);
        
        vecFuncs.add(f1);
        vecFuncs.add(f2);
        vecFuncs.add(f3);
        vecFuncs.add(f4);
        
        /*
        for (int i = 0; i < vecFuncs.size(); i++) {
            System.out.println(vecFuncs.get(i).toString());
        }
        
        System.out.println("");
        
        //Usar f1 em vez de f1b
        vecFuncs.remove(f1b);
        
        for (int i = 0; i < vecFuncs.size(); i++) {
            System.out.println(vecFuncs.get(i).toString());
        }
        */
        
        System.out.println("Listagem dos funcionários ordenada alfabeticamente por nome do funcionário:\n");
        
        Collections.sort(vecFuncs, Comparator.comparing(Funcionario::getNome));
        vecFuncs.forEach(System.out::println);
        
        System.out.println("\nListagem dos funcionários ordenada por ordem crescente de vencimento: \n");
        
        Collections.sort(vecFuncs, Comparator.comparing(Funcionario::getVencimento));
        vecFuncs.forEach(System.out::println);
    }
}
