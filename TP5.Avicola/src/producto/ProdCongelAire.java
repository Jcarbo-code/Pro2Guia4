package producto;

public class ProdCongelAire extends ProductoCongelado {

    private float porcentNitrogeno;
    private float porcentOxigeno;
    private float porcentCarbono;
    private float porcentAgua;

    public ProdCongelAire() {
        this.porcentNitrogeno = 20;
        this.porcentOxigeno = 50;
        this.porcentCarbono = 5;
        this.porcentAgua = 25;
    }

    public ProdCongelAire(float porcentNitrogeno, float porcentOxigeno, float porcentCarbono, float porcentAgua) {
        this.porcentNitrogeno = porcentNitrogeno;
        this.porcentOxigeno = porcentOxigeno;
        this.porcentCarbono = porcentCarbono;
        this.porcentAgua = porcentAgua;
    }

    public float getPorcentNitrogeno() {
        return porcentNitrogeno;
    }

    public void setPorcentNitrogeno(float porcentNitrogeno) {
        this.porcentNitrogeno = porcentNitrogeno;
    }

    public float getPorcentOxigeno() {
        return porcentOxigeno;
    }

    public void setPorcentOxigeno(float porcentOxigeno) {
        this.porcentOxigeno = porcentOxigeno;
    }

    public float getPorcentCarbono() {
        return porcentCarbono;
    }

    public void setPorcentCarbono(float porcentCarbono) {
        this.porcentCarbono = porcentCarbono;
    }

    public float getPorcentAgua() {
        return porcentAgua;
    }

    public void setPorcentAgua(float porcentAgua) {
        this.porcentAgua = porcentAgua;
    }

    @Override
    public String getAllData() {
        return ("Vencimiento: " + vencimiento + ". Numero de lote: " + nLote + ". Fecha de envasado: " + envasado
                + ". Granja: " + granja + ". Codigo de supervicion: " + codSupervicion + ". Temperatura de refrigeracion: "
                + temperatura + ". % de nitrogeno: " + porcentNitrogeno + ", % de oxigeno: " + porcentOxigeno
                + ", % de agua: " + porcentAgua + ", % de carbono: " + porcentCarbono);
    }
}
