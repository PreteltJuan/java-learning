package TalleresJava.Taller06;

public class Planeta {
    private String nombre;
    private double masa;
    public static int contador = 0;

    public Planeta() {
        this("Tierra", 5.972);
    }

    public Planeta(String pNombre, double pMasa)
    {
        this.nombre = pNombre;
        this.masa = pMasa;
    }

    public static Planeta planetaMedio(Planeta pPlaneta){
        return new Planeta(pPlaneta.getNombre(), pPlaneta.getMasa()/2);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

}

