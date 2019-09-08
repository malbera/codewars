package com.codewars.kata;

import java.util.List;

public class SumOfK {

    static class CityMeta {
        final int maxAllowedDistance;
        final int [] citiesByDistance;

        CityMeta(int maxAllowedDistance, int[] citiesByDistance) {
            this.maxAllowedDistance = maxAllowedDistance;
            this.citiesByDistance = citiesByDistance;
        }
    }

    static class BestCityTrip {
        final CityMeta meta;
        final int citiesToVisit;
        final int cityDistance;
        final int currentPosition;
        final BestCityTrip nextCity;

        BestCityTrip(CityMeta meta,
                     int citiesToVisit,
                     int cityDistance,
                     int currentPosition,
                     BestCityTrip nextCity) {
            this.meta = meta;
            this.citiesToVisit = citiesToVisit;
            this.cityDistance = cityDistance;
            this.currentPosition = currentPosition;
            this.nextCity = nextCity;
        }

        BestCityTrip addCity(int cityDistance, int currentPosition) {
            return new BestCityTrip(meta, citiesToVisit - 1, cityDistance, currentPosition + 1, this);
        }

        int calculateDistance() {
            return nextCity == null ? cityDistance : cityDistance + nextCity.calculateDistance();
        }
    }

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        int[] cityDistance = ls.stream().mapToInt(i -> i).toArray();

        CityMeta meta = new CityMeta(t, cityDistance);
        BestCityTrip cityTrip = new BestCityTrip(meta, k, 0, 0, null);

        int result = calculateCityDistance(cityTrip);
        return result == -1 ? null : result;
    }

    static int calculateCityDistance(BestCityTrip trip) {
        int result = -1;
        for (int i = trip.currentPosition; i <= trip.meta.citiesByDistance.length - trip.citiesToVisit; i++) {
            if (trip.citiesToVisit == 1) {
                int tmp = trip.calculateDistance() + trip.meta.citiesByDistance[i];
                if (tmp == trip.meta.maxAllowedDistance) {
                    return tmp;
                }
                if (tmp > result && tmp <= trip.meta.maxAllowedDistance) {
                    result = tmp;
                }
                continue;
            }
            int tmp = calculateCityDistance(trip.addCity(trip.meta.citiesByDistance[i], i));
            if (tmp > result) {
                result = tmp;
            }
        }
        return result;
    }

}
