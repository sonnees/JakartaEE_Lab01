package vn.edu.iuh.fit.BackEnd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.BackEnd.entity.Address;
import vn.edu.iuh.fit.BackEnd.repositories.AddressRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

}
