package com.dorciboss.model;

public class Reservation {

    private int id;
    private int idUser;
    private int idTrip;
    private double price;
    private int noOfPersons;

    public Reservation(int id, int idUser, int idTrip, double price, int noOfPersons) {
        this.id = id;
        this.idUser = idUser;
        this.idTrip = idTrip;
        this.price = price;
        this.noOfPersons = noOfPersons;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdTrip() {
        return idTrip;
    }

    public void setIdTrip(int idTrip) {
        this.idTrip = idTrip;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoOfPersons() {
        return noOfPersons;
    }

    public void setNoOfPersons(int noOfPersons) {
        this.noOfPersons = noOfPersons;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", idUser=" + idUser +
                ", idTrip=" + idTrip +
                ", price=" + price +
                ", noOfPersons=" + noOfPersons +
                '}';
    }
}
