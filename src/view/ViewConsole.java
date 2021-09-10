package view;

import repository.DadosRepository;
import service.DadosService;

import java.util.Scanner;

public class ViewConsole {
    Scanner input = new Scanner(System.in);
    DadosRepository dadosRepository = new DadosRepository();
    DadosService dadosService = new DadosService();

    /* =============== Métodos =============== */
    // método que faz aparecer o menu com opções para o usuário
    public void menu(){
        int op;
        //do while para chamar o menu com escolhas para o usuário
        do {
            System.out.print("###################-------MENU-------###################\n");
            System.out.print("|------------------------------------------------------|\n");
            System.out.print("| Opção 1 - Consultar média de idade dos pacientes     |\n");
            System.out.print("| Opção 2 - Consultar internações por ano              |\n");
            System.out.print("| Opção 3 - Consultar hospitais                        |\n");
            System.out.print("| Opção 4 - Calcular tempo de internação               |\n");
            System.out.print("| Opção 5 - Tempo de espera na fila                    |\n");
            System.out.print("| Opção 6 - Lista dados planilha                       |\n");
            System.out.print("| Opção 7 - Terminar o programa                        |\n");
            System.out.print("|------------------------------------------------------|\n");
            System.out.print("Escolha uma opção: ");
            op = input.nextInt();
            System.out.print("\n");

            switch (op) {
                case 1:
                    dadosService.totalDePacientesPorMunicio();
                    break;
                case 2:
                    dadosService.mediaDeIdadeDosPacientePorGenero();
                    break;
                case 3:
                    dadosService.mediaIdadePacientes();
                    break;
                case 4:
                    dadosService.filtroPacientePorNomeSolicitante();
                    break;
                case 5:
                    dadosService.cincoMaioresTemposDeEspera();
                    break;
                case 6:
                    dadosRepository.listarDados();
                    break;
                case 7:
                    System.out.println("Você está saindo do sistema! Obrigado por usá-lo!");
                    input.close();
                    break;
                default:
                    System.out.println("ATENÇÃO!!!!\nOpção Inválida!");
                    System.out.print("\n");
                    break;
            }
        }while(op != 6);
    }



    public int totalInternacoesAnual(){
        /*
        [Consultar internações por ano] Permitir que o usuário informe o nome do município
        residencial e como resultado o programa deverá exibir uma lista com os anos de
        2018 a 2021 e a quantidade de pacientes que foram internados por ano;
         */

        return 0;
    }

    public void hospitais(){
        /*
        [Consultar hospitais] Permitir que o usuário digite o nome do executante e como
        resultado o programa deverá exibir todos os pacientes que foram internados, sua
        idade, o município residencial e solicitante de cada um deles, as datas de
        autorização, de internação e alta e o executante;
         */
    }

    public int tempoInternacao(){
        /*
        [Calcular tempo de internação] Permitir que o usuário digite o nome do solicitante e
        como resultado o programa deverá exibir:
        a. Uma lista com todos os pacientes;
        b. O nome dos hospitais executantes;
        c. O número de dias que os pacientes permaneceram internados desde a
        solicitação até a alta deste paciente;
         */

        return 0;
    }

    public int tempoDeEspera(){
        /*
        [Determinar tempos de espera na fila] O programa deverá determinar e exibir os
        cinco casos com maior tempo de espera na fila;
         */
        return 0;
    }
}
