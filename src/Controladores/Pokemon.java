package Controladores;


import javafx.scene.image.Image;

public class Pokemon {
    private int idPoke;
    private int tipoPoke;
    private String nombre;
    private int puntoVida;
    private int ataque;
    private int defensa;
    private int velocidad;
    private boolean estado;
    private int tipo;
    private Image imagen;
    private int vidaT;

    public Pokemon(String nombre,int idPoke,int puntoVida,int ataque,int defensa,int velocidad,boolean estado,int tipo,Image imagen){
        this.idPoke=idPoke;
        this.nombre = nombre;
        this.puntoVida = puntoVida;
        vidaT = puntoVida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.estado = estado;
        this.tipo = tipo;
        this.imagen = imagen;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void recibirDano(int dano){
        this.puntoVida = this.puntoVida - dano;
    }
    public boolean estaVivo(){
        if(this.puntoVida!=0) {
            estado = true;
            return true;
        }else{
            estado = false;
            return false;
        }
    }
    public String getNombre(){
        return this.nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getVidaT() {
        return vidaT;
    }

    public void setPuntoVida(double puntoVida) {
        this.puntoVida = (int)puntoVida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getPuntoVida() {
        return puntoVida;
    }

    public int getTipo() {
        return tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public Image getImagen() {
        return imagen;
    }

    public void pocionVida(int vida){
        this.puntoVida = this.puntoVida + vida;
    }
    public void pocionDefensa(int defensa){
        this.defensa = this.defensa +defensa;
    }
    public void pocionAtaque(int ataque) {
        this.ataque = this.ataque + ataque;
    }
}
