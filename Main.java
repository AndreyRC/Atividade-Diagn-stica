public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.setModeloCarro("Fusca");

        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Modelo do carro: " + cliente.getModeloCarro());
        cliente.marcarHorario("grande");
        cliente.lavarCarro();



        ClientePremium clientePremium = new ClientePremium();
        clientePremium.setNome("Maria");
        clientePremium.setModeloCarro("Civic");

        clientePremium.usarCupons(5);
        clientePremium.lavarCarro();
        System.out.println("Nome do cliente premium: " + clientePremium.getNome());
        System.out.println("Modelo do carro premium: " + clientePremium.getModeloCarro());

    }
}
