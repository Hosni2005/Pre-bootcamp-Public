package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
    
    private ArrayList<String> patientNotes;

    public Physician(Integer id) {
        this.id = id;
        this.patientNotes = new ArrayList<String>();
    }

    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

   

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        return this.id.equals(confirmedAuthID);
    }

    public ArrayList<String> getPatientNotes() {
        return patientNotes;
    }

    public void setPatientNotes(ArrayList<String> patientNotes) {
        this.patientNotes = patientNotes;
    }

	@Override
	public boolean assignPin(int pin) {
		if (String.valueOf(pin).length() != 4) {
            return false;
        }
        this.pin = pin;
		return true;
	}

	@Override
	public boolean assignPIN(int pin) {
		// TODO Auto-generated method stub
		if (String.valueOf(pin).length() != 4) {
            return false;
        }
        this.pin = pin;
		return true;
	}
}