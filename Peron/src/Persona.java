import java.util.Objects;

public class Persona {
    private String nome;
    private String cognome;
    private int eta;

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return eta == persona.eta && Objects.equals(nome, persona.nome) && Objects.equals(cognome, persona.cognome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, eta);
    }
}
