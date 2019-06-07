
public class Sorveteria {
    
    protected String nomesorveteria;
    
    public Sorveteria(String nome){
        nomesorveteria = nome;
    }
    public void comprasorvete(double valor)
    {
        Compra compra = new Compra(nomesorveteria);
        
    }
     public void ExecutaCompra(processar sabor) {
    Compra compra = new Compra(nomesorveteria);
    
    sabor.processarSabor(compra);
}
    
}
