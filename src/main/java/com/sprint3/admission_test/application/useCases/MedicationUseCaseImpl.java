package com.sprint3.admission_test.application.useCases;

import com.sprint3.admission_test.application.ports.in.IMedicationUseCase;
import com.sprint3.admission_test.application.ports.out.IMedicationRepository;
import com.sprint3.admission_test.domain.exceptions.NotFoundException;
import com.sprint3.admission_test.domain.model.Medication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class MedicationUseCaseImpl implements IMedicationUseCase {

    @Autowired
    private IMedicationRepository medicationRepository;

    @Override
    public Medication getMedicationById(Long id) {
        return medicationRepository.findById(id).orElseThrow(() -> new NotFoundException(
                "Could not find medication with ID: " + id
        ));
    }

    @Override
    public Medication addMedication() {
        //validacion existencia categoria
        return null;
    }

    @Override
    public Medication getMedicationsNextToEndByCategoryId(String category, LocalDate date) {
        return null;
        /*return medicationRepository.findByCategory(category).orElseThrow(() -> new NotFoundException(
                "Could not find medication with Category: " + category + " or or this date: " + date
        ));*/
    }
}
