/*
 * CLASSE
 */
package aula6b;

/**
 *
 * @author Cl1sman ¯_(ツ)_/¯
 */
public class ControleRemoto implements Controlador {
    // Atributoss
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Métodos Especiais: Construct
    public ControleRemoto(){ // construtor, sem atributo nenhum.
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    
    // Métodos Especiais: Getters e Setters
    public int getVolume(){
        return volume; // como há um retorno, tenho que especificar o tipo
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public boolean getLigado(){
        return ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public boolean getTocando(){
        return tocando;
    }
    public void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    
    // Métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----MENU-----");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        
        for(int i = 0; i <= this.getVolume(); i += 10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu!");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){ // se esta afirmação for verdadeira
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
    
}
