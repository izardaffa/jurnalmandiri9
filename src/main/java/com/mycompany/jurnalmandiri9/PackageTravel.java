package com.mycompany.jurnalmandiri9;

public class PackageTravel extends Travel {
    private int minPeople;

    public PackageTravel(String travelCode, String cityName, String flight, int minPeople) {
        super(travelCode, cityName, flight, "Paket Travel");
        this.minPeople = minPeople;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + minPeople + " orang | N/A | " + getReserved() + " orang";
    }
}
