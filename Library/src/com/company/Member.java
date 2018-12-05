package com.company;

    public class Member {
        private String ssn;
        private String name;
        private String address;
        private String phoneNumber;

        public Member (String ssn,String name,String address,String phoneNumber){
            this.ssn = ssn;
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        public String getSsn() {
            return ssn;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setSsn(String ssn) {
            this.ssn = ssn;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return "|| Name: "+name+" || SSN: "+ssn+" || Address: "+address+" || Phone number: "+phoneNumber;
        }
    }
