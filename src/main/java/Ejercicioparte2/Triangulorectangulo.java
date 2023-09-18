package Ejercicioparte2;

public class Triangulorectangulo {
    double base, altura;
    
    public Triangulorectangulo(double base, double altura) {
        this.base= base;
        this.altura= altura;
    }
    
    double CalcularArea() {
        return(base*altura/2);
    }
    
    double CalcularPerimetro() {
        return(base+altura+CalcularHipotenusa());
    }
    
    double CalcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }
    
    String determinarTipoTriangulo() {
        if((base==altura)&&(base==CalcularHipotenusa())&&(altura==CalcularHipotenusa()))
            return("Es un triángulo equilátero");
        else if ((base!=altura)&&(base!=CalcularHipotenusa())&&(altura!=CalcularHipotenusa()))
            return("Es un triángulo escaleno");
        else
            return("Es un triángulo isósceles");
        
    }
}
