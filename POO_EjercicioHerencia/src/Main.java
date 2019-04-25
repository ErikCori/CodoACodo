
public class Main {
    public static void main(String[] args) {
        TrianguloEscaleno tri1 = new TrianguloEscaleno(10,10,10);
        System.out.println("El perimetro de "+tri1.getNombre()+" es "+tri1.obtenerPerimetro());
        System.out.println("Area:"+tri1.obtenerArea());
        
        //Polimorfismo por asignacion
        FiguraGeometrica tri2 = new TrianguloEscaleno(10,9,8);
        FiguraGeometrica cuadri1 = new Cuadrado(10);
        FiguraGeometrica cuadri2 = new Cuadrado(15);
        
        System.out.println("Perimetro:"+cuadri1.obtenerPerimetro());
        System.out.println("Area:"+cuadri1.obtenerArea());
        
        FiguraGeometrica[] figuras = {tri1,cuadri1, cuadri2};
        for (int i = 0; i < figuras.length; i++) {
            System.out.println(figuras[i].obtenerArea());
        }
    }
    
}

