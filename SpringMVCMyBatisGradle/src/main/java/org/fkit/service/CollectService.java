package org.fkit.service;

import java.util.List;

import org.fkit.domain.Collect;

public interface CollectService {
	


	List<Collect> getAll(String username);

	void deletecollect(int goodid);
	Collect newcollect(int goodid, String good_name, Double price, String image, String username);



    Collect collectFind(String username, int goodid);

}