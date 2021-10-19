/*
 * INTERFACE
 */
package aula6b;

/**
 *
 * @author Cl1sman ¯_(ツ)_/¯
 */
public interface Controlador {
    public abstract void ligar(); // void, porque não vai retornar nada, mas pode retornar
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
