package Associationsinjava;

public class OTOsetterorder {
    private String orderid;
    private String ordername;
    private int orderstatus;
    private OTOsettercustomer customer;

    public String getOrderid(){
        return orderid;
    }
    public void setOrderid(String s){
        this.orderid= orderid;
    }
    public String getOrdername(){
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }
    public String getordestatus(){
        return ordername;
    }

    public void setOrderstatus(String delivered){
        this.orderstatus=orderstatus;
    }
    public OTOsettercustomer getCustomer(){
        return customer;
    }
     public void setOTOsettercustomer( OTOsettercustomer customer){
        this.customer=customer;
     }


    public void getOrderDetails(){
        System.out.println("Order Details");
        System.out.println("--------------------");
        System.out.println("Order Id: " + orderid);
        System.out.println("Order Name: " + ordername);
        System.out.println("Order Status: " + orderstatus);
        System.out.println();


        System.out.println("Customer Details");
        System.out.println("--------------------");
        System.out.println("Customer Id: " + customer.getCustomerid());
        System.out.println("Customer Name: " + customer.getCustomername());
        System.out.println("Customer Address: " + customer.getCustomeraddress());
    }

    public static void main(String[] args) {
        OTOsettercustomer customer = new OTOsettercustomer();
        customer.setCustomerid("C-111");
        customer.setCustomername("Durga");
        customer.setCustomeraddress("23/3rt, S R Nagar, Hyd-38");


        OTOsetterorder order = new OTOsetterorder();
        order.setOrderid("O-111");
        order.setOrdername("Electronics Order");
        order.setOrderstatus("Delivered");
        order.setOTOsettercustomer(customer);

        order.getOrderDetails();





    }




}
