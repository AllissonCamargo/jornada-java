package arrays.pensionato;

public class Rent {
    private String nome;
    private String email;
    private int quarto;

    public Rent(String nome, String email, int quarto){
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getQuarto() {
        return quarto;
    }

    @Override
    public String toString() {
        return String.format("%d: %s, %s", quarto, nome, email);
    }
}
