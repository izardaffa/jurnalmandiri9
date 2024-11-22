package com.mycompany.jurnalmandiri9;

public class Travel {
    private String travelCode;
    private String cityName;
    private String flight;
    private String travelType;
    private int reserved;
    
    public Travel(String travelCode, String cityName, String flight, String travelType) {
        this.travelCode = travelCode;
        this.cityName = cityName;
        this.flight = flight;
        this.travelType = travelType;
    }

    public String getTravelCode() {
        return travelCode;
    }

    public String getTravelType() {
        return travelType;
    }

    public void setReserved(int reserved) {
        if (reserved < 1) {
            System.out.println("[Error] Harap pesan setidaknya 1 orang");
        } else {
            this.reserved += reserved;
            System.out.println("Pesanan untuk " + reserved + " orang berhasil dibuat");
        }
    }

    public int getReserved() {
        return reserved;
    }

    public String toString() {
        return travelCode + " | " + cityName + " | " + flight + " | " + travelType + " | ";
    }
}
