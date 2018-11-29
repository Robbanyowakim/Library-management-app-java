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

        @Override
        public String toString() {
            return "Name: "+name+" SSN: "+ssn+" Address: "+address+" Phone number: "+phoneNumber;
        }
    }
