package homework.Game;

public class Player {
    private String name;
    private int hp;
    private int impactForce;

    class ValueException extends Exception {
        ValueException(String message) {
            super(message);
        }
    }

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setHp(int hp) {
        this.hp = hp;

    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public void setImpactForce(int value) throws ValueException {

        if (value > 9 | value < 1) {
            throw new ValueException("Ошибка ввода силы");
        }

        this.impactForce = value;


    }

    public int getImpactForce() {
        return impactForce;
    }

    public static double[] getChanceSelf(int force1, int force2) {
        double chanceForce1 = 90.0 / force1 / 100;
        double chanceForce2 = 90.0 / force2 / 100;


        double[] chances = new double[2];
        chances[0] = chanceForce1;
        chances[1] = chanceForce2;
        return chances;

    }


    public void hitPlayer(Player p2) {
        p2.hp -= this.getImpactForce();

    }


}
