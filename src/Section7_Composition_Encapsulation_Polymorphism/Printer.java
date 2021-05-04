package Section7_Composition_Encapsulation_Polymorphism;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel < -1 || tonerLevel > 100) {
            tonerLevel = -1;
        }
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount < 1 || this.tonerLevel + tonerAmount > 100){
         return -1;
            }
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages){
       int pagesToPrint = pages;
       if (duplex){
           System.out.println("Printing in duplex mode");
           pagesToPrint = pages / 2 + pages % 2;
       }
       this.pagesPrinted += pagesToPrint;
       return pagesToPrint;
       }
       public int getPagesPrinted(){
        return this.pagesPrinted;
       }
    }

