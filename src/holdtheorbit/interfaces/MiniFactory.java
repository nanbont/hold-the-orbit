package holdtheorbit.interfaces;

import holdtheorbit.entities.Alien;

public interface MiniFactory {
    Alien create(double x, double y);
}