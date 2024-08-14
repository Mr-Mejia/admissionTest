package com.sprint3.admission_test.application.ports.in;

import com.sprint3.admission_test.domain.model.Medication;
import com.sprint3.admission_test.domain.model.MedicationTemp;

import java.time.LocalDate;

public interface IMedicationUseCase {
    Medication getMedicationById(Long id);
    Medication addMedication();
    Medication getMedicationsNextToEndByCategoryId(String name, LocalDate expiration_date);
}
