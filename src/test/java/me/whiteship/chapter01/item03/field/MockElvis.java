package me.whiteship.chapter01.item03.field;

import me.easytodo.chapter01.item03.field.IElvis;

public class MockElvis implements IElvis {
    @Override
    public void leaveTheBuilding() {

    }

    @Override
    public void sing() {
        System.out.println("You ain't nothin' but a hound dog.");
    }
}
