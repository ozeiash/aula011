/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

import java.util.ArrayList; //Importa o pacote Arrylist
import java.util.Scanner; //Importa o pacote Scanner

/**
 *
 * @author Ozeias Campos <ozeiash@gmail.com>
 * @date 18/03/2024
 * @brief Class Main
 */
public class Main { //Nome da classe

    public static void main(String[] args) { //Inicia a classe principal

        Scanner scanner = new Scanner(System.in); //Habilita o teclado para o usuário
        ArrayList<Veiculo> veiculos = new ArrayList<>(); //Armazena objetos da classe veículo, aceitando somente instancias de veíuculo ou suas subclasses

        while (true) { //Laço de repetição do menu
            System.out.println("\nEscolha uma opção:"); //Mensagem apresentado ao usuário
            System.out.println("1. Cadastrar veículo"); //Executa a rotina de cadastros de veiculos
            System.out.println("2. Editar veículo"); //Edita os cadastros já finalizados
            System.out.println("3. Excluir veículo"); // Exclui cadastros finalizados
            System.out.println("4. Exibir todos os veículos"); //Exibe um relatório de todos os veiculos cadastrados
            System.out.println("5. Sair"); //Encerra o programa

            int opcao = scanner.nextInt(); //Cria uma váriavel para receber os dados digitados pelo usuário
            scanner.nextLine(); // Limpar o buffer(fila) do scanner

            switch (opcao) { //Direciona a escolha do usuário
                case 1: //Caso digite 1
                    cadastrarVeiculo(scanner, veiculos); //Habilita a opção cadastrar veiculo
                    break; //Interrompe o comando switch
                case 2: //Caso digite 2
                    editarVeiculo(scanner, veiculos); //Habilita a opção editar veiculo
                    break; //Interrompe o comando switch
                case 3: //Caso digite 3
                    excluirVeiculo(scanner, veiculos); //Habilita a função excluir veiculo
                    break; //Interrompe o comando switch
                case 4: //Caso digite 4
                    exibirVeiculos(veiculos); //Habilita a função exibir veiculo
                    break; //Interrompe o comando switch
                case 5: //Caso digite 5
                    System.out.println("Fim da execução"); //Mensagem apresentada ao usuário
                    return; //Termina a execucão do programa
                default: //Caso o usuário digite algo diferente das opções anteriores, uma opção inválida
                    System.out.println("Opção inválida. Tente novamente.");//Mensagem de opção inválida apresentada quando o usuário escolhe algo fora do menu
            } //Demarca o término do comando switch
        } //Demarca o término do laço while
    } // Demarca o término do método static void main

    public static void cadastrarVeiculo(Scanner scanner, ArrayList<Veiculo> veiculos) { //Declara o método "cadastrar veiculo" utilizados para receber dados do usuario e armazenar veiculos cadastrados
        System.out.println("Digite o tipo de veículo (caminhao, onibus, carro, moto):");//Mensagem exibida ao usuário
        String tipo = scanner.nextLine(); //Váriavel para receber informação inserida sobre o tipo do veiculo

        System.out.println("Digite a placa do veículo:"); //Mensagem exibida ao usuário
        String placa = scanner.nextLine(); //Variável para receber informação sobre a placa

        System.out.println("Digite o ano do veículo:"); //Mensagem exibida ao usuário
        int ano = scanner.nextInt(); //Variavel para receber informação sobre o ano do veiculo

        switch (tipo) { //Direciona a escolha do usuário
            case "caminhao": //Caso escolha caminhao
                System.out.println("Digite a quantidade de eixos:"); //Mensagem exibida ao usuário
                int eixos = scanner.nextInt(); //Váriavel para receber quantidade de eixos
                veiculos.add(new Caminhao(placa, ano, eixos)); //Cria uma nova instancia da classe caminhao
                break; //Interrompe o comando switch
            case "onibus": //Caso digite onibus
                System.out.println("Digite a quantidade de assentos:"); //mensagem apresentada ao usuário
                int assentos = scanner.nextInt(); //Variavel que recebe o a quantidade de cambio digitada pelo usuario 
                veiculos.add(new Onibus(placa, ano, assentos)); //Cria uma nova instancia da classe cambio
                break; //Interrompe o comando switch
            case "carro": //Caso digite carro
                System.out.println("Digite o tipo de cambio do veiculo:"); //mensagem apresentada ao usuário
                int cambio = scanner.nextInt(); //Variavel que recebe o tipo de cambio digitado pelo usuario 
                veiculos.add(new Onibus(placa, ano, cambio)); //Cria uma nova instancia da classe cambio
                break; //Interrompe o comando switch

            case "moto": //caso digite moto
                System.out.println("Digite o tipo de igninição da moto:"); //mensagem apresentada ao usuário
                int tipoIgnicao = scanner.nextInt(); //Variavel que recebe o a quantidade de tipoIgnicao digitada pelo usuario 
                veiculos.add(new Onibus(placa, ano, tipoIgnicao)); //Cria uma nova instancia da classe tipoIgnicao
                break; //Interrompe o comando switch

            default: ////Caso o usuário digite algo diferente das opções anteriores, uma opção inválida
                System.out.println("Tipo de veículo inválido."); //Mensagem apresentada ao usuário
                return; //Encerra a execução do switch
        } //Encerra o comando switch

        System.out.println("Veículo cadastrado com sucesso."); //Mensagem apresentada ao usuário
    } //Encerra o método static void cadastrarVeiculo

    public static void editarVeiculo(Scanner scanner, ArrayList<Veiculo> veiculos) { //Declara o método "editar veiculo" utilizados para receber dados do usuario e armazenar em veiculos cadastrados
        System.out.println("Digite a placa do veículo que deseja editar:"); //Mensagem apresentada ao usuário
        String placa = scanner.nextLine(); //Variavel que armazenara a placa do veiculo

        for (Veiculo veiculo : veiculos) { //declaração do loop for, e declaração da variavel veiculo do tipo Veiculo que receberá elementos da coleção veiculos
            if (veiculo.getPlaca().equals(placa)) { //Comando se, que verifica se a placa digitada é igual a placa armazenada no objeto veiculo
                System.out.println("Digite o novo ano do veículo:"); //Mensagem apresentada ao usuário
                int novoAno = scanner.nextInt();//Variavel que armazenara o ano do veiculo
                veiculo.setAno(novoAno); //Atualiza o ano do veiculo para o novo valor de novoAno
                System.out.println("Veículo editado com sucesso."); //Mensagem apresentada ao usuário
                return; // Indica que a edição do veículo foi concluída com sucesso e que o método editarVeiculo deve ser encerrado neste ponto.
            } //Encerra a condição se
        } //Encerra o laço for

        System.out.println("Veículo não encontrado."); //Mensagem apresentada ao usuário
    } //Encerra o método editar veiculos

    public static void excluirVeiculo(Scanner scanner, ArrayList<Veiculo> veiculos) { //Declara o método "Excluir veiculo" utilizados para excluir dados armazenados previamente
        System.out.println("Digite a placa do veículo que deseja excluir:"); //Mensagem apresentada ao usuário
        String placa = scanner.nextLine(); //Variavel que armazena a placa digitada pelo usuário

        for (Veiculo veiculo : veiculos) { //declaração do loop for, e declaração da variavel veiculo do tipo Veiculo que receberá elementos da coleção veiculos
            if (veiculo.getPlaca().equals(placa)) { //Comando se, que verifica se a placa digitada é igual a placa armazenada no objeto veiculo
                veiculos.remove(veiculo); //Exclui um veiculo cadastrado previamente
                System.out.println("Veículo excluído com sucesso."); //Mensagem apresentada ao usuário
                return; // Indica que a exclusão do veículo foi concluída com sucesso e que o método editarVeiculo deve ser encerrado neste ponto.
            } //Encerra a condição se
        } //Encerra o loop for para exclusão de veiculos

        System.out.println("Veículo não encontrado."); //Mensagem apresentada ao usuário
    } //Encerra o método excluir veiculos

    public static void exibirVeiculos(ArrayList<Veiculo> veiculos) { //Declara o método "Exibir veiculo" para consultar veiculos armazenados previamente
        if (veiculos.isEmpty()) { //Verifica se lista de veiculos está vazia
            System.out.println("Nenhum veículo cadastrado."); //Mensagem apresentada ao usuário caso a lista esteja vazia
        } else { //Se o retorno for falso, retornará os dados dos veiculos armazenados previamente
            System.out.println("Lista de veículos:"); //Mensagem apresentada ao usuário
            for (Veiculo veiculo : veiculos) { //declaração do loop for, e declaração da variavel veiculo do tipo Veiculo que receberá elementos da coleção veiculos
                veiculo.exibirDados(); //Esse método exibe as informações dos veiculos cadastrados previamente
                System.out.println(); //Salta uma linha
            } //Encerra o loop for
        } //Encerra o else
    } //Encerra o método exibirVeiculos
} //Encerra a classe Main