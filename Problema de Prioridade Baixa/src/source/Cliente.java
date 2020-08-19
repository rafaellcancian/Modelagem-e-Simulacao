package source;

public class Cliente {

    int id;
    int numItens;
    int prioridade = 0;//0 nenhuma; 1 prioridade baixa; 2 prioridade alta

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumItens() {
        return numItens;
    }

    public void setNumItens(int numItens) {
        this.numItens = numItens;
    }

    public Cliente(int identificador, int nrit, int p) {
        this.setId(identificador);
        this.setNumItens(nrit);
        this.setPrioridade(p);
    }
}
