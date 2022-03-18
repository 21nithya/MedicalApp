package com.medicalShop.vali;

import medicalShop.MedicalClass;

public class MedicalValiTest {

	public static void main(String[] args) throws Exception {
		 MedicalClass medicalClass = new MedicalClass();
		 medicalClass.setId (1);
		 medicalClass.setName ("nithya");
		 medicalClass.setEmail ("nithya21@gmail.com");
		 medicalClass.setPassword ( "nithya");
		 medicalClass.setContact ("123456789");
		 System.out.println(medicalClass);
		 MedicalValidation.validateMedicalClass(MedicalClass);

	}

}
