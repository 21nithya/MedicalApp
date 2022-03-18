package com.medicalShop.vali;
import medicalShop.MedicalClass;

public class MedicalValidation {

	public static void validateMedicalClass(MedicalClass medicalClass) throws Exception {
		if (medicalClass.getId () <= 0){
			throw new Exception("invalid Id");
		}
		else if (medicalClass.getName() ==null) {
			throw new Exception("invalid Name");
		}
		else if (medicalClass.getEmail() ==null) {
			throw new Exception("invalid Email");
		}
		else if (medicalClass.getPassword() ==null) {
			throw new Exception("password must have minium 8 characters");
		}
		else if (medicalClass.getContact()==null) {
			throw new Exception("invalid contact");
		}
		System.out.println("validation passed");
	}

}