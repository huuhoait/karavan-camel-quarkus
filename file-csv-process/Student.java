//usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS io.quarkus:quarkus-bom:2.16.0.Final@pom
//DEPS org.apache.camel.quarkus:quarkus-camel-bom:2.16.0@pom
//DEPS org.apache.camel.quarkus:camel-quarkus-bindy:2.16.0
package org.camel.karavan.demo.postman;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",")
public class Student {

    @DataField(pos = 1)
    int id;

   

    @DataField(pos = 2)
    String firstName;

    @DataField(pos = 3)
    String lastName;

    @DataField(pos = 4)
    String phoneNumber;

    @DataField(pos = 5)
    String updatedTimeStamp;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ". firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
                + phoneNumber + "]";
    }

    public String getUpdatedTimeStamp() {
        return updatedTimeStamp;
    }

    public void setUpdatedTimeStamp(String updatedTimeStamp) {
        this.updatedTimeStamp = updatedTimeStamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

}