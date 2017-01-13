package eu.techup.tuberhub.wartungspl;

import net.md_5.bungee.api.ServerPing.Protocol;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class ServerPing
  implements Listener
{
  Main plugin;
  
  public ServerPing(Main plugin)
  {
    this.plugin = plugin;
  }
  
  @SuppressWarnings("deprecation")
@EventHandler
  public void on(ProxyPingEvent e)
  {
    if (Main.isWartung)
    {
      net.md_5.bungee.api.ServerPing conn = e.getResponse();
      conn.setVersion(new Protocol("Wartungsarbeiten", 2));
      conn.setDescription("Wir sind gerade in Wartungen!");
      conn.setFavicon("Wartungen");
      e.setResponse(conn);
    }
  }
}
