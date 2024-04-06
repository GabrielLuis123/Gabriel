public class Tabela_Nutricional {
    public Float Calorias;
    public Float Fibras;
    public Float Carboidratos;
    public Float Gorduras;
    public Float Proteinas;

    public Tabela_Nutricional(Float calorias, Float fibras, Float carboidratos, Float gorduras, Float proteinas) {
        Calorias = calorias;
        Fibras = fibras;
        Carboidratos = carboidratos;
        Gorduras = gorduras;
        Proteinas = proteinas;
    }

    public Float getCalorias() {
        return Calorias;
    }

    public void setCalorias(Float calorias) {
        Calorias = calorias;
    }

    public Float getFibras() {
        return Fibras;
    }

    public void setFibras(Float fibras) {
        Fibras = fibras;
    }

    public Float getCarboidratos() {
        return Carboidratos;
    }

    public void setCarboidratos(Float carboidratos) {
        Carboidratos = carboidratos;
    }

    public Float getGorduras() {
        return Gorduras;
    }

    public void setGorduras(Float gorduras) {
        Gorduras = gorduras;
    }

    public Float getProteinas() {
        return Proteinas;
    }

    public void setProteinas(Float proteinas) {
        Proteinas = proteinas;
    }
}
