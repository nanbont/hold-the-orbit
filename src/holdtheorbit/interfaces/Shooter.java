package holdtheorbit.interfaces;

import java.util.List;
import holdtheorbit.entities.EnemyProjectile;

public interface Shooter {
    List<EnemyProjectile> collectPendingShots();
}