package io.bartek030.server.service;

import io.bartek030.server.model.Server;

import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Server pingServer(String ipAddress);
    Collection<Server> serverList(int limit);
    Server getServer(Long id);
    Server updateServer(Server server);
    Boolean deleteServer(Long id);
}