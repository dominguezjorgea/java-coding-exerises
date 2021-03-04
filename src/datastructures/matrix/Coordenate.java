package datastructures.matrix;

public class Coordenate {

    private int posX;
    private int posY;

    public Coordenate() {
    }

    public Coordenate(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public String toString() {
        return "Coordenate{" +
                "posX=" + posX +
                ", posY=" + posY +
                '}';
    }
}
