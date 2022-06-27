//possíveis classes derivadas: círculo, triângulo, retângulo
//area é protected então pode ser editada diretamente pelas classes derivadas, calcule baseado nas dimensões da forma escolhida.

public class Shape {
    private String color;
    protected int area;

    public Shape(String color, int area) {
        this.color = color;
        this.area = area;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getArea() {
        return area;
    }
}
