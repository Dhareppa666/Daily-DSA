package main.finale.System_Design.LLD.CWA;

import UtilityClasses.Pair;

// Movement strategy interface
public interface MovementStrategy {
    Pair getNextPosition(Pair currentHead, String direction);
}