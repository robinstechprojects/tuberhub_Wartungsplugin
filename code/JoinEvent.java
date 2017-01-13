package eu.techup.tuberhub.wartungspl;

import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class JoinEvent
  implements Listener
{
  @SuppressWarnings("deprecation")
@EventHandler
  public void onJoin(ServerConnectEvent e)
  {
    if (Main.isWartung)
    {
      if (e.getPlayer().hasPermission("Bungee.CanJoin"))
      {
        e.setCancelled(false);
      }
      else
      {
        e.setCancelled(true);
        e.getPlayer().disconnect("Wartungsarbeiten!\n\nDas Netzwerk ist gerade im Wartungs Modus!\n\nEs werden gerade Wartungen durchgeführt\n\nWir bitten um Geduld!");
      }
    }
    else {
      e.setCancelled(false);
    }
  }
}
