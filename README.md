
# Hold the Orbit

A 2D space-defender game written in pure Java (Swing), built as an OOP final project at the University of Rijeka.

Defend your orbit: your ship auto-fires at waves of aliens, collects power-ups (spread gun, shield) and faces a boss.

## Status
🚧 Work in progress: being built class by class.

## OOP principles used
- Encapsulation (private fields, getters)
- Inheritance (Projectile → PlayerProjectile / EnemyProjectile, Weapon → StandardWeapon / SpreadWeapon)
- Abstraction (abstract classes, interfaces)
- Polymorphism (one `fire()` call, different weapons)
- Composition (the ship *has* a weapon and a shield)

## How to run
javac -d out $(find src -name "*.java")
java -cp out holdtheorbit.Main