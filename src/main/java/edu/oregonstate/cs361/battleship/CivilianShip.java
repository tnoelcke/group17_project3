package edu.oregonstate.cs361.battleship;

/**
 * Created by Garrett on 2/24/2017.
 */
public class CivilianShip extends Ship {
        CivilianShip(String n, int l, Coordinate s, Coordinate e, boolean stealth) {
            super(n,l,s,e,stealth);
        }

        public boolean checkIfSunk() {
            int shipHits = returnCounter();
            if (counter > 0)
                shipSunk = true;
            else
                shipSunk = false;
            return shipSunk;
        }
}
