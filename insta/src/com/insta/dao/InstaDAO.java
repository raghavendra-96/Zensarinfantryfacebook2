package com.insta.dao;

import com.insta.entity.InstaEmployee;

public class InstaDAO implements InstaDAOInterface{
private InstaDAO()
{
}
	public static InstaDAOInterface createDAOObject() {
		// TODO Auto-generated method stub
		return new InstaDAO();
	}

	@Override
	public int createProfileDAO(InstaEmployee ie) {
		// TODO Auto-generated method stub
		return 1;
	}

}
