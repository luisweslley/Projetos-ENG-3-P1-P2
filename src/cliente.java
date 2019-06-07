
public class cliente {
    
public static void main(String[] args) {
    Sorveteria Kibon = new Sorveteria("Kibon");
    Kibon.ExecutaCompra(new SaborBaunilha());
    Kibon.ExecutaCompra(new SaborChocolate());
    Kibon.ExecutaCompra(new SaborMorango());
 
    Sorveteria Yopa = new Sorveteria("Yopa");
    Yopa.ExecutaCompra(new SaborBaunilha());
    Yopa.ExecutaCompra(new SaborChocolate());
    Yopa.ExecutaCompra(new SaborMorango());
    
}  
}
