package me.anomalousrei.infected.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class RoundStartEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    public RoundStartEvent() {
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}
