public class Calcul {
    private Integer a;
    private Integer b;

    Calcul() {
        this.a = this.getRandom();
        this.b = this.getRandom();
    }
    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    public Integer getResult() {
        return this.a * this.b;
    }

    private Integer getRandom() {
        Integer min = 0;
        Integer max = 10;

        return (int)(Math.random()*(max-min+1)+min);
    }
}
