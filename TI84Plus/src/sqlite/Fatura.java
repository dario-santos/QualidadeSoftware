package sqlite;

public class Fatura
{
    private final int id;
    private final float valor;

    public Fatura(int id, float valor)
    {
        this.id = id;
        this.valor = valor;
    }

    public int getId()
    {
        return this.id;
    }

    public float getValor()
    {
        return valor;
    }
}