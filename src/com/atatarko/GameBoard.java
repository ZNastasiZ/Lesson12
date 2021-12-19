package com.atatarko;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    private final List<Unit> unitList = new ArrayList<>();

    public void createUnits() {
        add(new Fence());
        add(new Tower());
        add(new Soldier());
        add(new Tank());
    }

    public void checkUnitTasks() {
        for (Unit unit : unitList) {
            if (unit instanceof Structure) {
                Structure structure = (Structure) unit;
                System.out.println(structure.getClass().getSimpleName() +
                                   " is breakable: " +
                                   structure.isBreakable()
                );
            } else if (unit instanceof Tank) {
                Tank tank = (Tank)unit;
                System.out.println("Tank actions: ");
                tank.move();
                tank.fire();
                tank.reload();
            } else if (unit instanceof Soldier) {
                Soldier soldier = (Soldier)unit;
                System.out.println("Soldier actions: ");
                soldier.move();
                soldier.fire();
            }
        }
    }

    public void add(Unit unit) {
        unitList.add(unit);
    }

    public void printUnitList() {
        System.out.println("Unit list: ");
        for (Unit unit : unitList) {
            System.out.println(unit.toString());
        }
        System.out.println("");
    }
}
