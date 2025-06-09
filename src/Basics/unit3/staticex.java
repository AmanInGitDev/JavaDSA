class device {
    String name;
    ;
    static int price;
    static String brand;
    static String name1;
    public device() {
        brand = "Samsung";
        name = "oneplus";
        price = 50;

    }

    // Here we are making these name variable common to all object
    // Something you are making a class member not object member

    public void show() {
        System.out.println("Name: " + name + " Price: " + price + " Brand: " + brand);
    }
}

   public class staticex {
        public static void main(String[] args) {
            device d1 = new device();
            d1.name1 = "Galxaxy S23";
            d1.price = 50000;
            device.brand = "Samsung";

            device d2 = new device();
            d2.name1 = "Galxaxy S24";
            d2.price = 60000;
            device.brand = "Samsung";

            d1.show();
            d2.show();

            device.name1 = "44000";
        }
    }
