package com.example.manytomany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessoryRepo extends JpaRepository<Accessory, Long> {
}
