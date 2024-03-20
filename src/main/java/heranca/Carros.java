/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Ozeias Campos <ozeiash@gmail.com>
 * @date 18/03/2024
 * @brief Class Carros
 */
public class Carros extends Veiculo {

    private String cambio;

    public Carros(String placa, int ano, String cambio) {
        super(placa, ano);
        this.cambio = cambio;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    @Override

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cambio: " + cambio);

    }

}
