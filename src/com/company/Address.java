package com.company;

public class Address {

    private String streetNumber;
    private String streetName;
    private String aditionalAddressLine;
    private String zipCode;
    private String state;


    public Address(String streetNumber, String streetName, String aditionalAddressLine, String zipCode, String state) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.aditionalAddressLine = aditionalAddressLine;
        this.zipCode = zipCode;
        this.state = state;

    }


        public String getStreetNumber() {
            return streetNumber;
        }

        public String getStreetName() {
            return streetName;
        }

        public String getAditionalAddressLine() {
            return aditionalAddressLine;
        }

        public String getZipCode() {
            return zipCode;
        }

        public String getState() {
            return state;
        }


    }






