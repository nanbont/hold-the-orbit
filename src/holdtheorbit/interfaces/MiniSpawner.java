package holdtheorbit.interfaces;

import java.util.List;
import holdtheorbit.entities.Alien;

public interface MiniSpawner {
    List<Alien> collectPendingChildren();
}