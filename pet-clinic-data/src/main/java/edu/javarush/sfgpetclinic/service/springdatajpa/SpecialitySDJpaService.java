package edu.javarush.sfgpetclinic.service.springdatajpa;

import edu.javarush.sfgpetclinic.model.Speciality;
import edu.javarush.sfgpetclinic.repository.PetRepository;
import edu.javarush.sfgpetclinic.repository.PetTypeRepository;
import edu.javarush.sfgpetclinic.repository.SpecialityRepository;
import edu.javarush.sfgpetclinic.service.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {

    private final SpecialityRepository SpecialityRepository;

    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public SpecialitySDJpaService(SpecialityRepository SpecialityRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.SpecialityRepository = SpecialityRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        SpecialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long id) {
        return SpecialityRepository.findById(id).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return SpecialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        SpecialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        SpecialityRepository.deleteById(id);

    }
}

