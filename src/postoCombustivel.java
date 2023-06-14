import java.util.Scanner;

public class postoCombustivel {
    /**
     * @param args
     * @throws Exception
     * @autor Erick Abraão Santos da Silva (Mat. 01615180), Eduardo Ferreira Wagner (Mat. 01456361), Guilherme Cruz Santos (Mat. 01624833) e Guilherme de Melo Silva (Mat. 01429593)
     */
    public static void main(String[] args) throws Exception {
    
    char escolha;
    double litros, comDesconto, semDesconto;
    Scanner leitor = new Scanner(System.in);

    do{
    escolha=0;
    System.out.println("Bem vindo ao posto X, qual combustível deseja colocar?");
    System.out.println("A - Alcool");
    System.out.println("G - Gasolina");
    System.out.println("S - Sair");
    System.out.println("Digite a letra correspondente a opção que deseja:");  
    escolha = leitor.next().charAt(escolha);
       
    if(escolha=='A'){

        System.out.println("");
        System.out.println("O preço do alcool é R$ 3,15 por litro");
        System.out.println("Até 20 litro você tem 3% de desconto por litro, acima você tem 5%.");
        System.out.println("Digite quantos litros deseja abastecer:");
        litros = leitor.nextFloat();
    
            if(litros <= 20){

                semDesconto = litros * 3.15;
                comDesconto = semDesconto * 0.97;

                System.out.println("Você abasteceu " + litros + " litros");
                System.out.println("O preço sem desconto seria de R$" + semDesconto);
                System.out.println("O preço com desconto é R$" + comDesconto);
                System.out.println("");

            } else if (litros > 20){

                semDesconto = litros * 3.15;
                comDesconto = semDesconto * 0.95;

                System.out.println("Você abasteceu " + litros + " litros");
                System.out.println("O preço sem desconto seria de R$" + semDesconto);
                System.out.println("O preço com desconto é R$" + comDesconto);
                System.out.println("");
           
            }

            }else if(escolha=='G'){

            System.out.println("");
            System.out.println("O preço da gasolina é R$ 4,49 por litro");
            System.out.println("Até 20 litro você tem 4% de desconto por litro, acima você tem 6%.");
            System.out.println("Digite quantos litros deseja abastecer:");
            litros = leitor.nextFloat();

                if(litros <= 20){

                semDesconto = litros * 4.49;
                comDesconto = semDesconto * 0.96;

                System.out.println("Você abasteceu " + litros + " litros");
                System.out.println("O preço sem desconto seria de R$" + semDesconto);
                System.out.println("O preço com desconto é R$" + comDesconto);
                System.out.println("");

                } else if (litros > 20){

                semDesconto = litros * 4.49;
                comDesconto = semDesconto * 0.95;

                System.out.println("Você abasteceu " + litros + " litros");
                System.out.println("O preço sem desconto seria de R$" + semDesconto);
                System.out.println("O preço com desconto é R$" + comDesconto);
                System.out.println("");

        };

      }

    }while (escolha != 'S');

    }
}
