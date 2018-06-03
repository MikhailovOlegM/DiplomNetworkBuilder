package mikhailov.diplom.ae.NetworkBuilderApp.model;

import java.util.List;

public class Router {

    private String type;
    private String id;
    private String name;
    private String interfaceObj;
    private String mac;
    private String IPv4;
    private String IPv6;
    private String routing;
    private String acl;
    private String dhcp;
    private String nat;
    private List<VRRP> vrrp;
    private List<String> connectedDevice;

    public Router(String type, String id, String name, String interfaceObj, String mac,
            String IPv4, String IPv6, String routing, String acl, String dhcp, String nat,
            List<VRRP> vrrp, List<String> connectedDevice) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.interfaceObj = interfaceObj;
        this.mac = mac;
        this.IPv4 = IPv4;
        this.IPv6 = IPv6;
        this.routing = routing;
        this.acl = acl;
        this.dhcp = dhcp;
        this.nat = nat;
        this.vrrp = vrrp;
        this.connectedDevice = connectedDevice;
    }

    public class VRRP {

        private String type;
        private String address;

        public VRRP(String type, String address) {
            this.type = type;
            this.address = address;
        }
    }
}
