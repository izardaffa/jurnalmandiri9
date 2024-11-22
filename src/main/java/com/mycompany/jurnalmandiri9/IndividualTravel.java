package com.mycompany.jurnalmandiri9;

public class IndividualTravel extends Travel {
    private int maxPeople;

    public IndividualTravel(String travelCode, String cityName, String flight, int maxPeople) {
        super(travelCode, cityName, flight, "Individual Travel");
        this.maxPeople = maxPeople;
    }

    @Override
    public void setReserved(int reserved) {
        if (reserved < 1) {
            System.out.println("[Error] Harap pesan setidaknya 1 orang");
        } else {
            if (super.getReserved() + reserved <= maxPeople) {
                super.setReserved(reserved);
            } else {
                System.out.println("[Error] Tidak dapat memesan lebih dari jumlah maksimum orang.");
            }
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "N/A | " + maxPeople + " orang | " + getReserved() + " orang";
    }
}
