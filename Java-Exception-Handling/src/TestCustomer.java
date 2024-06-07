class InvalidInputException extends Exception{
    String error;
    InvalidInputException(String error){
        this.error=error;
    }
    public String toString(){
        return "Exception occurred due to "+error;
    }
}
class Customer{
    private String custNo;
    private String custName;
    private String category;
    Customer(String custNo, String custName,String category) throws InvalidInputException{
        if(custNo.charAt(0)!='C'&& custNo.charAt(0)!='c')
            throw new InvalidInputException("Customer number");
        this.custNo=custNo;
        if(custName.length()<3)
            throw new InvalidInputException("Customer name");
        this.custName=custName;
        if(category.equalsIgnoreCase("Platinum")||category.equalsIgnoreCase("Gold")||category.equalsIgnoreCase("Silver"))
            this.category=category;
        else
            throw new InvalidInputException("Category");
    }

    public String getCategory() {
        return category;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustNo() {
        return custNo;
    }
}
public class TestCustomer {
    public static void main(String[] args) {
        try{
            Customer c1=new Customer("C0001","Sneha","Gold");
            System.out.println("Customer Name:"+c1.getCustName());
            System.out.println("Customer No:"+c1.getCustNo());
            System.out.println("Category:"+c1.getCategory());
        }
        catch(InvalidInputException e){
            System.out.println(e);
        }
    }
}
