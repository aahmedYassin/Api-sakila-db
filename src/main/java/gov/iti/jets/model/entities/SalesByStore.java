package gov.iti.jets.model.entities;
// Generated Apr 3, 2023, 5:27:06 AM by Hibernate Tools 6.1.7.Final


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * SalesByStore generated by hbm2java
 */
@Entity
@Table(name="sales_by_store"
    ,catalog="sakila"
)
public class SalesByStore  implements java.io.Serializable {


     private SalesByStoreId id;

    public SalesByStore() {
    }

    public SalesByStore(SalesByStoreId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="manager", column=@Column(name="manager", length=91) ), 
        @AttributeOverride(name="store", column=@Column(name="store", length=101) ), 
        @AttributeOverride(name="totalSales", column=@Column(name="total_sales", precision=27, scale=2) ) } )
    public SalesByStoreId getId() {
        return this.id;
    }
    
    public void setId(SalesByStoreId id) {
        this.id = id;
    }




}


