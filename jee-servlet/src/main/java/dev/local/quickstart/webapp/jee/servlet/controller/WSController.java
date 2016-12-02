package dev.local.quickstart.webapp.jee.servlet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.*;

@ServerEndpoint("/api/ws/{id}")
public class WSController {

  private static final Logger log = LoggerFactory.getLogger(WSController.class);

  private static Set<Session> peers = Collections.synchronizedSet(new HashSet<Session>());

  @OnOpen
  public void onOpen(Session peer) {
    peers.add(peer);
  }

  @OnClose
  public void onClose(Session peer) {
    peers.remove(peer);
  }

  @OnMessage
  public String onMessage(String message, @PathParam("id")String id) {
    callPeers(message);
    return null;
  }

  private void callPeers(String msg) {

    Iterator<Session> iterator = peers.iterator();

    while (iterator.hasNext()) {
      Session session = iterator.next();
      try {
        if (session.isOpen()) session.getBasicRemote().sendText(msg);
        else peers.remove(session);
      } catch (Exception e) {
        log.error("call peer error: {}", e);
      }
    }
  }

}
