package session16.btth.de2.cau3;

public abstract class Property {
    protected String propertyId;
    protected String address;
    protected double area;
    protected double basePrice;

    public Property() {
    }

    public Property(String propertyId, String address, double area, double basePrice) {
        this.propertyId = propertyId;
        this.address = address;
        this.area = area;
        this.basePrice = basePrice;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public abstract double totalPrice();
}

