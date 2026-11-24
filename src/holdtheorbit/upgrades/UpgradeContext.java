package holdtheorbit.upgrades;

import holdtheorbit.entities.Alien;
import holdtheorbit.entities.Spaceship;
import holdtheorbit.util.EntityManager;

public class UpgradeContext {

    private final Spaceship player;
    private final EntityManager<Alien> aliens;

    public UpgradeContext(Spaceship player, EntityManager<Alien> aliens) {
        this.player = player;
        this.aliens = aliens;
    }

    public Spaceship getPlayer() { return player; }
    public EntityManager<Alien> getAliens() { return aliens; }
}