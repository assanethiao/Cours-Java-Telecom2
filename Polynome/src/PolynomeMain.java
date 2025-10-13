public class PolynomeMain {
    public static void main(String[] args) {
       
        Polynome p = new Polynome(3, 2);  
        p = p.plus(new Polynome(-1, 1));
        p = p.plus(new Polynome(6));      

        
        System.out.println("Polynôme p(x) : " + p);

       
        System.out.println("p(1) = " + p.valeur(1));

      
        Polynome dp = p.derivee();
        System.out.println("Dérivée p'(x) : " + dp);
        System.out.println("p'(1) = " + dp.valeur(1));
    }
}
