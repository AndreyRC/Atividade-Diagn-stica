public class Cliente {
    private String nome;
    private String modeloCarro;
    private int celular;

    private String tamanhoCarro;

    public void lavarCarro() {
        System.out.println("O carro do " + nome + " está pronto");
    }

    public void marcarHorario(String tamanhoCarro) {
        String resposta = "";
        switch (tamanhoCarro) {
            case "grande":
                resposta = "levará 3 horas";
                break;
            case "médio":
                resposta = "levará 2 horas";
                break;
            case "pequeno":
                resposta = "levará 3 horas";
                break;
        }
        System.out.println("O cliente " + nome + " marcou um horário, seu carro é "+ tamanhoCarro+ " então "+ resposta + " para ficar pronto.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getTamanhoCarro() {
        return tamanhoCarro;
    }

    public void setTamanhoCarro(String tamanhoCarro) {
        this.tamanhoCarro = tamanhoCarro;
    }
}
