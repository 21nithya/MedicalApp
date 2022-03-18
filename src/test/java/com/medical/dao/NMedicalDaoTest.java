package com.medical.dao;

import medicalShop.MedicalClass;

public class NMedicalDaoTest {
	public static void main(String[] args)throws Exception {
		MedicalClass medicalClass = new MedicalClass();
		 medicalClass.setId (1);
		 medicalClass.setName ("nithya");
		 medicalClass.setEmail ("n21@gmail.com");
		 medicalClass.setPassword ( "nk");
		 medicalClass.setContact ("123456789");
		 System.out.println(medicalClass);
		 medicalDao m1 = new medicalDao();
		 m1. MedicalClassList(medicalClass);
		 
	
}

}
