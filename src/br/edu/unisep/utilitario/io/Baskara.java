package br.edu.unisep.utilitario.io;

public class Baskara {
    private double x1;
    private double x2;

    public static void calcularBaskara(float a, float b, float c, Baskara bha)
    {
        Baskara retorno = new Baskara();
        
        double delta = Math.sqrt(Math.pow (b, 2) - 4 * a * c);
        double _x1 = (-b + delta) / 2 * a;
        double _x2 = (-b - delta) / 2 * a;
                
        retorno.setX1(_x1);
        retorno.setX2(_x2);
        
        bha.setX1(_x1);
        bha.setX2(_x2);
    }
    
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }
    
    
}
