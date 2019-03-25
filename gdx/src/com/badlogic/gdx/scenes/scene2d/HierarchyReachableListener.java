package com.badlogic.gdx.scenes.scene2d;

public abstract class HierarchyReachableListener implements EventListener {
    @Override
    public boolean handle(Event event) {
        if (event instanceof HierarchyReachableEvent) {
            handle((HierarchyReachableEvent) event);
            return true;
        }
        return false;
    }

    public abstract void handle(HierarchyReachableEvent event);
}
