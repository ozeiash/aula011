/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Ozeias Campos <ozeiash@gmail.com>
 * @date 18/03/2024
 * @brief Class Motos
 */
public class Motos extends Veiculo {

    private String tipoIgnicao;

    public Motos(String placa, int ano, String tipoIgnicao) {
        super(placa, ano);
        this.tipoIgnicao = tipoIgnicao;
    }

    public void setTipoIgnicao(String tipoIgnicao) {
        this.tipoIgnicao = tipoIgnicao;
    }

    public String getTipoIgnicao() {
        return tipoIgnicao;
    }

    @Override

    public void exibirDados() {
        super.exibirDados();
        System.out.println("tipoIgnicao: " + tipoIgnicao);

    }

}
