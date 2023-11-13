package com.example.manytomany;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.ObjectInputFilter;
import java.util.UUID;

@Service
@Transactional
public class ConfigService {

    private final ConfigRepository configRepository;
    private final AccessoryRepo accessoryRepo;

    public ConfigService(ConfigRepository configRepository, AccessoryRepo accessoryRepo) {
        this.configRepository = configRepository;
        this.accessoryRepo = accessoryRepo;
    }


    public void save(boolean test) {

        Accessory a1 = this.accessoryRepo.findById(1L).orElse(new Accessory().setName("test1"));
        Accessory a2 = this.accessoryRepo.findById(2L).orElse(new Accessory().setName("test2"));


        Config c = new Config();
        c.setName("cfg" + UUID.randomUUID());
        c.addAccessory(a1);
        c.addAccessory(a2);

        if(test) {
            Accessory a3 = new Accessory().setName("test3");
            c.addAccessory(a3);
        }

        configRepository.save(c);

    }
}
