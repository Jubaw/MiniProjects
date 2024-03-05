package salescontrol;

import java.util.Date;

public class Sale {
    private double price;
    private Date date;
    private String apartmentName;
    private double commissionPercentage;
    private Date commissionPaymentDate;

    // Constructor is now private and accepts a Builder object
   /* private Sale(Builder builder) {
        this.price = builder.price;
        this.date = builder.date;
        this.apartmentName = builder.apartmentName;
        this.commissionPercentage = builder.commissionPercentage;
        this.commissionPaymentDate = builder.commissionPaymentDate;
    }

    // Getters here (not shown for brevity)

    // Static Builder class
    public static class Builder {
        private double price;
        private Date date;
        private String apartmentName;
        private double commissionPercentage;
        private Date commissionPaymentDate;

        // Public constructor for Builder
        public Builder() {}

        // Methods to set properties, returning the Builder itself for chaining
        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        public Builder apartmentName(String apartmentName) {
            this.apartmentName = apartmentName;
            return this;
        }

        public Builder commissionPercentage(double commissionPercentage) {
            this.commissionPercentage = commissionPercentage;
            return this;
        }

        public Builder commissionPaymentDate(Date commissionPaymentDate) {
            this.commissionPaymentDate = commissionPaymentDate;
            return this;
        }

        public Sale build() {
            return new Sale(this); // Correctly passing the Builder instance to the private Sale constructor
        }
    }*/
}
