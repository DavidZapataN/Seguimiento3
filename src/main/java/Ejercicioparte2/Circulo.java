package Ejercicioparte2;

public class Circulo {
    double Radio;
    
    Circulo(double radio) {
        this.Radio =  radio;
    }
    
    double calcularArea() {
        return Math.PI*Math.pow(Radio, 2);
    }
    
    double calcularPerimetro() {
        return 2*Math.PI*Radio;
    }
    
}
