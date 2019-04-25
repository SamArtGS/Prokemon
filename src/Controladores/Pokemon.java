package Controladores;

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

    public Pokemon(String nombre,int puntoVida,int ataque,int defensa,int velocidad,boolean estado,int tipo){
        this.idPoke=idPoke;
        this.nombre = nombre;
        this.puntoVida = puntoVida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.estado = estado;
        this.tipo = tipo;
    }
    public void recibirDano(int dano){
        this.puntoVida = this.puntoVida - dano;
    }
    public boolean estaVivo(int vida){
        if(this.puntoVida!=0) {
            estado = true;
            return true;
        }else{
            estado = false;
            return false;
        }
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
