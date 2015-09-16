package ozone.service;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import ozone.domain.Product;

//import com.force.sdk.jpa.annotation.CustomField;

public class CategoryService {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

    private String name;
    
    //@CustomField(externalId=true)
    private String freebaseId;

    @OneToMany(mappedBy="category")
    private List<Product> products;

    public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFreebaseId() {
		return freebaseId;
	}

	public void setFreebaseId(String freebaseId) {
		this.freebaseId = freebaseId;
	}

    
}
