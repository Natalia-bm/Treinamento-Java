package com.company;

import java.util.Scanner;

public class GeEscola {
    Aluno alun = new Aluno();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GeEscola escola = new GeEscola();
        int opcao = 0;

        do{
            System.out.println("1 - Cadastro de Aluno");
            System.out.println("2 - Consulta Cadastro");
            System.out.println("3 - Sair");
            System.out.println("Digite a opcao desejada: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao){
                case 1:
                    escola.cadastroAluno();
                    break;

                case 2:
                    escola.consultaAluno();
                    break;

                case 3:
                    System.out.println("Finalizado com sucesso!");
                    break;

                default:
                System.out.println("Opção Invalida.");
                break;
            }
        } while(opcao!=3);

    }

    public void cadastroAluno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        alun.setNome(sc.nextLine());
        System.out.println("Digite seu RA: ");
        alun.setRA(sc.nextLine());
        System.out.println("Digite sua idade: ");
        alun.setIdade(sc.nextLine());
    }

    public void consultaAluno(){
        System.out.println("Nome Aluno: " + alun.getNome());
        System.out.println(alun.getRA());
        System.out.println(alun.getIdade());

    }


}

