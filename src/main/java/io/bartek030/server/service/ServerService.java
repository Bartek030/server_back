package io.bartek030.server.service;

import io.bartek030.server.model.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Server pingServer(String ipAddress) throws IOException;
    Collection<Server> getServerList(int limit);
    Server getServer(Long id);
    Server updateServer(Server server);
    Boolean deleteServer(Long id);
}