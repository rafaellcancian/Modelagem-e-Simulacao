package source;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Principal {

    LinkedList<Cliente> clientes = new LinkedList<Cliente>();//Fila dos clientes
    LinkedList<Servidor> servidores = new LinkedList<Servidor>();//vetor de servidores
    Random random = new Random();
    int ordemAtendimento = 1;

    public void iniciaServidores() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a velocidade do servidor 1:");
        int velocidade1 = teclado.nextInt();
        Servidor s1 = new Servidor(1, velocidade1);
        System.out.println("Digite a velocidade do servidor 2:");
        int velocidade2 = teclado.nextInt();
        Servidor s2 = new Servidor(2, velocidade2);
        servidores.add(s1);
        servidores.add(s2);
        teclado.close();
    }

    public void iniciaClientes() {

        for (int x = 0; x < 30; x++) {
            Cliente cli = new Cliente(x, random.nextInt(10) + 1, random.nextInt(3));
            clientes.add(cli);
        }
    }

    public void atendeCliente(Cliente cliente) {
        if (this.servidores.get(0).getTempoAtendimento() < this.servidores.get(1).getTempoAtendimento()) {
            this.servidores.get(0).setTempoAtendimento(cliente, ordemAtendimento);
        } else {
            this.servidores.get(1).setTempoAtendimento(cliente, ordemAtendimento);
        }
        ordemAtendimento++;
    }

    public void atendeFila() {
        int cliAtendidos = 0;
        int prioridade;
        
        for (int p = 2; p >= 0; p--) {
            for (int i = 0; i < this.clientes.size(); i++) {
                if (this.clientes.get(i).getPrioridade() == p) {
                    atendeCliente(this.clientes.get(i));
                    cliAtendidos++;
                    if (cliAtendidos == 6 && cliAtendidos != 0) {
                        cliAtendidos = 0;
                        for (int j = 0; j < this.clientes.size(); j++) {
                            if (this.clientes.get(j).getPrioridade() < 2) {
                                prioridade = this.clientes.get(j).getPrioridade();
                                prioridade++;
                                this.clientes.get(j).setPrioridade(prioridade);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Método para executar a fila
     *
     * @param args
     */
    public static void main(String[] args) {
        Principal programa = new Principal();
        programa.iniciaServidores();
        programa.iniciaClientes();
        programa.atendeFila();

    }

}
