public class ClientePremium extends Cliente{
    private int cupons;

    public void usarCupons(int cupons) {
        System.out.println("O cliente premium " + getNome() + " usou seus cupons!");
    }
    @Override
    public void lavarCarro(){
        System.out.println("O/A Cliente premium lavou seu carro, tome seus cupons!!");
        cupons++;
    }
}
