package org.example;

public class Main {
    enum Planet {
        MERCURY(0, 0, 2439.7),
        VENUS(1, 30.2, 6051.8),
        EARTH(2, 42.8, 6371),
        MARS(3, 78.9, 3389.5),
        JUPITER(4, 628.7, 69911),
        SATURN(5, 1275.4, 58232),
        URANUS(6, 2723.4, 25362),
        NEPTUNE(7, 1447.6, 24622);

        private int sequenceNumber;
        private double distanceFromPreviousPlanet;
        private double distanceFromSun;
        private double radius;
        private Planet previousPlanet;
        private Planet nextPlanet;

        Planet(int sequenceNumber, double prevDistance, double radius) {
            this.sequenceNumber = sequenceNumber;
            this.distanceFromPreviousPlanet = prevDistance;
            this.radius = radius;

            if (sequenceNumber > 0) {
                previousPlanet = Planet.values()[sequenceNumber - 1];
                distanceFromSun = previousPlanet.distanceFromSun + prevDistance;

                if (sequenceNumber < Planet.values().length - 1) {
                    nextPlanet = Planet.values()[sequenceNumber + 1];
                }
            } else {
                distanceFromSun = prevDistance;
            }
        }

    }


}