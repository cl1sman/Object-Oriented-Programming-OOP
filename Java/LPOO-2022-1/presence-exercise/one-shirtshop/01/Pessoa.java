public class Pessoa {
    String nome;
    String cpf;
    String dataDeNascimento;
    /**
     * Quando você cria um objeto, as variaveis dele existem
     * Então, todos os atributos aqui vão iniciar com seus valores padrões.
     * no caso da camiseta1, não tem necessidade de dar um new, porque ele já foi declarado.
     * O atributo existe. Então, basta fazer com que ele olhe para algum lugar. Pois ele já existe, mas inicia com null.
     */
    // Camiseta camiseta1; // atributo de composição. O new declara esses atributos, começando com null, assim, basta faze-lo olhar para um lugar.
    // Camiseta camiseta2;

    Camiseta camisetas[]; // aqui declaramos um array de camisetas

    Pessoa(String nome, String cpf, String dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;

        this.camisetas = new Camiseta[2]; // atribuimos o tamanho do array
    }

    void recebaCamiseta(Camiseta camiseta) { // aqui estou passando uma camiseta(objeto camiseta) para o metodo
        boolean acheiEspaco = false;
        for(int i = 0 ; i < camisetas.length && !acheiEspaco ; i++) {
            if(camisetas[i] == null) {
                camisetas[i] = camiseta;
                acheiEspaco = true;
            }
        }
        if(!acheiEspaco) {
            // Se vira! Acha mais espaço! Cria! Se resolve!
            // Problema seu!

            // E la vamos nós?
            Camiseta[] novoArray = new Camiseta[camisetas.length + 1];
            for(int i = 0 ; i < camisetas.length ; i++) {
                novoArray[i] = camisetas[i]; // copia os valores do array antigo para o novo array
            }
            novoArray[novoArray.length - 1] = camiseta; // na ultima posição, eu coloco a nova camiseta
            camisetas = novoArray;  // atualiza o array

        }

    }

    void mostra(){
        System.out.println("Dono: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de nascimento: " + this.dataDeNascimento);
        for(int i = 0; i < camisetas.length; i++ ){
            System.out.println((i + 1) + "° Camiseta");
            System.out.println("Tamanho: " + this.camisetas[i].tamanho);
            System.out.println("Cor: " + this.camisetas[i].cor);
            System.out.println("Possui estampa: " + this.camisetas[i].possuiEstampa);
            System.out.println("Preço de custo: " + this.camisetas[i].precoDeCusto);
            System.out.println("Preço de venda: " + this.camisetas[i].precoDeVenda);
            System.out.println(""); 
        }
    }
}
