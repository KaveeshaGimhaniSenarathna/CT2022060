package Q4;

public class Main {

    public static void main(String[] args) {

        Owner owner1 = new Owner("Kamal", "0771234567");

        Bicycle bike = new Bicycle(owner1);

        System.out.println("Owner Name: " + bike.getOwner().getOwnerName());
        System.out.println("Phone Number: " + bike.getOwner().getPhoneNo());
    }
}
