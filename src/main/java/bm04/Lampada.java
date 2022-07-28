package bm04;

public class Lampada {
    private Long ID;
    private float valor;
    private TipoLampada tipo;
    private int potencia;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public TipoLampada getTipo() {
        return tipo;
    }

    public void setTipo(TipoLampada tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public enum TipoLampada {
        LED, FLUORECENTE
    }

}