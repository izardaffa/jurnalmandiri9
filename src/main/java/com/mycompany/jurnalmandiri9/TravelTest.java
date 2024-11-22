package com.mycompany.jurnalmandiri9;

public class TravelTest {
    public static void main(String[] args) {
        Travel[] productList = new Travel[5];

        productList[0] = new IndividualTravel("TRV001", "Munich", "German Airlines", 10);
        productList[1] = new IndividualTravel("TRV002", "Praha", "AirFrance", 20);
        productList[2] = new PackageTravel("TRV003", "LA", "Delta Airlines", 8);
        productList[3] = new IndividualTravel("TRV004", "Osaka", "Korean Air", 15);
        productList[4] = new PackageTravel("TRV005", "Shanghai", "Southern Airlines", 12);

        boolean exit = false;

        while (!exit) {
            printMenu();
            String input = DataUtil.getStringInput();

            switch (input) {
                case "1":
                    System.out.println("====================================================================================");
                    System.out.println("Kode Travel | Nama Kota | Penerbangan | Jenis Travel | Minimum | Maximum | Reservasi");
                    
                    for (int i = 0; i < productList.length; i++) {
                        System.out.println(productList[i].toString());
                    }

                    System.out.println("====================================================================================");

                    break;

                case "2":
                    System.out.println("====================================================================================");
                    System.out.println("Kode Travel | Nama Kota | Penerbangan | Jenis Travel | Minimum | Maximum | Reservasi");
                    
                    for (int i = 0; i < productList.length; i++) {
                        if (productList[i].getTravelType() == "Individual Travel") {
                            System.out.println(productList[i].toString());
                        }
                    }

                    System.out.println("====================================================================================");

                    break;
                    
                case "3":
                    System.out.println("====================================================================================");
                    System.out.println("Kode Travel | Nama Kota | Penerbangan | Jenis Travel | Minimum | Maximum | Reservasi");
                    
                    for (int i = 0; i < productList.length; i++) {
                        if (productList[i].getTravelType() == "Paket Travel") {
                            System.out.println(productList[i].toString());
                        }
                    }

                    System.out.println("====================================================================================");

                    break;
                    
                case "4":
                    String travelCode;
                    int reserved;
                    boolean isFind = false;

                    System.out.print(">> Input kode travel yang akan dipesan : ");
                    travelCode = DataUtil.getStringInput();

                    for (int i = 0; i < productList.length; i++) {
                        if (productList[i].getTravelCode().equals(travelCode)) {
                            System.out.print(">> Input jumlah orang yang akan dipesan : ");
                            reserved = DataUtil.getIntegerInput();

                            productList[i].setReserved(reserved);
                            isFind = true;
                            
                            break;
                        }
                    }

                    if (!isFind) {
                        System.out.println("[Error] Kode yang diinput salah.");
                    }

                    break;
                    
                case "9":
                    System.out.println(">> Selesai.");
                    exit = true;

                    break;

                default:
                    System.out.println(">> Silahkan input kembali.");
                    break;
            }
        }
    }

    public static void printMenu() {
        printHeader();
        System.out.println("1. Periksa semua produk travel");
        System.out.println("2. Periksa produk individual");
        System.out.println("3. Permintaan produk paket travel");
        System.out.println("4. Reservasi produk travel");
        System.out.println("9. End");
        printSeparator();
        System.out.print("## Input Menu : ");
    }

    public static void printHeader() {
        System.out.println("=======  <Menu>  =======");
    }

    public static void printSeparator() {
        System.out.println("========================");
    }
}
