package entity;

public class Conta {

    private String number;

    private String agency;

    private  String clientName;

    private Double balance;


    /**
     * get field
     *
     * @return balance
     */
    public Double getBalance() {
        return this.balance;
    }

    /**
     * set field
     *
     * @param balance
     */
    public void insertBalance(Double balance) {

        if(balance < 0){
            throw new IllegalArgumentException("Saldo inválido");
        }
        this.balance = balance;
    }

    /**
     * get field
     *
     * @return name
     */
    public String getAgency() {
        return this.agency;
    }

    /**
     * set field
     *
     * @param agency
     */
    public void insertAgency(String agency) {

        if (agency.length() > 5 || agency.charAt(3) != '-' || !agency.matches("^[0-9\\p{P}\\p{S}]+$")){
            throw new IllegalArgumentException("Agência inválida");
        }
        this.agency = agency;
    }

    /**
     * get field
     *
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * set field
     *
     * @param number
     */
    public void insertNumber(String number) {

        if(number.length() > 4 || !number.matches("^\\d+$")){
            throw new IllegalArgumentException("Número Inválido");
        }
        this.number = number;
    }

    /**
     * get field
     *
     * @return clientName
     */
    public String getClientName() {
        return this.clientName;
    }

    /**
     * set field
     *
     * @param clientName
     */
    public void insertClientName(String clientName) {
        this.clientName = clientName;
    }

    public Conta(String agency, String number, String clientName, Double balance) {
        this.insertAgency(agency);
        this.insertNumber(number);
        this.insertClientName(clientName);
        this.insertBalance(balance);

    }

    public void saque(Double valor){
        if(this.balance >= valor) {
            this.balance -= valor;
        }else {
            throw new IllegalArgumentException("Valor indisponível");
        }
    }

    public void deposito(Double valor){
        this.balance += valor;
    }
}
