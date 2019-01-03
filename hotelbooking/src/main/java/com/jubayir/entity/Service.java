package com.jubayir.entity;

import javax.persistence.*;

@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "resturant")
    private String resturant;

    @Column(name = "swimmingPool")
    private String swimmingPool;

    @Column(name = "shopping_center")
    private String shoppingCenter;

    @Column(name = "business_center")
    private String businessCenter;

    @Column(name = "health_club")
    private String healthClub;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResturant() {
        return resturant;
    }

    public void setResturant(String resturant) {
        this.resturant = resturant;
    }

    public String getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public String getShoppingCenter() {
        return shoppingCenter;
    }

    public void setShoppingCenter(String shoppingCenter) {
        this.shoppingCenter = shoppingCenter;
    }

    public String getBusinessCenter() {
        return businessCenter;
    }

    public void setBusinessCenter(String businessCenter) {
        this.businessCenter = businessCenter;
    }

    public String getHealthClub() {
        return healthClub;
    }

    public void setHealthClub(String healthClub) {
        this.healthClub = healthClub;
    }
}
