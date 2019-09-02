package com.insta.service;

import com.insta.dao.InstaDAO;
import com.insta.dao.InstaDAOInterface;
import com.insta.entity.InstaEmployee;

public class InstaService implements InstaServiceInterface {
private InstaService()
{
	
}

@Override
public int createProfile(InstaEmployee ie) {
	// TODO Auto-generated method stub
	InstaDAOInterface id=InstaDAO.createDAOObject();
	return id.createProfileDAO(ie);
}

public static InstaServiceInterface createServiceObject() {
	// TODO Auto-generated method stub
	return new InstaService();
}







}
