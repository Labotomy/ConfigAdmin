import org.bukkit.plugin.java.JavaPlugin;
// Annotation plugin.yml replacement
import org.bukkit.plugin.java.annotation.plugin.*;
import org.bukkit.plugin.java.annotation.plugin.author.Author;
import org.bukkit.plugin.java.annotation.command.*;
import org.bukkit.plugin.java.annotation.permission.*;
import org.bukkit.permissions.PermissionDefault;

@Plugin(name="ConfigAdmin", version="0.0.1")
@ApiVersion(ApiVersion.Target.v1_18)
@Author("LowOnEspresso")
@Description( "Configuration Administration")
@Website("https://github.com/Labotomy/ConfigAdmin")
@LogPrefix("CAdmin")
// @LoadBefore(plugin = "Essentials")
@Command(name = "foo", desc = "Foo command", aliases = {"foobar", "fubar"}, permission = "test.foo", permissionMessage = "You do not have permission!", usage = "/<command> [test|stop]")
@Permission(name = "test.*", desc = "Wildcard foo permission", defaultValue = PermissionDefault.OP)
@Permission(name = "test.*", desc = "Wildcard permission", children = {@ChildPermission(name ="test.foo")})

public class configAdmin extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }
}
