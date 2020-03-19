package com.projectmanager.microservices.tasksservice.entities;

public class Status {

	long completed;
	long total;

	public long getCompleted() {
		return completed;
	}

	public void setCompleted(long completed) {
		this.completed = completed;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

}
