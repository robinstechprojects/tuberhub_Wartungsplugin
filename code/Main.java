package eu.techup.tuberhub.wartungspl;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class Main
  extends Plugin
{
  public static boolean isWartung = false;
  
  public void onEnable()
  {
    ProxyServer.getInstance().getPluginManager().registerListener(this, new ServerPing(this));
    ProxyServer.getInstance().getPluginManager().registerListener(this, new JoinEvent());
    ProxyServer.getInstance().getPluginManager().registerCommand(this, new Wartung("wartung"));
  }
}
