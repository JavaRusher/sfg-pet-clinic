package edu.javarush.sfgpetclinic.service.springdatajpa;

import edu.javarush.sfgpetclinic.model.Visit;
import edu.javarush.sfgpetclinic.repository.VisitRepository;
import edu.javarush.sfgpetclinic.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService  implements VisitService {

    private final VisitRepository VisitRepository;

    public VisitSDJpaService(VisitRepository VisitRepository) {
        this.VisitRepository = VisitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        VisitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long id) {
        return VisitRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return VisitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        VisitRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        VisitRepository.deleteById(id);
    }
}
