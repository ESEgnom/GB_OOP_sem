package units;

public class Bandit extends Warrior{

        public Bandit(String name, Vector2D coords) {
            super(name, 70.f, 70, 10, 2, 4, 10,
                    6, coords.posX, coords.posY);
        }

        @Override
        public StringBuilder getInfo() {
            StringBuilder builder = new StringBuilder();
            return builder.append("Разбойник:\t").append(units.Bandit.super.name)
                    .append("\t| ATK:\t").append(units.Bandit.super.attack)
                    .append("\t| HP:\t").append(units.Bandit.super.hp)
                    .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(units.Bandit.super.coords.posX).append(".").append(units.Bandit.super.coords.posY);
        }
    }

