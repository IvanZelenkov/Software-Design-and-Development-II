package Chapter17Practice;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getInvoiceValue(){
        return quantity * Math.round(price * 100.0) / 100.0;
    }

    public static void printHeader(){

        System.out.println(String.format("%-12s %-30s %-10s %-10s","Part Number","Part Description","Quantity","Price"));
    }

    public String toString() {

        return String.format("%-12s %-30s %-10s %-10s",getPartNumber(),getPartDescription(),getQuantity(),getPrice() );
    }


}