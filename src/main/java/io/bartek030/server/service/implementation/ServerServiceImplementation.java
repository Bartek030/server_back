package io.bartek030.server.service.implementation;

import io.bartek030.server.model.Server;
import io.bartek030.server.repository.ServerRepository;
import io.bartek030.server.service.ServerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@RequiredArgsConstructor // implement constructor without need to code
@Service
@Transactional
@Slf4j
public class ServerServiceImplementation implements ServerService {
    private final ServerRepository serverRepository;

    @Override
    public Server create(final Server server) {
        log.info("Saving new server: {}", server.getName());
        server.setImageUrl(setServerImageUrl());
        return null;
    }

    @Override
    public Server pingServer(final String ipAddress) {
        return null;
    }

    @Override
    public Collection<Server> serverList(final int limit) {
        return null;
    }

    @Override
    public Server getServer(final Long id) {
        return null;
    }

    @Override
    public Server updateServer(final Server server) {
        return null;
    }

    @Override
    public Boolean deleteServer(final Long id) {
        return null;
    }
}
