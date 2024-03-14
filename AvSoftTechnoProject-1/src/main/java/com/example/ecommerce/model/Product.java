package com.example.ecommerce.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Product {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private  BigDecimal price;
	    private String discription;
	    private String image;
	    private BigDecimal discount;
	    
	    
	    @ManyToOne
	    @JoinColumn(name = "category_id", referencedColumnName = "id")
	    private Category category;
	    
	    @ManyToOne
	    @JoinColumn(name = "user_id", referencedColumnName = "id")
	    private User user;
	    
	    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	    private List<Review> reviews = new ArrayList<>();

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}

		public String getDiscription() {
			return discription;
		}

		public void setDiscription(String discription) {
			this.discription = discription;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public BigDecimal getDiscount() {
			return discount;
		}

		public void setDiscount(BigDecimal discount) {
			this.discount = discount;
		}

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public List<Review> getReviews() {
			return reviews;
		}

		public void setReviews(List<Review> reviews) {
			this.reviews = reviews;
		}
	    
	    

}
