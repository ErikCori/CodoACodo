/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto spider498 = new Auto("Ferrari", 6, 4200, Combustible.GNC);
        
        System.out.println(spider498);
        spider498.setTipoCombustible(Combustible.NAFTA);
        System.out.println(spider498);
    }
    
}
