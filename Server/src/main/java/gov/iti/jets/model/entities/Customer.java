package gov.iti.jets.model.entities;
// Generated Apr 3, 2023, 5:27:06 AM by Hibernate Tools 6.1.7.Final


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name="customer"
    ,catalog="sakila"
)
public class Customer  implements java.io.Serializable {


     private Short customerId;
     private Store store;
     private Address address;
     private String firstName;
     private String lastName;
     private String email;
     private boolean active;
     private Timestamp createDate;
     private Timestamp lastUpdate;
     private Set<Payment> payments = new HashSet<Payment>(0);
     private Set<Rental> rentals = new HashSet<Rental>(0);

    public Customer() {
    }

	
    public Customer(Store store, Address address, String firstName, String lastName, boolean active, Timestamp createDate) {
        this.store = store;
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
        this.createDate = createDate;
    }
    public Customer(Store store, Address address, String firstName, String lastName, String email, boolean active, Timestamp createDate, Timestamp lastUpdate, Set<Payment> payments, Set<Rental> rentals) {
       this.store = store;
       this.address = address;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.active = active;
       this.createDate = createDate;
       this.lastUpdate = lastUpdate;
       this.payments = payments;
       this.rentals = rentals;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="customer_id", unique=true, nullable=false)
    public Short getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(Short customerId) {
        this.customerId = customerId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="store_id", nullable=false)
    public Store getStore() {
        return this.store;
    }
    
    public void setStore(Store store) {
        this.store = store;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="address_id", nullable=false)
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }

    
    @Column(name="first_name", nullable=false, length=45)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="last_name", nullable=false, length=45)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="email", length=50)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="active", nullable=false)
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_date", nullable=false, length=19)
    public Timestamp getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_update", length=19)
    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="customer")
    public Set<Payment> getPayments() {
        return this.payments;
    }
    
    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="customer")
    public Set<Rental> getRentals() {
        return this.rentals;
    }
    
    public void setRentals(Set<Rental> rentals) {
        this.rentals = rentals;
    }




}


