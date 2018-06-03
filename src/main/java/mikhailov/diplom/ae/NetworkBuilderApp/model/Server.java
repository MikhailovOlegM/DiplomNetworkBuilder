package mikhailov.diplom.ae.NetworkBuilderApp.model;

import java.util.List;

public class Server {

    private String type;
    private String id;
    private String name;
    private String interfaceObj;
    private String mac;
    private String IPv4;
    private String IPv6;
    private String service;
    private String os;
    private List<String> connectedDevices;

    public Server(String type, String id, String name, String interfaceObj, String mac,
            String IPv4, String IPv6, String service, String os,
            List<String> connectedDevices) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.interfaceObj = interfaceObj;
        this.mac = mac;
        this.IPv4 = IPv4;
        this.IPv6 = IPv6;
        this.service = service;
        this.os = os;
        this.connectedDevices = connectedDevices;
    }
}
