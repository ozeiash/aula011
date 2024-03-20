/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Ozeias Campos <ozeiash@gmail.com>
 * @date 17/03/2024
 * @brief Class Onibus
 */
public class Onibus extends Veiculo {

    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    @Override

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Assentos: " + assentos);

    }

}
