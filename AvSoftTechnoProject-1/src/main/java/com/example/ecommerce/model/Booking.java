package com.example.ecommerce.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private LocalDateTime startTime;
	    private LocalDateTime endTime;
	    private BigDecimal totalPrice;
	    private String status;
	    
	    @ManyToOne
	    @JoinColumn(name = "user_id", referencedColumnName = "id")
	    private User user;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public LocalDateTime getStartTime() {
			return startTime;
		}

		public void setStartTime(LocalDateTime startTime) {
			this.startTime = startTime;
		}

		public LocalDateTime getEndTime() {
			return endTime;
		}

		public void setEndTime(LocalDateTime endTime) {
			this.endTime = endTime;
		}

		public BigDecimal getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(BigDecimal totalPrice) {
			this.totalPrice = totalPrice;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
	    
	    

}
