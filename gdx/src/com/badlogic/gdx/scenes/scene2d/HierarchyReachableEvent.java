package com.badlogic.gdx.scenes.scene2d;

public class HierarchyReachableEvent extends Event {
    private boolean reachable;

    void setReachable(boolean reachable) {
        this.reachable = reachable;
    }

    public boolean becameReachable() {
        return reachable;
    }

    public boolean becameUnreachable() {
        return !reachable;
    }
}
