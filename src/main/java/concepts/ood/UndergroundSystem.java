package concepts.ood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class UndergroundSystem {

    HashMap<String, Trip> checkInMap = new HashMap<>();
    HashMap<String,List<Integer>> checkOutMap = new HashMap<>();


    static class Trip {
        Integer id;
        String station;
        Integer time;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getStation() {
            return station;
        }

        public void setStation(String station) {
            this.station = station;
        }

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        Trip(Integer id, String station, Integer time) {
            this.id = id;
            this.station = station;
            this.time = time;
        }

        @Override
        public String toString() {
            return "Trip{" +
                    "id='" + id + '\'' +
                    ", station='" + station + '\'' +
                    ", time=" + time +
                    '}';
        }


    }



    public UndergroundSystem() {

    }

    public void checkIn(int id, String stationName, int t) {
        String key = String.valueOf(id);
        Trip trip = new Trip(id, stationName, t);
        checkInMap.put(key, trip);
    }

    public void checkOut(int id, String stationName, int t) {
        String lookupKey = String.valueOf(id);
        System.out.println("Lookup with " + lookupKey);
        System.out.println("Checkin map = " +checkInMap);
        Trip startTrip = checkInMap.get(lookupKey);
        System.out.println("Found Start Trip = " + startTrip);
        if( startTrip != null ) {
            int timeTaken = t - startTrip.getTime();
            String insertKey = startTrip.getStation() + "-" + stationName;
            List<Integer> times;
            if( checkOutMap.containsKey(insertKey)) {
                times = checkOutMap.get(insertKey);
            } else {
                times = new ArrayList<>();
            }
            times.add(timeTaken);
            checkOutMap.put(insertKey, times);
            checkInMap.remove(lookupKey);
        } else {
            System.out.println("No start trip found for station = " +stationName );
        }

    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "-" + endStation;
        if( !checkOutMap.containsKey(key) || checkOutMap.get(key).size() == 0) {
            return 0.0;
        }
        List<Integer> times = checkOutMap.get(key);

        double allTimes = times.stream().reduce(0, Integer::sum).doubleValue();

        return allTimes / times.size();

    }
}