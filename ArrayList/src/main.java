
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class main {

    public static void main(String[] args) {
        //Declaracion de una lista de nombres
        List<String> listaNombres = new ArrayList<>();

        listaNombres.add("Juan");
        listaNombres.add("Maria");
        listaNombres.add("Esteban");
        listaNombres.add("Gabriela");

        /*
        System.out.println(listaNombres);
        if (listaNombres.isEmpty()) {
            System.out.println("La lista de nombres esta vacia");
        } else {
            System.out.println("La lista de nombres NO esta vacia");
        }
        System.out.println("El tamaño de la list es: " + listaNombres.size());
        //Recorriendo con un while
        int i = 0;
        while (i < listaNombres.size()) {
            System.out.println(listaNombres.get(i));
            i++;

            //Recorriendo con for each
            for (String unNombre : listaNombres) {
                System.out.println(unNombre + " - ");
            }
            if (listaNombres.remove("Esteban")) {
                System.out.println("Esteban fue removido de la lista");
            } else {
                System.out.println("Esteban no se encontraba en la lista");
            }
            System.out.println(listaNombres);

            for (String unNombre : listaNombres) {
                if (unNombre.equals("Gabriela")) {
                    System.out.println("Elemento: " + unNombre);
                }
            }
            //recorro la lista cn iterador
            Iterator<String> it = listaNombres.iterator();
            System.out.println("Recorriendo con un iterador");
            while (it.hasNext()) {
                System.out.println(it.next() + ", ");
            }
            System.out.println("\n");
         */
        System.out.println("==========================================");

        List<Auto> listaAutos = new ArrayList<>();
        listaAutos.add(new Auto("Ford", "Focus", 1600, 550000));
        listaAutos.add(new Auto("Renault", "Duster", 2000, 700000));
        listaAutos.add(new Auto("Renault", "Clio", 1600, 330000));
        listaAutos.add(new Auto("VW", "Gol", 1600, 120000));
        listaAutos.add(new Auto("VW", "Suran", 1600, 650000));
        listaAutos.add(new Auto("Ford", "Focus", 2000, 700000));
        listaAutos.add(new Auto("VW", "Gol", 1600, 1100000));

        System.out.println(listaNombres + ",");
        Collections.sort(listaNombres);
        System.out.println(listaNombres + ",");

        /*
            for (Auto listaAuto : listaAutos) {
                if(listaAuto.getPrecio()>500000){
                    System.out.println("El auto: "+listaAuto.getMarca()+" "+listaAuto.getModelo()+" cuesta mas de medio millon");
                }
            }*/
    }

}
