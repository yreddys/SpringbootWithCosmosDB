package com.cosmos.entity;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import lombok.Data;

@Data
@Container(containerName = "employees") // Name of the Cosmos container
public class Employee {

	@Id
	private String id;
	@PartitionKey
	private String department;
	private String name;
	private int age;

}
