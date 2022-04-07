package io.bartek030.server.repository;

import io.bartek030.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

// for manipulating data in database <class = table name, table ID>
// JpaRepository has a few methods for querying/modifying records in database
public interface ServerRepository extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
