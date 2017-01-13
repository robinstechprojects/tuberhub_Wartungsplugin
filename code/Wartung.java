package eu.techup.tuberhub.wartungspl;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Wartung
  extends Command
{
  public Wartung(String name)
  {
    super(name);
  }
  
  @SuppressWarnings("deprecation")
public void execute(CommandSender sender, String[] args)
  {
    if (args.length == 0)
    {
      ProxiedPlayer p = (ProxiedPlayer)sender;
      p.sendMessage("------------------------------------------");
      p.sendMessage("Wartung an:  /wartung on");
      p.sendMessage("Wartung aus: /wartung off");
      p.sendMessage("------------------------------------------");
      return;
    }
    if (args.length == 1)
    {
      ProxiedPlayer p = (ProxiedPlayer)sender;
      if (p.hasPermission("bungee.change"))
      {
        if (args[0].equalsIgnoreCase("on")) {
          if (!Main.isWartung)
          {
            Main.isWartung = true;
            p.sendMessage("Du hast den Wartungs Mode aktiviert");
          }
          else
          {
            p.sendMessage("Der Wartungs Modus ist bereits an!");
          }
        }
      }
      else {
        p.sendMessage("Du hast keie Rechte");
      }
      if (p.hasPermission("bungee.change"))
      {
        if (args[0].equalsIgnoreCase("off")) {
          if (Main.isWartung)
          {
            Main.isWartung = false;
            p.sendMessage("Du hast den Wartungs Mode deaktiviert");
          }
          else
          {
            p.sendMessage("Der Wartungs Modus ist nicht an");
          }
        }
      }
      else {
        p.sendMessage("Du hast keine Rechte");
      }
    }
  }
}
