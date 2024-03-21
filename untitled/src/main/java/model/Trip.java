package model;

import java.util.Date;

public class Trip {

    private int id;
    private String destination;
    private Date checkIn;
    private Date checkOut;
    private int seats;
    private int category;
    private int distance;


    public Trip() {
    }

    public Trip(int id, String destination, Date checkIn, Date checkOut, int seats, int category, int distance) {
        this.id = id;
        this.destination = destination;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.seats = seats;
        this.category = category;
        this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", seats=" + seats +
                ", category=" + category +
                ", distance=" + distance +
                '}';
    }
}
