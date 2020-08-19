
public class Carro {

    private float velocidade;
    private float quantidadeCombustivel;
    private float consumoAtual;
    private float peso;
    private float kmPercorridos;
    private float pesoPessoas;
    private float pesoCombustivel;

    public Carro(float pesoPessoas) {
        this.pesoPessoas = pesoPessoas;
        this.pesoCombustivel = 40 * 0.2f;
        this.quantidadeCombustivel = 40;
        this.kmPercorridos = 0;
        this.consumoAtual = 10;
        this.velocidade = 80;
    }

    public void andar() {
        gastarCombustivel();
        System.out.printf("Distância percorrida (km): %.2f\n", getKmPercorridos());
        diminuirConsumo();
    }

    public void gastarCombustivel() {
        quantidadeCombustivel--;
        diminuirPesoCombustivel();
    }

    public void diminuirPesoCombustivel() {
        pesoCombustivel -= 0.2f;
    }

    public void diminuirConsumo() {
        consumoAtual += 0.05f;
    }

    public float getKmPercorridos() {
        kmPercorridos += consumoAtual;
        return kmPercorridos;
    }

    public void setKmPercorridos(float kmPercorridos) {
        this.kmPercorridos = kmPercorridos;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public float getConsumoAtual() {
        return consumoAtual;
    }

    public void setConsumoAtual(float consumoAtual) {
        this.consumoAtual = consumoAtual;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPesoPessoas() {
        return pesoPessoas;
    }

    public void setPesoPessoas(float pesoPessoas) {
        this.pesoPessoas = pesoPessoas;
    }

    public float getPesoCombustivel() {
        return pesoCombustivel;
    }

    public void setPesoCombustivel(float pesoCombustivel) {
        this.pesoCombustivel = pesoCombustivel;
    }

}
