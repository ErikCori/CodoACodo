
public class Auto {
    private String marca;
    private String modelo;
    private int cilindrada;
    private int precio;

    public Auto(String marca, String modelo, int cilindrada, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.precio = precio;
    }
            
    //Getters
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getCilindrada(){
        return this.cilindrada;
    }
    public int getPrecio(){
        return this.precio;
    }
    
    //Setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    
    //Metodos
    @Override
    public String toString(){
        return this.marca +", "+this.modelo;
    }
}
