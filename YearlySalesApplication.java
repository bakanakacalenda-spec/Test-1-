public class YearlySalesApplication {
    public static void main(String[] args) {
        String[] city = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        int[][] consoles = {{1000, 2000, 3000}, {2000, 3000, 4000}, {1500, 1100, 1200}};

        String maxcity = " ";
        int total = 0;

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\tps5\t\t\t\t\tXBOX\t\t\t\tSWITCH");

        for (int i = 0; i < city.length; i++) {
            System.out.printf("%-16s\t%-16d\t%-16d\t%-16d\n", city[i], consoles[i][0], consoles[i][1], consoles[i][2]);
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY ");
        System.out.println("-----------------------------------------------------------------------------");

        for (int i = 0; i < city.length; i++) {
            int Total = consoles[i][0] + consoles[i][1] + consoles[i][2];

            System.out.printf("%-16s\t%-16d\n", city[i], Total);
        }
    }
}
