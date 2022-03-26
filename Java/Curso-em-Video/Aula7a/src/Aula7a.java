public class Aula7a {
    public static void main(String[] args) {
        Lutador L[] = new Lutador[6];
        L[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1); // Na posição 0 ele cria um novo objeto
        L[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        L[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        L[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        L[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        L[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105f, 12, 2, 4);
        System.out.println(L);
        // Cada um deles é um objeto de Lutador, que é armazenado nas posições do vetor L

        L[0].status();
        /*
         ####### A forma que eu pensei, a de cima é a forma que o Guanabara mostrou. Crio dentro das posições
        Lutador l1 = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        Lutador l2 = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        Lutador l3 = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        L[0] = l1;
        L[1] = l2;
        L[2] = l3;
        l1.status();
         */
    }
}