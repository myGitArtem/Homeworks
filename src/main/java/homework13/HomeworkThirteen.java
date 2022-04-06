package homework13;

import java.util.ArrayList;
import java.util.List;

public class HomeworkThirteen {
    public static void main(String[] args) {

        Fance fance = new Fance(2, 3);
        Tower tower = new Tower(3, 4);
        Soldier soldier = new Soldier(5, 6);
        Tank tank = new Tank(7, 9);

        List<Units> units = new ArrayList<>();
        units.add(fance);
        units.add(tower);
        units.add(soldier);
        units.add(tank);

        draw(units);
    }
    public static void draw(List<Units> units) {
        for (Units unit : units) {
            unit.draw();
        }
    }
}
