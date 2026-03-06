//importa a classe SCANNER, serve para ler dados digitados pelo usuário
import java.util.Scanner;

//cria uma classe chamada IMC, onde o programa vai existir
public class calculadoraImc {

    //Método principal do programa. 
    // É onde o java começa a executar o código
    public static void main (String[] args) {

        //Cria um objeto Scanner chamado "entrada" para ler dados do teclado
        Scanner entrada = new Scanner(System.in);

        //cria uma variável "peso" que pode guardar números com casas decimais
        double peso;
        //cria a variável altura para guardar a altura
        double altura;
        //cria a variável imc onde será guardado o resultado do cálculo
        double imc;

        //mostra na tela a mensagem pedindo o peso
        System.out.print("Digite seu peso (kg): ");
        //lê o peso digitado e guarda na variável peso
        peso = entrada.nextDouble();

        //mostra na tela a mensagem pedindo a altura
        System.out.print("Digite sua altura (m): ");
        //lê a altura digitada e guarda na variável altura
        altura = entrada.nextDouble();

        //calcula o IMC e guarda na variável IMC
        imc = peso / (altura * altura);
        //mostra na tela o resultado do IMC
        System.out.println("\nSeu IMC é:" + imc);
        //fecha o método main

        //a partir daqui fiz de curiosidade
        //classificação do IMC
        if (imc < 18.5){
            System.out.println("Classificação: Abaixo do peso");
//if-testa a primeira condição
//else if-testa outra condição
//else-executa se nenhuma condição for verdadeira
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Classificação: Peso normal");

            } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Classificação: Obesidade grau 1");

            } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Classificação: Obesidade grau 2");

            } else {
                  System.out.println("Classificação: Obesidade grau 3 (obesidade mórbida");
            }
            entrada.close();
          
        }
        }
//fecha a classe IMC        
