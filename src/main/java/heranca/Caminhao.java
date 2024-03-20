/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Ozeias Campos <ozeiash@gmail.com>
 * @date 17/03/2024
 * @brief Class Caminhao
 */
public class Caminhao extends Veiculo {

    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    @Override

    public void exibirDados() {
        super.exibirDados();
        System.out.println("eixos: " + eixos);

    }

}
