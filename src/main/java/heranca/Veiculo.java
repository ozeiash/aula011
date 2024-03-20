/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Ozeias Campos <ozeiash@gmail.com>
 * @date 17/03/2024
 * @brief Class Veiculo
 */
public class Veiculo {

    private String placa;
    private int ano;

    public Veiculo() {

    }

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAno(String ano) {

    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public void exibirDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);

    }

}
