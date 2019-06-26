package com.mvc.model;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class DataService {

	public List<String> getProgrammers(){
		List<String> l=new ArrayList();
		l.add("Deepak");
		l.add("Rahul");
		l.add("Naman");
		l.add("Peter");
		l.add("Jack");
		
		return l;
	}
}
