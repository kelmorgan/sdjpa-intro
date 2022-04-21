package com.kelmorgan.sdjpaintro.repositories;

import com.kelmorgan.sdjpaintro.domain.AuthorUuid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorUuidRepository extends JpaRepository<AuthorUuid, UUID> {
}
