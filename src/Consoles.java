public abstract class Consoles implements IConsoles {
    protected String consoleType;
    protected int totalSales;


    public Consoles(String consoleType,int totalSales){
        this.consoleType= consoleType;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsolesType() {
        return "";
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }

    @Override
    public String getStore() {
        return "";
    }
}
