/**
 * <h1>ContaBancaria</h1>
 * Objeto de representação ContaBancaria
 *
 * @author Wellingthon
 * @version 1.0
 * @since 30/03/2025
 */

/**
 * Classe ContaBancaria
 */

public class ContaBancaria {
    private String agencia;
    private int numero;
    private String nomeCliente;
    private float saldo;

    /**
     * Classe de intanciar conta
     * 
     * @param agencia     [String] Agência do Cliente que quer criar uma conta
     * @param saldo       [Float] Saldo desejado do Cliente que quer criar uma conta
     * @param numero      [int] Numero da conta do Cliente que quer criar uma conta
     * @param nomeCliente [String] Nome do Cliente que quer criar uma conta
     * 
     */

    public ContaBancaria(String agencia, int numero, String nomeCliente, float saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    /**
     * Pega a agencia
     * 
     * @return String Agencia
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Pega a agencia
     * 
     * @return int numero da conta
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Pega o nome do cliente
     * 
     * @return String nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Pega o saldo
     * 
     * @return float saldo
     */
    public float getSaldo() {
        return saldo;
    }

}
