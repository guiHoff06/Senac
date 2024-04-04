public class Bomba {
    public static void main(String[] args) {
        BombaDeCombustivel bombaDiesel = new BombaDiesel("Bomba Diesel", 100.0); // Nome e capacidade
        BombaDeCombustivel bombaAlcool = new BombaAlcool("Bomba Alcool", 100.0); // Nome e capacidade
        BombaDeCombustivel bombaGas = new BombaGas("Bomba Gas", 100.0); // Nome e capacidade

        // Abastecendo e exibindo status
        bombaDiesel.abastecer(50.0); // Abastece 50 litros
        bombaDiesel.mostrarStatus();

        bombaAlcool.abastecer(0.0); // Abastece 0 litros
        bombaAlcool.mostrarStatus();

        bombaGas.abastecer(0.0); // Abastece 0 litros
        bombaGas.mostrarStatus();
    }
}

// Classe genérica para bomba de combustível
abstract class BombaDeCombustivel {
    protected String nome;
    protected double capacidade;
    protected double quantidadeCombustivel;

    public BombaDeCombustivel(String nome, double capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.quantidadeCombustivel = 0.0;
    }

    public void abastecer(double quantidade) {
        quantidadeCombustivel += (quantidade <= capacidade - quantidadeCombustivel) ? quantidade : capacidade - quantidadeCombustivel;
    }

    public void mostrarStatus() {
        System.out.println("Bomba: " + nome);
        System.out.println("Quantidade abastecida: " + quantidadeCombustivel + " litros");
        System.out.println("Quantidade restante: " + (capacidade - quantidadeCombustivel) + " litros\n");
    }
}

// Subclasse para bomba de diesel
class BombaDiesel extends BombaDeCombustivel {
    public BombaDiesel(String nome, double capacidade) {
        super(nome, capacidade);
    }
}

// Subclasse para bomba de álcool
class BombaAlcool extends BombaDeCombustivel {
    public BombaAlcool(String nome, double capacidade) {
        super(nome, capacidade);
    }
}

// Subclasse para bomba de gás
class BombaGas extends BombaDeCombustivel {
    public BombaGas(String nome, double capacidade) {
        super(nome, capacidade);
    }
}