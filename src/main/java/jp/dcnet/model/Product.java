package jp.dcnet.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	private long product_id;
	private String name;
	
	@Column(name = "attribute_name")
	private String attributeName;
	
	@Column(name = "attribute_value")
	private String attributeValue;
	
	private String description;
	
	@Column(name = "public_status")
	private boolean publicStatus;
	
	@Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;
    
    @Column(name = "new_icon")
	private boolean newIcon;
    
    @Column(name = "popular_icon")
	private boolean popularIcon;
	
	
//    public Product(long product_id, String name) {
//		this.product_id = product_id;
//		this.name = name;
//	}


	
	public Product() {
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublicStatus() {
		return publicStatus;
	}

	public void setPublicStatus(boolean publicStatus) {
		this.publicStatus = publicStatus;
	}
	
	public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

	public boolean isNewIcon() {
		return newIcon;
	}

	public void setNewIcon(boolean newIcon) {
		this.newIcon = newIcon;
	}

	public boolean isPopularIcon() {
		return popularIcon;
	}

	public void setPopularIcon(boolean popularIcon) {
		this.popularIcon = popularIcon;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
}
