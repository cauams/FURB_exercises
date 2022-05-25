package unidade06.exerciciosSala.vetoresDefinidosNoCodigo;

public class Person{
        
    boolean sexo;
    int nota;
    int idade;

    public int getNota()
    {
    return this.nota;   
    }
    public boolean getSexo()
    {
    return this.sexo;   
    }
    public int getIdade()
    {
    return this.idade;   
    }
    public Person()
    {
    }
    public Person(boolean s, int n, int i)
    {
        sexo = s;
        nota = n;
        idade = i;
    }
}
