package source;

public class Servidor {

    int id;
    int velocidadeAtendimento;
    float tempoAtendimento = 0;

    public float getTempoAtendimento() {
        return tempoAtendimento;
    }

    public void setTempoAtendimento(Cliente cliente, int ordem) {
        float tempoAtCliente = (float) cliente.getNumItens() / (float) this.getVelocidadeAtendimento();
        this.tempoAtendimento = this.tempoAtendimento + tempoAtCliente;
        System.out.println("Atendimento nr: " + ordem + " Cliente " + cliente.getId() + " prioridade " + cliente.getPrioridade() + " com "
            + cliente.getNumItens() + " atendido por " + this.getId() + " no tempo: " + tempoAtCliente
        );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVelocidadeAtendimento() {
        return velocidadeAtendimento;
    }

    public void setVelocidadeAtendimento(int velocidadeAtendimento) {
        this.velocidadeAtendimento = velocidadeAtendimento;
    }

    public Servidor(int identificador, int velocidade) {
        this.setId(identificador);
        this.setVelocidadeAtendimento(velocidade);
    }

}
