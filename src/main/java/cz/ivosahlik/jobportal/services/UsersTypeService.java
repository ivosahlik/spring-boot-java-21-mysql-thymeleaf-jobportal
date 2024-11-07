package cz.ivosahlik.jobportal.services;

import cz.ivosahlik.jobportal.entity.UsersType;
import cz.ivosahlik.jobportal.repository.UsersTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UsersTypeService {

    private final UsersTypeRepository usersTypeRepository;

    public List<UsersType> getAll() {
        return usersTypeRepository.findAll();
    }
}
