public class ConsoleSales extends Consoles{
    public ConsoleSales (String consoleType, int totalSales){
        super(consoleType,totalSales);
    }
    public void printConsoleTypeReport(){

        System.out.println("CONSOLE SALES REPORT");
        System.out.println("*************************");
        System.out.println("CONSOLE TYPE:"+ getConsolesType());
        System.out.println("STORE:" + getStore());
        System.out.println("TOTAL SALES:" + getTotalSales());
    }
}
