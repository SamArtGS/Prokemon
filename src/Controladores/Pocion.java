package Controladores;

public class Pocion {
    private int tipo;
    public Pocion(int tipo){
        this.tipo = tipo;
    }

    public int usar(){
        int uso = 0;
        switch (tipo){
            case 1:
                uso = 20;
                break;
            case 2:
                uso = 10;
                break;
            case 3:
                uso = 10;
                break;
        }
        return uso;
    }
    public int getTipo(){
        return tipo;
    }
}
