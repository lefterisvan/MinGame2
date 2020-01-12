import java.io.Serializable;

public class User implements Serializable {
    // i klassh auth anaferetai ston xrhsth/paikth kai ta stoixeia pou kratame gia auton
    // kanei implements Serializable gia na mporesoume na apothhkeusoume antikeimena User se arxeio

    private String name;
    private int score;

    public User(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
