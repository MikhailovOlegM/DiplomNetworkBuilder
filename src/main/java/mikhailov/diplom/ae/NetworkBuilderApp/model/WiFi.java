package mikhailov.diplom.ae.NetworkBuilderApp.model;

import java.util.List;

public class WiFi {

    private String type;
    private String id;
    private String name;
    private String interfaceWifi;
    private String mac;
    private String IPv4;
    private String IPv6;
    private String routing;
    private String acl;
    private String dhcp;
    private String nat;
    private List<String> connectedDevice;

    public WiFi(String type, String id, String name, String interfaceWifi, String mac,
            String IPv4, String IPv6, String routing, String acl, String dhcp, String nat,
            List<String> connectedDevice) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.interfaceWifi = interfaceWifi;
        this.mac = mac;
        this.IPv4 = IPv4;
        this.IPv6 = IPv6;
        this.routing = routing;
        this.acl = acl;
        this.dhcp = dhcp;
        this.nat = nat;
        this.connectedDevice = connectedDevice;
    }
}
